package orz.teamfelnull.mineguns.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import orz.teamfelnull.mineguns.item.GunItem;

public class GunHelper {

	public static void setShotCooldwon(ItemStack item, int value) {
		CompoundNBT nbt = item.getOrCreateTag();
		nbt.putInt("ShotCooldwon", value);

	}

	public static int getShotCooldwon(ItemStack item) {
		CompoundNBT nbt = item.getTag();

		if (nbt != null)
			return nbt.getInt("ShotCooldwon");

		return 0;
	}

	public static boolean isSemiAuto(ItemStack item) {
		if (!(item.getItem() instanceof GunItem))
			return false;

		GunItem gun = (GunItem) item.getItem();

		return gun.getGun().isBaseSemiAuto();
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

	public static float getBlaze(ItemStack item) {
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
}
