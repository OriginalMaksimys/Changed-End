
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.maksimys.changed_end.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.maksimys.changed_end.ChangedEndMod;

public class ChangedEndModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ChangedEndMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_SHULK = REGISTRY.register("music.shulk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("changed_end", "music.shulk")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_WEIRD_REALM = REGISTRY.register("music.weird_realm", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("changed_end", "music.weird_realm")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_TALL = REGISTRY.register("music.tall", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("changed_end", "music.tall")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_NULL = REGISTRY.register("music.null", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("changed_end", "music.null")));
}
