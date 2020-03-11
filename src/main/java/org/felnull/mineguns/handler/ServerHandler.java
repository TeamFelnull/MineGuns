package org.felnull.mineguns.handler;

import org.felnull.mineguns.item.GunItem;
import org.felnull.mineguns.util.GunHelper;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
		Item mainitem = pl.getHeldItemMainhand().getItem();
		Item offitem = pl.getHeldItemOffhand().getItem();
		ItemStack mainstack = pl.getHeldItemMainhand();
		ItemStack offstack = pl.getHeldItemOffhand();

		if ((mainitem instanceof GunItem)) {
			if (GunHelper.getShotCooldwon(mainstack) >= 1) {
				GunHelper.setShotCooldwon(mainstack,
						GunHelper.getShotCooldwon(mainstack) - 1);
			}

			int holdprograses = GunHelper.getHoldProgress(mainstack);
			if (GunHelper.isHolding(mainstack)) {

				if (holdprograses <= GunHelper.getHold(mainstack) - 1)
					GunHelper.setHoldProgress(mainstack, holdprograses + 1);

			} else {

				if (holdprograses >= 1)
					GunHelper.setHoldProgress(mainstack, holdprograses - 1);

			}
		}
		if ((offitem instanceof GunItem)) {
			if (GunHelper.getShotCooldwon(offstack) >= 1) {
				GunHelper.setShotCooldwon(offstack,
						GunHelper.getShotCooldwon(offstack) - 1);
			}
			int holdprograses = GunHelper.getHoldProgress(offstack);
			if (GunHelper.isHolding(offstack)) {

				if (holdprograses <= GunHelper.getHold(offstack) - 1)
					GunHelper.setHoldProgress(offstack, holdprograses + 1);

			} else {

				if (holdprograses >= 1)
					GunHelper.setHoldProgress(offstack, holdprograses - 1);

			}
		}
	}
}
