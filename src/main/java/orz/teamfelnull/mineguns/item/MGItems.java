package orz.teamfelnull.mineguns.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import orz.teamfelnull.mineguns.MGItemGroup;
import orz.teamfelnull.mineguns.MineGuns;
import orz.teamfelnull.mineguns.gun.MGGuns;

public class MGItems {
	public static Item TEST_ITEM = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "test_item");

	public static Item IRON_GEAR = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "iron_gear");

	public static Item TEST_GUN = new GunItem(new Item.Properties().group(MGItemGroup.MINEGUN_TAB), MGGuns.TEST)
			.setRegistryName(MineGuns.MODID, "test_gun");
	
	public static Item IRON_PLATE = new Item(new Item.Properties().group(MGItemGroup.MINEGUN_TAB))
			.setRegistryName(MineGuns.MODID, "iron_plate");

	public static void registerItem(IForgeRegistry<Item> r) {
		//test
		r.register(MGItems.TEST_ITEM);
		r.register(MGItems.TEST_GUN);
		r.register(MGItems.IRON_GEAR);
		r.register(MGItems.IRON_PLATE);
	}
}
