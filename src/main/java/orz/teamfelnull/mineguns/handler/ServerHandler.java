package orz.teamfelnull.mineguns.handler;

import net.minecraftforge.event.TickEvent.ServerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ServerHandler {

	@SubscribeEvent
	public static void onTick(ServerTickEvent e) {

	}
}
