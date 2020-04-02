package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.util.GunHelper;

import com.mojang.blaze3d.matrix.MatrixStack;

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

	public void renderHand(Hand hand, ItemStack stack, RenderHandEvent e) {
		PlayerEntity pl = mc.player;

		float shotcooldwonpar = ((float) GunHelper.getShotCooldwon(stack) / (float) GunHelper.getBlaze(stack)) * 2;

		if (shotcooldwonpar >= 1)
			shotcooldwonpar = 2 - shotcooldwonpar;

		float holdpar = (float) GunHelper.getHoldProgress(stack) / (float) GunHelper.getHold(stack);

		if (mc.player.getPrimaryHand() == HandSide.RIGHT) {
			if (hand == Hand.MAIN_HAND) {
				if (pl.getHeldItemOffhand().isEmpty())
					renderRightHand(e.getMatrixStack(), stack, holdpar, shotcooldwonpar, e.getLight());
				else
					renderRightOnryHand(e.getMatrixStack(), stack, holdpar, shotcooldwonpar, e.getLight());
			} else
				renderLeftOnryHand(e.getMatrixStack(), stack, holdpar, shotcooldwonpar, e.getLight());
		} else {

			if (hand == Hand.MAIN_HAND) {
				if (pl.getHeldItemOffhand().isEmpty())
					renderLeftHand(e.getMatrixStack(), stack, holdpar, shotcooldwonpar, e.getLight());
				else
					renderLeftOnryHand(e.getMatrixStack(), stack, holdpar, shotcooldwonpar, e.getLight());
			} else
				renderRightOnryHand(e.getMatrixStack(), stack, holdpar, shotcooldwonpar, e.getLight());

		}
	}

	public void renderRightHand(MatrixStack matrixStack, ItemStack stack, float holdpar, float shotcooldwonpar,
			int light) {

	}

	public void renderLeftHand(MatrixStack matrixStack, ItemStack stack, float holdpar, float shotcooldwonpar,
			int light) {

	}

	public void renderRightOnryHand(MatrixStack matrixStack, ItemStack stack, float holdpar, float shotcooldwonpar,
			int light) {

	}

	public void renderLeftOnryHand(MatrixStack matrixStack, ItemStack stack, float holdpar, float shotcooldwonpar,
			int light) {

	}

}
