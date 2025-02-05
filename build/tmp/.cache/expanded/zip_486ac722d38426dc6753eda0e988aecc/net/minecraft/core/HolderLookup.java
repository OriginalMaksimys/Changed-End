package net.minecraft.core;

import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.flag.FeatureElement;
import net.minecraft.world.flag.FeatureFlagSet;

public interface HolderLookup<T> extends HolderGetter<T> {
    Stream<Holder.Reference<T>> listElements();

    default Stream<ResourceKey<T>> listElementIds() {
        return this.listElements().map(Holder.Reference::key);
    }

    Stream<HolderSet.Named<T>> listTags();

    default Stream<TagKey<T>> listTagIds() {
        return this.listTags().map(HolderSet.Named::key);
    }

    default HolderLookup<T> filterElements(final Predicate<T> p_256028_) {
        return new HolderLookup.Delegate<T>(this) {
            @Override
            public Optional<Holder.Reference<T>> get(ResourceKey<T> p_255836_) {
                return this.parent.get(p_255836_).filter(p_256496_ -> p_256028_.test(p_256496_.value()));
            }

            @Override
            public Stream<Holder.Reference<T>> listElements() {
                return this.parent.listElements().filter(p_255794_ -> p_256028_.test(p_255794_.value()));
            }
        };
    }

    public static class Delegate<T> implements HolderLookup<T> {
        protected final HolderLookup<T> parent;

        public Delegate(HolderLookup<T> p_256052_) {
            this.parent = p_256052_;
        }

        @Override
        public Optional<Holder.Reference<T>> get(ResourceKey<T> p_256195_) {
            return this.parent.get(p_256195_);
        }

        @Override
        public Stream<Holder.Reference<T>> listElements() {
            return this.parent.listElements();
        }

        @Override
        public Optional<HolderSet.Named<T>> get(TagKey<T> p_256388_) {
            return this.parent.get(p_256388_);
        }

        @Override
        public Stream<HolderSet.Named<T>> listTags() {
            return this.parent.listTags();
        }
    }

    public interface Provider {
        Stream<ResourceKey<? extends Registry<?>>> listRegistries();

        <T> Optional<HolderLookup.RegistryLookup<T>> lookup(ResourceKey<? extends Registry<? extends T>> p_256285_);

        default <T> HolderLookup.RegistryLookup<T> lookupOrThrow(ResourceKey<? extends Registry<? extends T>> p_255957_) {
            return this.<T>lookup(p_255957_).orElseThrow(() -> new IllegalStateException("Registry " + p_255957_.location() + " not found"));
        }

        default HolderGetter.Provider asGetterLookup() {
            return new HolderGetter.Provider() {
                @Override
                public <T> Optional<HolderGetter<T>> lookup(ResourceKey<? extends Registry<? extends T>> p_256379_) {
                    return Provider.this.lookup(p_256379_).map(p_255952_ -> p_255952_);
                }
            };
        }

        static HolderLookup.Provider create(Stream<HolderLookup.RegistryLookup<?>> p_256054_) {
            final Map<ResourceKey<? extends Registry<?>>, HolderLookup.RegistryLookup<?>> map = p_256054_.collect(
                Collectors.toUnmodifiableMap(
                    HolderLookup.RegistryLookup::key,
                    (p_256335_ -> p_256335_)
                )
            );
            return new HolderLookup.Provider() {
                @Override
                public Stream<ResourceKey<? extends Registry<?>>> listRegistries() {
                    return map.keySet().stream();
                }

                @Override
                public <T> Optional<HolderLookup.RegistryLookup<T>> lookup(ResourceKey<? extends Registry<? extends T>> p_255663_) {
                    return Optional.ofNullable((HolderLookup.RegistryLookup<T>)map.get(p_255663_));
                }
            };
        }
    }

    public interface RegistryLookup<T> extends HolderLookup<T>, HolderOwner<T> {
        ResourceKey<? extends Registry<? extends T>> key();

        Lifecycle registryLifecycle();

        default HolderLookup<T> filterFeatures(FeatureFlagSet p_249397_) {
            return (HolderLookup<T>)(FeatureElement.FILTERED_REGISTRIES.contains(this.key())
                ? this.filterElements(p_250240_ -> ((FeatureElement)p_250240_).isEnabled(p_249397_))
                : this);
        }

        @org.jetbrains.annotations.Nullable
        default <A> A getData(net.neoforged.neoforge.registries.datamaps.DataMapType<T, A> attachment, ResourceKey<T> key) {
            return null;
        }

        public abstract static class Delegate<T> implements HolderLookup.RegistryLookup<T> {
            protected abstract HolderLookup.RegistryLookup<T> parent();

            @Override
            public ResourceKey<? extends Registry<? extends T>> key() {
                return this.parent().key();
            }

            @Override
            public Lifecycle registryLifecycle() {
                return this.parent().registryLifecycle();
            }

            @Override
            public Optional<Holder.Reference<T>> get(ResourceKey<T> p_255619_) {
                return this.parent().get(p_255619_);
            }

            @Override
            public Stream<Holder.Reference<T>> listElements() {
                return this.parent().listElements();
            }

            @Override
            public Optional<HolderSet.Named<T>> get(TagKey<T> p_256245_) {
                return this.parent().get(p_256245_);
            }

            @Override
            public Stream<HolderSet.Named<T>> listTags() {
                return this.parent().listTags();
            }

            @Override
            @org.jetbrains.annotations.Nullable
            public <A> A getData(net.neoforged.neoforge.registries.datamaps.DataMapType<T, A> attachment, ResourceKey<T> key) {
                return parent().getData(attachment, key);
            }
        }
    }
}
