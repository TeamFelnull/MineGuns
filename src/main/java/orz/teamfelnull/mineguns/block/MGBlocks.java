package orz.teamfelnull.mineguns.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.IForgeRegistry;
import orz.teamfelnull.mineguns.MGItemGroup;
import orz.teamfelnull.mineguns.MineGuns;

public class MGBlocks {
	public static Block TEST_BLOCK = new Block(Block.Properties.create(Material.ROCK))
			.setRegistryName(MineGuns.MODID, "test_block");
	public static Block IKISUGI_BLOCK = new Block(Block.Properties.create(Material.ROCK))
			.setRegistryName(MineGuns.MODID, "ikisugi_block");

	public static void registerBlock(IForgeRegistry<Block> r) {
		r.register(TEST_BLOCK);
		r.register(IKISUGI_BLOCK);
	}

	public static void registerItem(IForgeRegistry<Item> r) {
		registerBlockItem(r, TEST_BLOCK, MGItemGroup.MINEGUN_TAB);
		registerBlockItem(r, IKISUGI_BLOCK, ItemGroup.MISC);
	}

	public static void registerBlockItem(IForgeRegistry<Item> r, Block b, ItemGroup tab) {
		r.register(new BlockItem(b, new Item.Properties().group(tab)).setRegistryName(b.getRegistryName()));
	}
}