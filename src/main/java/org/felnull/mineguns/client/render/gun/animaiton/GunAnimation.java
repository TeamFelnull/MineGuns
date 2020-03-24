package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.util.GunHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraftforge.client.event.RenderHandEvent;

public class GunAnimation {
	public static Minecraft mc = Minecraft.getInstance();

	public GunAnimation() {

	}

	public void renderOppositeHand(Hand hand, ItemStack handstack, ItemStack oppositestack, RenderHandEvent e) {

	}

	public void renderHand(Hand hand, ItemStack stack) {
		PlayerEntity pl = mc.player;

		float shotcooldwonpar = ((float) GunHelper.getShotCooldwon(stack) / (float) GunHelper.getBlaze(stack)) * 2;

		if (shotcooldwonpar >= 1)
			shotcooldwonpar = 2 - shotcooldwonpar;

		float holdpar = (float) GunHelper.getHoldProgress(stack) / (float) GunHelper.getHold(stack);

		if (mc.player.getPrimaryHand() == HandSide.RIGHT) {
			if (hand == Hand.MAIN_HAND) {
				if (pl.getHeldItemOffhand().isEmpty())
					renderRightHand(stack, holdpar, shotcooldwonpar);
				else
					renderRightOnryHand(stack, holdpar, shotcooldwonpar);
			} else
				renderLeftOnryHand(stack, holdpar, shotcooldwonpar);
		} else {

			if (hand == Hand.MAIN_HAND) {
				if (pl.getHeldItemOffhand().isEmpty())
					renderLeftHand(stack, holdpar, shotcooldwonpar);
				else
					renderLeftOnryHand(stack, holdpar, shotcooldwonpar);
			} else
				renderRightOnryHand(stack, holdpar, shotcooldwonpar);

		}
	}

	public void renderRightHand(ItemStack stack, float holdpar, float shotcooldwonpar) {

	}

	public void renderLeftHand(ItemStack stack, float holdpar, float shotcooldwonpar) {

	}

	public void renderRightOnryHand(ItemStack stack, float holdpar, float shotcooldwonpar) {

	}

	public void renderLeftOnryHand(ItemStack stack, float holdpar, float shotcooldwonpar) {

	}

}
