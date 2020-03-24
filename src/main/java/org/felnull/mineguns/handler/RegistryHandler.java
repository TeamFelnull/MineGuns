package org.felnull.mineguns.handler;

import org.felnull.mineguns.MineGuns;
import org.felnull.mineguns.block.MGBlocks;
import org.felnull.mineguns.entity.MGEntitys;
import org.felnull.mineguns.item.MGItems;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegistry(final RegistryEvent.Register<Item> e) {
		MGItems.registerItem(e.getRegistry());
		MGBlocks.registerItem(e.getRegistry());
	}

	@SubscribeEvent
	public static void onBlockRegistry(final RegistryEvent.Register<Block> e) {
		MineGuns.LOGGER.info("Block Registry...");
		MGBlocks.registerBlock(e.getRegistry());
	}

	@SubscribeEvent
	public static void onEntityTypeRegistry(final RegistryEvent.Register<EntityType<?>> e) {
		MineGuns.LOGGER.info("EntityType Registry...");
		MGEntitys.registerEntityType(e.getRegistry());
	}
}
