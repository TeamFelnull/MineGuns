package orz.teamfelnull.mineguns.handler;

import java.util.function.Supplier;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraftforge.fml.network.NetworkEvent;
import orz.teamfelnull.mineguns.item.GunItem;
import orz.teamfelnull.mineguns.packet.message.GunStateMessage;
import orz.teamfelnull.mineguns.util.GunHelper;

public class GunStateMessageHandler {
	public static void reversiveMessage(GunStateMessage message, Supplier<NetworkEvent.Context> ctx) {

		PlayerEntity pl = ctx.get().getSender();
		int state = message.State;
		Item mainitemstack = pl.getHeldItemMainhand().getItem();
		Item offitemstack = pl.getHeldItemOffhand().getItem();

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
}
