package org.felnull.mineguns.block;

import org.felnull.mineguns.MineGuns;
import org.felnull.mineguns.item.MGItemGroup;

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
		registryBlock(r, TEST_BLOCK);
	}

	public static void registerItem(IForgeRegistry<Item> r) {
		registryBlockItem(r, TEST_BLOCK, MGItemGroup.MINEGUN_TAB);
	}

	private static void registryBlock(IForgeRegistry<Block> r, Block b) {
		MineGuns.LOGGER.info("Registering Block : " + b.getRegistryName());
		r.register(b);
	}

	private static void registryBlockItem(IForgeRegistry<Item> r, Block b, ItemGroup tab) {
		MineGuns.LOGGER.info("Registering BlockItem : " + b.getRegistryName());
		r.register(new BlockItem(b, new Item.Properties().group(tab)).setRegistryName(b.getRegistryName()));
	}
}
