package orz.teamfelnull.mineguns.handler;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import orz.teamfelnull.mineguns.block.MGBlocks;
import orz.teamfelnull.mineguns.entity.MGEntitys;
import orz.teamfelnull.mineguns.item.MGItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegistry(final RegistryEvent.Register<Item> e) {
		MGItems.registerItem(e.getRegistry());
		MGBlocks.registerItem(e.getRegistry());
	}

	@SubscribeEvent
	public static void onBlockRegistry(final RegistryEvent.Register<Block> e) {
		MGBlocks.registerBlock(e.getRegistry());
	}

	@SubscribeEvent
	public static void onEntityTypeRegistry(final RegistryEvent.Register<EntityType<?>> e) {
		MGEntitys.registerEntityType(e.getRegistry());
	}
}
