package org.felnull.mineguns.handler;

import java.util.function.Supplier;

import org.felnull.mineguns.item.GunItem;
import org.felnull.mineguns.packet.message.GunStateMessage;
import org.felnull.mineguns.util.GunHelper;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraftforge.fml.network.NetworkEvent;

public class GunStateMessageHandler {
	public static void reversiveMessage(GunStateMessage message, Supplier<NetworkEvent.Context> ctx) {
		PlayerEntity pl = ctx.get().getSender();
		int state = message.State;
		Hand hand = message.Handa;
		boolean active = message.Active;
		shotGun(pl, state, hand, active);
		unShotGun(pl, state, hand, active);
		holdGun(pl, state, hand, active);
		unHoldGun(pl, state, hand, active);
	}

	private static void shotGun(PlayerEntity pl, int state, Hand hand, boolean active) {
		ItemStack itemstack = hand == Hand.MAIN_HAND ? pl.getHeldItemOffhand() : pl.getHeldItemMainhand();
		if (active && state == 1 && itemstack.getItem() instanceof GunItem) {
			GunItem gunitem = (GunItem) itemstack.getItem();
			if (gunitem.getGun().canShot(itemstack, pl, pl.world))
				gunitem.getGun().shot(itemstack, pl, pl.world);
		}
	}

	private static void unShotGun(PlayerEntity pl, int state, Hand hand, boolean active) {
		ItemStack itemstack = hand == Hand.MAIN_HAND ? pl.getHeldItemOffhand() : pl.getHeldItemMainhand();
		if (!active && state == 1 && itemstack.getItem() instanceof GunItem)
			GunHelper.setBurstCount(itemstack, 0);
	}

	private static void holdGun(PlayerEntity pl, int state, Hand hand, boolean active) {
		ItemStack itemstack = hand == Hand.MAIN_HAND ? pl.getHeldItemOffhand() : pl.getHeldItemMainhand();
		if (active && state == 2 && itemstack.getItem() instanceof GunItem)
			GunHelper.setHolding(itemstack, true);
	}

	private static void unHoldGun(PlayerEntity pl, int state, Hand hand, boolean active) {
		ItemStack itemstack = hand == Hand.MAIN_HAND ? pl.getHeldItemOffhand() : pl.getHeldItemMainhand();
		if (!active && state == 2 && itemstack.getItem() instanceof GunItem)
			GunHelper.setHolding(itemstack, false);
	}

}
