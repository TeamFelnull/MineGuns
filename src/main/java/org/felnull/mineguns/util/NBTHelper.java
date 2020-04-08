package org.felnull.mineguns.util;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;

public class NBTHelper {
	public static ResourceLocation readResourceLocation(CompoundNBT tag, String key) {

		return new ResourceLocation(tag.getString(key));
	}

	public static void writeResourceLocation(CompoundNBT tag, ResourceLocation value, String key) {
		tag.putString(value.toString(), key);
	}
}
