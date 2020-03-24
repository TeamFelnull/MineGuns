package org.felnull.mineguns.handler;

import org.felnull.mineguns.item.GunItem;
import org.felnull.mineguns.util.GunHelper;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
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

		itemUpdate(pl, Hand.MAIN_HAND);
		itemUpdate(pl, Hand.OFF_HAND);
	}

	private static void itemUpdate(PlayerEntity pl, Hand hand) {
		ItemStack itemstack = hand == Hand.MAIN_HAND ? pl.getHeldItemOffhand() : pl.getHeldItemMainhand();

		if (itemstack.getItem() instanceof GunItem) {
			shotCooldwon(itemstack);
			holdPrograses(itemstack);
			holding(itemstack, pl);
		}
	}

	private static void holding(ItemStack itemstack, PlayerEntity pl) {
		if (GunHelper.isMaxHolding(itemstack))
			((GunItem) itemstack.getItem()).getGun().hold(itemstack, pl, pl.world);
	}

	private static void shotCooldwon(ItemStack itemstack) {
		if (GunHelper.getShotCooldwon(itemstack) >= 1)
			GunHelper.setShotCooldwon(itemstack,
					GunHelper.getShotCooldwon(itemstack) - 1);
	}

	private static void holdPrograses(ItemStack itemstack) {
		int holdprograses = GunHelper.getHoldProgress(itemstack);
		if (GunHelper.isHolding(itemstack)) {
			if (holdprograses <= GunHelper.getHold(itemstack) - 1)
				GunHelper.setHoldProgress(itemstack, holdprograses + 1);
		} else {
			if (holdprograses >= 1)
				GunHelper.setHoldProgress(itemstack, holdprograses - 1);
		}
	}
}
