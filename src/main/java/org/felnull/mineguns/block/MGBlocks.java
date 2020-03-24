package org.felnull.mineguns.block;

import org.felnull.mineguns.MGItemGroup;
import org.felnull.mineguns.MineGuns;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.IForgeRegistry;

public class MGBlocks {
	public static Block TEST_BLOCK = new Block(Block.Properties.create(Material.ROCK))
			.setRegistryName(MineGuns.MODID, "test_block");

	public static void registerBlock(IForgeRegistry<Block> r) {
		r.register(TEST_BLOCK);
	}

	public static void registerItem(IForgeRegistry<Item> r) {
		registryBlockItem(r, TEST_BLOCK, MGItemGroup.MINEGUN_TAB);
	}

	public static void registryBlockItem(IForgeRegistry<Item> r, Block b, ItemGroup tab) {
		MineGuns.LOGGER.info("Registering BlockItem : " + b.getRegistryName());
		r.register(new BlockItem(b, new Item.Properties().group(tab)).setRegistryName(b.getRegistryName()));
	}
}
