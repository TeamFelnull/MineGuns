package org.felnull.mineguns.handler;

import java.util.function.Supplier;

import org.felnull.mineguns.item.GunItem;
import org.felnull.mineguns.packet.message.GunStateMessage;
import org.felnull.mineguns.util.GunHelper;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraftforge.fml.network.NetworkEvent;

public class GunStateMessageHandler {
	public static void reversiveMessage(GunStateMessage message, Supplier<NetworkEvent.Context> ctx) {

		PlayerEntity pl = ctx.get().getSender();
		int state = message.State;
		Item mainitemstack = pl.getHeldItemMainhand().getItem();
		Item offitemstack = pl.getHeldItemOffhand().getItem();
		shotMainHandGun(mainitemstack, pl, state);
		shotOffHandGun(offitemstack, pl, state);
		holdMainHandGun(mainitemstack, pl, state);
	}

	public static void holdMainHandGun(Item mainitemstack, PlayerEntity pl, int state) {
		if ((mainitemstack instanceof GunItem)) {

			if (state == 2)
				GunHelper.setHolding(pl.getHeldItemMainhand(), true);

			if (state == 4)
				GunHelper.setHolding(pl.getHeldItemMainhand(), false);

		}
	}

	public static void shotOffHandGun(Item offitemstack, PlayerEntity pl, int state) {
		if ((offitemstack instanceof GunItem) && (GunHelper.getShotCooldwon(pl.getHeldItemOffhand()) <= 0)) {
			GunItem gunoffitemstack = (GunItem) offitemstack;
			if (!GunHelper.isSemiAuto(pl.getHeldItemOffhand())) {
				if (state == 1) {

					gunoffitemstack.getGun().shot(pl.getHeldItemOffhand(), pl, pl.getEntityWorld());
				}
			} else {
				if (state == 3) {

					gunoffitemstack.getGun().shot(pl.getHeldItemOffhand(), pl, pl.getEntityWorld());
				}
			}
		}
	}

	public static void shotMainHandGun(Item mainitemstack, PlayerEntity pl, int state) {
		if ((mainitemstack instanceof GunItem) && (GunHelper.getShotCooldwon(pl.getHeldItemMainhand()) <= 0)) {
			GunItem gunmainitemstack = (GunItem) mainitemstack;
			if (!GunHelper.isSemiAuto(pl.getHeldItemMainhand())) {
				if (state == 1) {

					gunmainitemstack.getGun().shot(pl.getHeldItemMainhand(), pl, pl.getEntityWorld());

				}
			} else {
				if (state == 3) {

					gunmainitemstack.getGun().shot(pl.getHeldItemMainhand(), pl, pl.getEntityWorld());

				}
			}

		}
	}
}
