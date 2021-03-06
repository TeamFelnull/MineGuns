package org.felnull.mineguns.util;

import org.felnull.mineguns.item.GunItem;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class GunHelper {
	public static void setHolding(ItemStack item, Boolean value) {
		CompoundNBT nbt = item.getOrCreateTag();
		nbt.putBoolean("Holding", value);
	}

	public static void setHoldProgress(ItemStack item, int value) {
		CompoundNBT nbt = item.getOrCreateTag();
		nbt.putInt("HoldProgress", value);

	}

	public static void setShotCooldwon(ItemStack item, int value) {
		CompoundNBT nbt = item.getOrCreateTag();
		nbt.putInt("ShotCooldwon", value);

	}

	public static boolean isMaxHolding(ItemStack item) {

		return getHoldProgress(item) == getHold(item);
	}

	public static boolean isHolding(ItemStack item) {
		CompoundNBT nbt = item.getTag();

		if (nbt != null)
			return nbt.getBoolean("Holding");

		return false;
	}

	public static int getHoldProgress(ItemStack item) {
		CompoundNBT nbt = item.getTag();

		if (nbt != null)
			return nbt.getInt("HoldProgress");

		return 0;
	}

	public static int getShotCooldwon(ItemStack item) {
		CompoundNBT nbt = item.getTag();

		if (nbt != null)
			return nbt.getInt("ShotCooldwon");

		return 0;
	}

	public static int getBurst(ItemStack item) {

		if (!(item.getItem() instanceof GunItem))
			return 0;

		GunItem gun = (GunItem) item.getItem();

		return gun.getGun().getBaseBurst();
	}

	public static int getBurstCount(ItemStack item) {

		CompoundNBT nbt = item.getTag();

		if (nbt != null)
			return nbt.getInt("BurstCount");

		return 0;
	}

	public static void setBurstCount(ItemStack item, int value) {
		CompoundNBT nbt = item.getOrCreateTag();
		nbt.putInt("BurstCount", value);

	}

	public static int getCapacity(ItemStack item) {

		if (!(item.getItem() instanceof GunItem))
			return 0;

		GunItem gun = (GunItem) item.getItem();

		return gun.getGun().getBaseCapacity();
	}

	public static float getDamege(ItemStack item) {

		if (!(item.getItem() instanceof GunItem))
			return 0;

		GunItem gun = (GunItem) item.getItem();

		return gun.getGun().getBaseDamege();
	}

	public static float getKnockback(ItemStack item) {
		if (!(item.getItem() instanceof GunItem))
			return 0;
		GunItem gun = (GunItem) item.getItem();

		return gun.getGun().getBaseKnockback();
	}

	public static float getPropulsion(ItemStack item) {
		if (!(item.getItem() instanceof GunItem))
			return 0;
		GunItem gun = (GunItem) item.getItem();
		return gun.getGun().getBasePropulsion();
	}

	public static float getPenetrating(ItemStack item) {
		if (!(item.getItem() instanceof GunItem))
			return 0;
		GunItem gun = (GunItem) item.getItem();
		return gun.getGun().getBasePenetrating();
	}

	public static int getBlaze(ItemStack item) {
		if (!(item.getItem() instanceof GunItem))
			return 0;
		GunItem gun = (GunItem) item.getItem();
		return gun.getGun().getBaseBlaze();
	}

	public static int getEndurance(ItemStack item) {
		if (!(item.getItem() instanceof GunItem))
			return 0;
		GunItem gun = (GunItem) item.getItem();
		return gun.getGun().getBaseEndurance();
	}

	public static float getAccuracy(ItemStack item) {
		if (!(item.getItem() instanceof GunItem))
			return 0;
		GunItem gun = (GunItem) item.getItem();
		return gun.getGun().getBaseAccuracy();
	}

	public static int getHold(ItemStack item) {
		if (!(item.getItem() instanceof GunItem))
			return 0;
		GunItem gun = (GunItem) item.getItem();
		return gun.getGun().getBaseHold();
	}
}
