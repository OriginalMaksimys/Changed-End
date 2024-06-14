package com.maksimys.changed_end.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.Map;

import com.maksimys.changed_end.init.ChangedEndModBlocks;

@Mod.EventBusSubscriber
public class CorruptedNyliumPriShchielchkiePKMPoBlokuProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean foundBlock = false;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		double Variation = 0;
		Variation = Mth.nextInt(RandomSource.create(), 0, 1);
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				for (int index2 = 0; index2 < 3; index2++) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
							&& (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ChangedEndModBlocks.CORRUPTED_NYLIUM.get() && Variation == 0) {
						{
							BlockPos _bp = BlockPos.containing(x, y + 1, z);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, String _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
								}
							}.with(ChangedEndModBlocks.TALL_CORRUPTED_ROOTS.get().defaultBlockState(), "half", "lower"));
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						{
							BlockPos _bp = BlockPos.containing(x, y + 2, z);
							BlockState _bs = (new Object() {
								public BlockState with(BlockState _bs, String _property, String _newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
									return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
								}
							}.with(ChangedEndModBlocks.TALL_CORRUPTED_ROOTS.get().defaultBlockState(), "half", "upper"));
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						world.addParticle(ParticleTypes.COMPOSTER, x, y, z, 0, 1, 0);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
							&& (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ChangedEndModBlocks.CORRUPTED_NYLIUM.get() && Variation == 1) {
						{
							BlockPos _bp = BlockPos.containing(x, y + 1, z);
							BlockState _bs = ChangedEndModBlocks.CORRUPTED_ROOTS.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						world.addParticle(ParticleTypes.COMPOSTER, x, y, z, 0, 1, 0);
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						break;
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ChangedEndModBlocks.CORRUPTED_ROOTS.get()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == ChangedEndModBlocks.TALL_CORRUPTED_ROOTS.get()) {
					break;
				}
			}
			if (true) {
				break;
			}
		}
	}
}
