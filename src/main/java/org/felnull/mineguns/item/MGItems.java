package org.felnull.mineguns.item;

import org.felnull.mineguns.MGItemGroup;
import org.felnull.mineguns.MineGuns;
import org.felnull.mineguns.gun.MGGuns;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class MGItems {
	// Item
	public static Item TEST_ITEM = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "test_item");

	public static Item IRON_GEAR = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "iron_gear");

	public static Item IRON_PLATE = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "iron_plate");

	public static Item BULLET = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "bullet");

	//Gun
	public static Item TEST_GUN = new GunItem(new Item.Properties().group(MGItemGroup.MINEGUN_TAB), MGGuns.TEST)
			.setRegistryName(MineGuns.MODID, "test_gun");

	public static Item TMP_GUN = new GunItem(new Item.Properties().group(MGItemGroup.MINEGUN_TAB), MGGuns.TMP)
			.setRegistryName(MineGuns.MODID, "tmp");

	public static Item HK433_GUN = new GunItem(new Item.Properties().group(MGItemGroup.MINEGUN_TAB), MGGuns.HK433)
			.setRegistryName(MineGuns.MODID, "hk433");

	public static Item MK23_GUN = new GunItem(new Item.Properties().group(MGItemGroup.MINEGUN_TAB), MGGuns.MK23)
			.setRegistryName(MineGuns.MODID, "mk23");

	public static void registerItem(IForgeRegistry<Item> r) {
		registryItem(r, TEST_ITEM);
		registryItem(r, IRON_GEAR);
		registryItem(r, IRON_PLATE);
		registryItem(r, BULLET);
		registryItem(r, TEST_GUN);
		registryItem(r, TMP_GUN);
		registryItem(r, HK433_GUN);
		registryItem(r, MK23_GUN);

	}

	public static void registryItem(IForgeRegistry<Item> r, Item i) {
		MineGuns.LOGGER.info("Registering Item : " + i.getRegistryName());
		r.register(i);
	}
}
