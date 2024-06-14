
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.maksimys.changed_end.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import com.maksimys.changed_end.block.TallCorruptedRootsBlock;
import com.maksimys.changed_end.block.StrippedCorruptedLogBlock;
import com.maksimys.changed_end.block.SmoothObsidianBlock;
import com.maksimys.changed_end.block.SmoothEndStoneBricksBlock;
import com.maksimys.changed_end.block.PurpurwallBlock;
import com.maksimys.changed_end.block.PurpurBricksStairsBlock;
import com.maksimys.changed_end.block.PurpurBricksSlabBlock;
import com.maksimys.changed_end.block.PurpurBricksBlock;
import com.maksimys.changed_end.block.ObsidianPillarBlock;
import com.maksimys.changed_end.block.LightTiledPurpurBlock;
import com.maksimys.changed_end.block.EngravedEndStoneBricksBlock;
import com.maksimys.changed_end.block.EndStoneTilesBlock;
import com.maksimys.changed_end.block.EndStoneTileStairsBlock;
import com.maksimys.changed_end.block.EndStoneTileSlabBlock;
import com.maksimys.changed_end.block.EndStonePillarBlock;
import com.maksimys.changed_end.block.DarkTiledPurpurBlock;
import com.maksimys.changed_end.block.DarkPurpurBlock;
import com.maksimys.changed_end.block.CrackedEndStoneBricksBlock;
import com.maksimys.changed_end.block.CorruptedTrapdoorBlock;
import com.maksimys.changed_end.block.CorruptedStairsBlock;
import com.maksimys.changed_end.block.CorruptedSlabBlock;
import com.maksimys.changed_end.block.CorruptedRootsBlock;
import com.maksimys.changed_end.block.CorruptedPressurePlateBlock;
import com.maksimys.changed_end.block.CorruptedPlanksBlock;
import com.maksimys.changed_end.block.CorruptedNyliumBlock;
import com.maksimys.changed_end.block.CorruptedLogBlock;
import com.maksimys.changed_end.block.CorruptedLeavesBlock;
import com.maksimys.changed_end.block.CorruptedFenceGateBlock;
import com.maksimys.changed_end.block.CorruptedFenceBlock;
import com.maksimys.changed_end.block.CorruptedDoorBlock;
import com.maksimys.changed_end.block.CorruptedButtonBlock;
import com.maksimys.changed_end.block.ChiseledObsidianBlock;
import com.maksimys.changed_end.block.ChiseledEndStoneBricksBlock;
import com.maksimys.changed_end.ChangedEndMod;

public class ChangedEndModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, ChangedEndMod.MODID);
	public static final DeferredHolder<Block, Block> SMOOTH_END_STONE_BRICKS = REGISTRY.register("smooth_end_stone_bricks", () -> new SmoothEndStoneBricksBlock());
	public static final DeferredHolder<Block, Block> ENGRAVED_END_STONE_BRICKS = REGISTRY.register("engraved_end_stone_bricks", () -> new EngravedEndStoneBricksBlock());
	public static final DeferredHolder<Block, Block> END_STONE_TILES = REGISTRY.register("end_stone_tiles", () -> new EndStoneTilesBlock());
	public static final DeferredHolder<Block, Block> END_STONE_TILE_SLAB = REGISTRY.register("end_stone_tile_slab", () -> new EndStoneTileSlabBlock());
	public static final DeferredHolder<Block, Block> END_STONE_TILE_STAIRS = REGISTRY.register("end_stone_tile_stairs", () -> new EndStoneTileStairsBlock());
	public static final DeferredHolder<Block, Block> END_STONE_PILLAR = REGISTRY.register("end_stone_pillar", () -> new EndStonePillarBlock());
	public static final DeferredHolder<Block, Block> CHISELED_END_STONE_BRICKS = REGISTRY.register("chiseled_end_stone_bricks", () -> new ChiseledEndStoneBricksBlock());
	public static final DeferredHolder<Block, Block> CRACKED_END_STONE_BRICKS = REGISTRY.register("cracked_end_stone_bricks", () -> new CrackedEndStoneBricksBlock());
	public static final DeferredHolder<Block, Block> PURPUR_BRICKS = REGISTRY.register("purpur_bricks", () -> new PurpurBricksBlock());
	public static final DeferredHolder<Block, Block> PURPUR_BRICK_SLAB = REGISTRY.register("purpur_brick_slab", () -> new PurpurBricksSlabBlock());
	public static final DeferredHolder<Block, Block> PURPUR_BRICK_STAIRS = REGISTRY.register("purpur_brick_stairs", () -> new PurpurBricksStairsBlock());
	public static final DeferredHolder<Block, Block> LIGHT_TILED_PURPUR = REGISTRY.register("light_tiled_purpur", () -> new LightTiledPurpurBlock());
	public static final DeferredHolder<Block, Block> DARK_TILED_PURPUR = REGISTRY.register("dark_tiled_purpur", () -> new DarkTiledPurpurBlock());
	public static final DeferredHolder<Block, Block> DARK_PURPUR = REGISTRY.register("dark_purpur", () -> new DarkPurpurBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_NYLIUM = REGISTRY.register("corrupted_nylium", () -> new CorruptedNyliumBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_LOG = REGISTRY.register("corrupted_log", () -> new CorruptedLogBlock());
	public static final DeferredHolder<Block, Block> STRIPPED_CORRUPTED_LOG = REGISTRY.register("stripped_corrupted_log", () -> new StrippedCorruptedLogBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_PLANKS = REGISTRY.register("corrupted_planks", () -> new CorruptedPlanksBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_SLAB = REGISTRY.register("corrupted_slab", () -> new CorruptedSlabBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_STAIRS = REGISTRY.register("corrupted_stairs", () -> new CorruptedStairsBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_FENCE = REGISTRY.register("corrupted_fence", () -> new CorruptedFenceBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_BUTTON = REGISTRY.register("corrupted_button", () -> new CorruptedButtonBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_TRAPDOOR = REGISTRY.register("corrupted_trapdoor", () -> new CorruptedTrapdoorBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_FENCE_GATE = REGISTRY.register("corrupted_fence_gate", () -> new CorruptedFenceGateBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_DOOR = REGISTRY.register("corrupted_door", () -> new CorruptedDoorBlock());
	public static final DeferredHolder<Block, Block> PURPUR_WALL = REGISTRY.register("purpur_wall", () -> new PurpurwallBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_PRESSURE_PLATE = REGISTRY.register("corrupted_pressure_plate", () -> new CorruptedPressurePlateBlock());
	public static final DeferredHolder<Block, Block> CHISELED_OBSIDIAN = REGISTRY.register("chiseled_obsidian", () -> new ChiseledObsidianBlock());
	public static final DeferredHolder<Block, Block> OBSIDIAN_PILLAR = REGISTRY.register("obsidian_pillar", () -> new ObsidianPillarBlock());
	public static final DeferredHolder<Block, Block> SMOOTH_OBSIDIAN = REGISTRY.register("smooth_obsidian", () -> new SmoothObsidianBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_LEAVES = REGISTRY.register("corrupted_leaves", () -> new CorruptedLeavesBlock());
	public static final DeferredHolder<Block, Block> CORRUPTED_ROOTS = REGISTRY.register("corrupted_roots", () -> new CorruptedRootsBlock());
	public static final DeferredHolder<Block, Block> TALL_CORRUPTED_ROOTS = REGISTRY.register("tall_corrupted_roots", () -> new TallCorruptedRootsBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
