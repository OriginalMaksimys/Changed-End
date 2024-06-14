
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.maksimys.changed_end.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import com.maksimys.changed_end.item.WeirdRealmItem;
import com.maksimys.changed_end.item.TallItem;
import com.maksimys.changed_end.item.ShulkItem;
import com.maksimys.changed_end.item.MusicDiscItem;
import com.maksimys.changed_end.ChangedEndMod;

public class ChangedEndModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ChangedEndMod.MODID);
	public static final DeferredHolder<Item, Item> SMOOTH_END_STONE_BRICKS = block(ChangedEndModBlocks.SMOOTH_END_STONE_BRICKS);
	public static final DeferredHolder<Item, Item> ENGRAVED_END_STONE_BRICKS = block(ChangedEndModBlocks.ENGRAVED_END_STONE_BRICKS);
	public static final DeferredHolder<Item, Item> END_STONE_TILES = block(ChangedEndModBlocks.END_STONE_TILES);
	public static final DeferredHolder<Item, Item> END_STONE_TILE_SLAB = block(ChangedEndModBlocks.END_STONE_TILE_SLAB);
	public static final DeferredHolder<Item, Item> END_STONE_TILE_STAIRS = block(ChangedEndModBlocks.END_STONE_TILE_STAIRS);
	public static final DeferredHolder<Item, Item> END_STONE_PILLAR = block(ChangedEndModBlocks.END_STONE_PILLAR);
	public static final DeferredHolder<Item, Item> CHISELED_END_STONE_BRICKS = block(ChangedEndModBlocks.CHISELED_END_STONE_BRICKS);
	public static final DeferredHolder<Item, Item> CRACKED_END_STONE_BRICKS = block(ChangedEndModBlocks.CRACKED_END_STONE_BRICKS);
	public static final DeferredHolder<Item, Item> PURPUR_BRICKS = block(ChangedEndModBlocks.PURPUR_BRICKS);
	public static final DeferredHolder<Item, Item> PURPUR_BRICK_SLAB = block(ChangedEndModBlocks.PURPUR_BRICK_SLAB);
	public static final DeferredHolder<Item, Item> PURPUR_BRICK_STAIRS = block(ChangedEndModBlocks.PURPUR_BRICK_STAIRS);
	public static final DeferredHolder<Item, Item> LIGHT_TILED_PURPUR = block(ChangedEndModBlocks.LIGHT_TILED_PURPUR);
	public static final DeferredHolder<Item, Item> DARK_TILED_PURPUR = block(ChangedEndModBlocks.DARK_TILED_PURPUR);
	public static final DeferredHolder<Item, Item> DARK_PURPUR = block(ChangedEndModBlocks.DARK_PURPUR);
	public static final DeferredHolder<Item, Item> CORRUPTED_NYLIUM = block(ChangedEndModBlocks.CORRUPTED_NYLIUM);
	public static final DeferredHolder<Item, Item> CORRUPTED_LOG = block(ChangedEndModBlocks.CORRUPTED_LOG);
	public static final DeferredHolder<Item, Item> STRIPPED_CORRUPTED_LOG = block(ChangedEndModBlocks.STRIPPED_CORRUPTED_LOG);
	public static final DeferredHolder<Item, Item> CORRUPTED_PLANKS = block(ChangedEndModBlocks.CORRUPTED_PLANKS);
	public static final DeferredHolder<Item, Item> CORRUPTED_SLAB = block(ChangedEndModBlocks.CORRUPTED_SLAB);
	public static final DeferredHolder<Item, Item> CORRUPTED_STAIRS = block(ChangedEndModBlocks.CORRUPTED_STAIRS);
	public static final DeferredHolder<Item, Item> CORRUPTED_FENCE = block(ChangedEndModBlocks.CORRUPTED_FENCE);
	public static final DeferredHolder<Item, Item> CORRUPTED_BUTTON = block(ChangedEndModBlocks.CORRUPTED_BUTTON);
	public static final DeferredHolder<Item, Item> CORRUPTED_TRAPDOOR = block(ChangedEndModBlocks.CORRUPTED_TRAPDOOR);
	public static final DeferredHolder<Item, Item> CORRUPTED_FENCE_GATE = block(ChangedEndModBlocks.CORRUPTED_FENCE_GATE);
	public static final DeferredHolder<Item, Item> CORRUPTED_DOOR = doubleBlock(ChangedEndModBlocks.CORRUPTED_DOOR);
	public static final DeferredHolder<Item, Item> PURPUR_WALL = block(ChangedEndModBlocks.PURPUR_WALL);
	public static final DeferredHolder<Item, Item> CORRUPTED_PRESSURE_PLATE = block(ChangedEndModBlocks.CORRUPTED_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> CHISELED_OBSIDIAN = block(ChangedEndModBlocks.CHISELED_OBSIDIAN);
	public static final DeferredHolder<Item, Item> OBSIDIAN_PILLAR = block(ChangedEndModBlocks.OBSIDIAN_PILLAR);
	public static final DeferredHolder<Item, Item> SMOOTH_OBSIDIAN = block(ChangedEndModBlocks.SMOOTH_OBSIDIAN);
	public static final DeferredHolder<Item, Item> CORRUPTED_LEAVES = block(ChangedEndModBlocks.CORRUPTED_LEAVES);
	public static final DeferredHolder<Item, Item> CORRUPTED_ROOTS = block(ChangedEndModBlocks.CORRUPTED_ROOTS);
	public static final DeferredHolder<Item, Item> TALL_CORRUPTED_ROOTS = doubleBlock(ChangedEndModBlocks.TALL_CORRUPTED_ROOTS);
	public static final DeferredHolder<Item, Item> SHULK = REGISTRY.register("shulk", () -> new ShulkItem());
	public static final DeferredHolder<Item, Item> TALL = REGISTRY.register("tall", () -> new TallItem());
	public static final DeferredHolder<Item, Item> WEIRD_REALM = REGISTRY.register("weird_realm", () -> new WeirdRealmItem());
	public static final DeferredHolder<Item, Item> NULL = REGISTRY.register("null", () -> new MusicDiscItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredHolder<Item, Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
