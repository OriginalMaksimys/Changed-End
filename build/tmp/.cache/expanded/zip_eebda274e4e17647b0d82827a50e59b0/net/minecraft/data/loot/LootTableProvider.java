package net.minecraft.data.loot;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.Util;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.RandomSequence;
import net.minecraft.world.level.levelgen.RandomSupport;
import net.minecraft.world.level.storage.loot.LootDataId;
import net.minecraft.world.level.storage.loot.LootDataResolver;
import net.minecraft.world.level.storage.loot.LootDataType;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.slf4j.Logger;

public class LootTableProvider implements DataProvider {
    private static final Logger LOGGER = LogUtils.getLogger();
    private final PackOutput.PathProvider pathProvider;
    private final Set<ResourceLocation> requiredTables;
    private final List<LootTableProvider.SubProviderEntry> subProviders;

    public LootTableProvider(PackOutput p_254123_, Set<ResourceLocation> p_254481_, List<LootTableProvider.SubProviderEntry> p_253798_) {
        this.pathProvider = p_254123_.createPathProvider(PackOutput.Target.DATA_PACK, "loot_tables");
        this.subProviders = p_253798_;
        this.requiredTables = p_254481_;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput p_254060_) {
        final Map<ResourceLocation, LootTable> map = Maps.newHashMap();
        Map<RandomSupport.Seed128bit, ResourceLocation> map1 = new Object2ObjectOpenHashMap<>();
        getTables().forEach(p_288263_ -> p_288263_.provider().get().generate((p_288259_, p_288260_) -> {
                ResourceLocation resourcelocation1 = map1.put(RandomSequence.seedForKey(p_288259_), p_288259_);
                if (resourcelocation1 != null) {
                    Util.logAndPauseIfInIde("Loot table random sequence seed collision on " + resourcelocation1 + " and " + p_288259_);
                }

                p_288260_.setRandomSequence(p_288259_);
                if (map.put(p_288259_, p_288260_.setParamSet(p_288263_.paramSet).build()) != null) {
                    throw new IllegalStateException("Duplicate loot table " + p_288259_);
                }
            }));
        ProblemReporter.Collector problemreporter$collector = new ProblemReporter.Collector();
        ValidationContext validationcontext = new ValidationContext(problemreporter$collector, LootContextParamSets.ALL_PARAMS, new LootDataResolver() {
            @Nullable
            @Override
            public <T> T getElement(LootDataId<T> p_279283_) {
                return (T)(p_279283_.type() == LootDataType.TABLE ? map.get(p_279283_.location()) : null);
            }
        });

        validate(map, validationcontext);

        Multimap<String, String> multimap = problemreporter$collector.get();
        if (!multimap.isEmpty()) {
            multimap.forEach((p_124446_, p_124447_) -> LOGGER.warn("Found validation problem in {}: {}", p_124446_, p_124447_));
            throw new IllegalStateException("Failed to validate loot tables, see logs");
        } else {
            return CompletableFuture.allOf(map.entrySet().stream().map(p_297942_ -> {
                ResourceLocation resourcelocation1 = p_297942_.getKey();
                LootTable loottable = p_297942_.getValue();
                Path path = this.pathProvider.json(resourcelocation1);
                return DataProvider.saveStable(p_254060_, LootTable.CODEC, loottable, path);
            }).toArray(p_253403_ -> new CompletableFuture[p_253403_]));
        }
    }

    public List<LootTableProvider.SubProviderEntry> getTables() {
        return this.subProviders;
    }

    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationcontext) {
        for(ResourceLocation resourcelocation : Sets.difference(this.requiredTables, map.keySet())) {
            validationcontext.reportProblem("Missing built-in table: " + resourcelocation);
        }

        map.forEach((p_278897_, p_278898_) -> {
            p_278898_.validate(validationcontext.setParams(p_278898_.getParamSet()).enterElement("{" + p_278897_ + "}", new LootDataId<>(LootDataType.TABLE, p_278897_)));
        });
    }

    @Override
    public final String getName() {
        return "Loot Tables";
    }

    public static record SubProviderEntry(Supplier<LootTableSubProvider> provider, LootContextParamSet paramSet) {
    }
}
