package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.client.helper.RenderHelper;

import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@SuppressWarnings("deprecation")
public class HK433Animation extends GunAnimation {

	@Override
	public void renderRightHand(ItemStack stack, float holdpar) {

		RenderHelper.renderGunHand(Hand.MAIN_HAND, -0.31999996f, -1.0900002f, -1.4499996f, -0.09999999f, -0.08999999f,
				0.17f, holdpar, -0.3f, 0.20000002f, 0.6f, 0.0f, 0.0f, 0.1f);
		RenderHelper.renderGunHand(Hand.OFF_HAND, -0.79999983f, 0.19999945f, -0.7700001f, -0.3999999f, -0.23000002f,
				0.2f, holdpar, 0.5f, -0.09999996f, -0.19999993f, 0.0f, 0.0f, 0.09999999f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 3, 0.11f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f, holdpar, -0.093899906f, 0.06470034f, 0.13649997f, -0.040999986f,
				0.041599974f, -0.031099983f);

	}

	@Override
	public void renderLeftHand(ItemStack stack, float holdpar) {

		RenderHelper.renderGunHand(Hand.OFF_HAND, -0.31999996f, -1.0900002f, -1.4499996f, -0.09999999f, -0.08999999f,
				0.17f, holdpar, -0.3f, 0.20000002f, 0.6f, 0.0f, 0.0f, 0.1f);
		RenderHelper.renderGunHand(Hand.MAIN_HAND, -0.79999983f, 0.19999945f, -0.7700001f, -0.3999999f, -0.23000002f,
				0.2f, holdpar, 0.5f, -0.09999996f, -0.19999993f, 0.0f, 0.0f, 0.09999999f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 3, 0.07837011f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f, holdpar, -0.093899906f, 0.06470034f, 0.13649997f, -0.040999986f, 0.041599974f,
				-0.031099983f);
	}

	@Override
	public void renderRightOnryHand(ItemStack stack, float holdpar) {
		RenderHelper.renderGunHand(Hand.MAIN_HAND, -0.31999996f, -1.0900002f, -1.4499996f, -0.09999999f, -0.08999999f,
				0.17f, holdpar, -0.2399999f, 0.040000044f, 0.43999988f, 0.0f, -0.10000002f, 0.100000024f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 3, 0.11f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f, holdpar, -0.009899903f, 0.04370037f, 0.108499914f, -0.039999988f, -0.011400014f,
				-0.031099983f);
	}

	@Override
	public void renderLeftOnryHand(ItemStack stack, float holdpar) {
		RenderHelper.renderGunHand(Hand.OFF_HAND, -0.31999996f, -1.0900002f, -1.4499996f, -0.09999999f, -0.08999999f,
				0.17f, holdpar, -0.2399999f, 0.040000044f, 0.43999988f, 0.0f, -0.10000002f, 0.100000024f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 3, 0.07837011f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f, holdpar, -0.009899903f, 0.04370037f, 0.108499914f, -0.039999988f, -0.011400014f,
				-0.031099983f);
	}
}
