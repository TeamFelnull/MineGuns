package orz.teamfelnull.mineguns.handler;

import java.util.function.Supplier;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraftforge.fml.network.NetworkEvent;
import orz.teamfelnull.mineguns.item.GunItem;
import orz.teamfelnull.mineguns.packet.message.GunStateMessage;

public class GunStateMessageHandler {
	public static void reversiveMessage(GunStateMessage message, Supplier<NetworkEvent.Context> ctx) {

		PlayerEntity pl = ctx.get().getSender();
		int state = message.State;
		Item mainitemstack = pl.getHeldItemMainhand().getItem();
		Item offitemstack = pl.getHeldItemOffhand().getItem();

		if ((mainitemstack instanceof GunItem)) {

			if (state == 1) {

				GunItem gunmainitemstack = (GunItem) mainitemstack;

				gunmainitemstack.getGun().shot(pl.getHeldItemMainhand(), pl, pl.getEntityWorld());

			}
		}
		if ((offitemstack instanceof GunItem)) {

			if (state == 1) {

				GunItem gunoffitemstack = (GunItem) offitemstack;

				gunoffitemstack.getGun().shot(pl.getHeldItemOffhand(), pl, pl.getEntityWorld());
			}
		}

	}
}
