
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.maksimys.changed_end.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.maksimys.changed_end.ChangedEndMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChangedEndModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChangedEndMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ChangedEndModBlocks.SMOOTH_END_STONE_BRICKS.get().asItem());
			tabData.accept(ChangedEndModBlocks.ENGRAVED_END_STONE_BRICKS.get().asItem());
			tabData.accept(ChangedEndModBlocks.END_STONE_TILES.get().asItem());
			tabData.accept(ChangedEndModBlocks.END_STONE_TILE_STAIRS.get().asItem());
			tabData.accept(ChangedEndModBlocks.END_STONE_TILE_SLAB.get().asItem());
			tabData.accept(ChangedEndModBlocks.END_STONE_PILLAR.get().asItem());
			tabData.accept(ChangedEndModBlocks.CHISELED_END_STONE_BRICKS.get().asItem());
			tabData.accept(ChangedEndModBlocks.CRACKED_END_STONE_BRICKS.get().asItem());
			tabData.accept(ChangedEndModBlocks.PURPUR_BRICKS.get().asItem());
			tabData.accept(ChangedEndModBlocks.PURPUR_BRICK_STAIRS.get().asItem());
			tabData.accept(ChangedEndModBlocks.PURPUR_BRICK_SLAB.get().asItem());
			tabData.accept(ChangedEndModBlocks.PURPUR_WALL.get().asItem());
			tabData.accept(ChangedEndModBlocks.LIGHT_TILED_PURPUR.get().asItem());
			tabData.accept(ChangedEndModBlocks.DARK_PURPUR.get().asItem());
			tabData.accept(ChangedEndModBlocks.DARK_TILED_PURPUR.get().asItem());
			tabData.accept(ChangedEndModBlocks.CHISELED_OBSIDIAN.get().asItem());
			tabData.accept(ChangedEndModBlocks.OBSIDIAN_PILLAR.get().asItem());
			tabData.accept(ChangedEndModBlocks.SMOOTH_OBSIDIAN.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_NYLIUM.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_LOG.get().asItem());
			tabData.accept(ChangedEndModBlocks.STRIPPED_CORRUPTED_LOG.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_PLANKS.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_STAIRS.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_SLAB.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_FENCE.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_FENCE_GATE.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_DOOR.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_TRAPDOOR.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_PRESSURE_PLATE.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ChangedEndModBlocks.CORRUPTED_LEAVES.get().asItem());
			tabData.accept(ChangedEndModBlocks.CORRUPTED_ROOTS.get().asItem());
			tabData.accept(ChangedEndModBlocks.TALL_CORRUPTED_ROOTS.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ChangedEndModItems.SHULK.get());
			tabData.accept(ChangedEndModItems.TALL.get());
			tabData.accept(ChangedEndModItems.WEIRD_REALM.get());
			tabData.accept(ChangedEndModItems.NULL.get());
		}
	}
}
