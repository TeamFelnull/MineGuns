package org.felnull.mineguns.handler;

import org.felnull.mineguns.item.GunItem;
import org.felnull.mineguns.util.GunHelper;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.TickEvent.ServerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

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
