package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.client.helper.RenderHelper;

import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@SuppressWarnings("deprecation")
public class HK433Animation extends GunAnimation {
	// ((float) KeyHandler.debuck / 100)
	@Override
	public void renderLeftHand(ItemStack stack) {
		RenderHelper.renderGunHand(Hand.OFF_HAND, 1.2f, -1.11f, 0.06f, -0.44f, 0.44f, 0.45f);
		RenderHelper.renderGunHand(Hand.MAIN_HAND, 0.31f, 0.85f, -0.31f, -0.71f, 0.15f, 0.34f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 3, 0.25f, -0.14f, -0.62f, 0.04f, 0.02f,
				0.04f);
	}

	@Override
	public void renderRightHand(ItemStack stack) {
		RenderHelper.renderGunHand(Hand.MAIN_HAND, 1.2f, -1.11f, 0.06f, -0.44f, 0.44f, 0.45f);
		RenderHelper.renderGunHand(Hand.OFF_HAND, 0.31f, 0.85f, -0.31f, -0.71f, 0.15f, 0.34f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 3, 0.25f, -0.14f, -0.62f, 0.04f, 0.02f,
				0.04f);
	}

	@Override
	public void renderRightOnryHand(ItemStack stack) {
		RenderHelper.renderGunHand(Hand.MAIN_HAND, 1.2f, -1.11f, 0.06f, -0.44f, 0.44f, 0.45f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 3, 0.25f, -0.14f, -0.62f, 0.04f, 0.02f,
				0.04f);
	}

	@Override
	public void renderLeftOnryHand(ItemStack stack) {
		RenderHelper.renderGunHand(Hand.OFF_HAND, 1.2f, -1.11f, 0.06f, -0.44f, 0.44f, 0.45f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 3, 0.25f, -0.14f, -0.62f, 0.04f, 0.02f,
				0.04f);
	}
}
