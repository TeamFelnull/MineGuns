package orz.teamfelnull.mineguns.handler;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.TickEvent.ServerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import orz.teamfelnull.mineguns.item.GunItem;
import orz.teamfelnull.mineguns.util.GunHelper;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ServerHandler {

	@SubscribeEvent
	public static void onTick(ServerTickEvent e) {

	}

	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent e) {

		PlayerEntity pl = e.player;
		Item mainitemstack = pl.getHeldItemMainhand().getItem();
		Item offitemstack = pl.getHeldItemOffhand().getItem();
		if ((mainitemstack instanceof GunItem)) {
			if (GunHelper.getShotCooldwon(pl.getHeldItemMainhand()) >= 1) {
				GunHelper.setShotCooldwon(pl.getHeldItemMainhand(),
						GunHelper.getShotCooldwon(pl.getHeldItemMainhand()) - 1);
			}
		}
		if ((offitemstack instanceof GunItem)) {
			if (GunHelper.getShotCooldwon(pl.getHeldItemOffhand()) >= 1) {
				GunHelper.setShotCooldwon(pl.getHeldItemOffhand(),
						GunHelper.getShotCooldwon(pl.getHeldItemOffhand()) - 1);
			}
		}
	}
}
