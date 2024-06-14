package com.maksimys.changed_end.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import java.util.Collections;

import com.maksimys.changed_end.init.ChangedEndModBlocks;

@Mod.EventBusSubscriber
public class EndStonegiverecipeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.END_STONE)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_end_stone_tile_slab")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_end_stone_tile_stairs")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_end_stone_brick_wall")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_chiseled_end_stone_bricks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_cracked_end_stone_bricks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_smooth_end_stone_bricks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_engraved_end_stone_bricks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_end_stone_tiles")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_end_stone_pillar")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_smoth_end_stone_bricks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_engraved_end_stone_bricks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_end_stone_tiles")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_end_stone_tile_slab")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_end_stone_tile_stairs")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_end_stone_pillar")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_chiseled_end_stone_bricks")));
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.OBSIDIAN)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_smooth_obsidian")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_obsidian_pillar")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_chiseled_obsidian")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_chiseled_obsidian")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_obsidian_pillar")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_smooth_obsidian")));
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.PURPUR_BLOCK)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_purpur_bricks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_purpur_bricks_stairs")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_purpur_bricks_slab")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_purpur_wall")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_purpur_bricks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_purpur_bricks_slab")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:stonecutting_purpur_bricks_stairs")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_dark_purpur")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_light_tiled_purpur")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_dark_tiled_purpur")));
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ChangedEndModBlocks.CORRUPTED_LOG.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_planks")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_planks_2")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_slab")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_stairs")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_fence")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_fence_gate")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_button")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_pressure_plate")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_trapdoor")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("changed_end:recipe_corrupted_door")));
		}
	}
}
