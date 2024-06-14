
package com.maksimys.changed_end.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class WeirdRealmItem extends RecordItem {
	public WeirdRealmItem() {
		super(15, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("changed_end:music.weird_realm")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2400);
	}
}
