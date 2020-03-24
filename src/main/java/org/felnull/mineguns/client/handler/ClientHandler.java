package org.felnull.mineguns.client.handler;

import org.felnull.mineguns.item.GunItem;
import org.felnull.mineguns.packet.PacketHandler;
import org.felnull.mineguns.packet.message.GunStateMessage;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ClientHandler {
	public static Minecraft mc = Minecraft.getInstance();

	@SubscribeEvent
	public void onTick(ClientTickEvent e) {
		if (mc.player != null) {
			sendGunState(Hand.MAIN_HAND);
			sendGunState(Hand.OFF_HAND);
		}
	}

	private static void sendGunState(Hand hand) {
		ItemStack itemstack = hand == Hand.MAIN_HAND ? mc.player.getHeldItemMainhand() : mc.player.getHeldItemOffhand();
		if (itemstack.getItem() instanceof GunItem) {
			GunItem gun = (GunItem) itemstack.getItem();
			if (isGunShot()) {
				if (gun.getGun().canShot(itemstack, mc.player, mc.world))
					PacketHandler.INSTANCE.sendToServer(new GunStateMessage(1, hand, true));
			} else {
				PacketHandler.INSTANCE.sendToServer(new GunStateMessage(1, hand, false));
			}
			if (isHold()) {
				PacketHandler.INSTANCE.sendToServer(new GunStateMessage(2, hand, true));
			} else {
				PacketHandler.INSTANCE.sendToServer(new GunStateMessage(2, hand, false));
			}
		}
	}

	public static boolean isGunShot() {
		return mc.gameSettings.keyBindAttack.isKeyDown();
	}

	public static boolean isHold() {
		return mc.gameSettings.keyBindUseItem.isKeyDown();
	}
}
