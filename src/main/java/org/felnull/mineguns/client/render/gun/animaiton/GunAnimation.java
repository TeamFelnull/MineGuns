package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.util.GunHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;

public class GunAnimation {
	public static Minecraft mc = Minecraft.getInstance();

	public GunAnimation() {

	}

	public void renderHand(Hand hand, ItemStack stack) {
		PlayerEntity pl = mc.player;

		float holdpar = (float) GunHelper.getHoldProgress(stack) / (float) GunHelper.getHold(stack);

		if (mc.gameSettings.mainHand == HandSide.RIGHT) {
			if (hand == Hand.MAIN_HAND) {
				if (pl.getHeldItemOffhand().isEmpty())
					renderRightHand(stack, holdpar);
				else
					renderRightOnryHand(stack, holdpar);
			} else
				renderLeftOnryHand(stack, holdpar);
		} else {

			if (hand == Hand.MAIN_HAND) {
				if (pl.getHeldItemOffhand().isEmpty())
					renderLeftHand(stack, holdpar);
				else
					renderLeftOnryHand(stack, holdpar);
			} else
				renderRightOnryHand(stack, holdpar);

		}
	}

	public void renderRightHand(ItemStack stack, float holdpar) {

	}

	public void renderLeftHand(ItemStack stack, float holdpar) {

	}

	public void renderRightOnryHand(ItemStack stack, float holdpar) {

	}

	public void renderLeftOnryHand(ItemStack stack, float holdpar) {

	}

}
