package orz.teamfelnull.mineguns.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.IForgeRegistry;
import orz.teamfelnull.mineguns.MineGuns;

public class MGItems {
	public static Item TEST_ITEM = new Item(new Item.Properties().group(ItemGroup.MISC))
			.setRegistryName(MineGuns.MODID, "test_item");

	public static void registerItem(IForgeRegistry<Item> r) {
		r.register(MGItems.TEST_ITEM);
	}
}
