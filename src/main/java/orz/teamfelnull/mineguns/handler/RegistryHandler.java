package orz.teamfelnull.mineguns.handler;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import orz.teamfelnull.mineguns.item.MGItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemsRegistry(final RegistryEvent.Register<Item> e) {
		MGItems.registerItem(e.getRegistry());
	}
}
