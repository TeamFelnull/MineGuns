package org.felnull.mineguns.item;

import org.felnull.mineguns.MGItemGroup;
import org.felnull.mineguns.MineGuns;
import org.felnull.mineguns.gun.MGGuns;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class MGItems {
	public static Item TEST_ITEM = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "test_item");

	public static Item TEST_GUN = new GunItem(new Item.Properties().group(MGItemGroup.MINEGUN_TAB), MGGuns.TEST)
			.setRegistryName(MineGuns.MODID, "test_gun");

	public static Item TMP_GUN = new GunItem(new Item.Properties().group(MGItemGroup.MINEGUN_TAB), MGGuns.TMP)
			.setRegistryName(MineGuns.MODID, "tmp");

	public static Item HK433_GUN = new GunItem(new Item.Properties().group(MGItemGroup.MINEGUN_TAB), MGGuns.HK433)
			.setRegistryName(MineGuns.MODID, "hk433");

	public static Item IRON_GEAR = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "iron_gear");

	public static Item IRON_PLATE = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "iron_plate");

	public static void registerItem(IForgeRegistry<Item> r) {
		// test
		r.register(TEST_ITEM);
		r.register(TEST_GUN);
		r.register(TMP_GUN);
		r.register(HK433_GUN);
		r.register(IRON_GEAR);
		r.register(IRON_PLATE);

	}
}
