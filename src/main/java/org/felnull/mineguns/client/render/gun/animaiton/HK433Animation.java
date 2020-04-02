package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.client.helper.RenderHelper;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@SuppressWarnings("deprecation")
public class HK433Animation extends GunAnimation {

	@Override
	public void renderRightHand(MatrixStack matrixStack, ItemStack stack, float holdpar, float shotcooldwonpar,
			int light) {

		RenderHelper.renderGunHand(matrixStack, Hand.MAIN_HAND, light, -0.31999996f, -1.0900002f, -1.4499996f,
				-0.09999999f, -0.08999999f,
				0.17f, holdpar, -0.3f, 0.20000002f, 0.6f, 0.0f, 0.0f, 0.1f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f,
				0.0f, 0.0f);
		RenderHelper.renderGunHand(matrixStack, Hand.OFF_HAND, light, -0.79999983f, 0.19999945f, -0.7700001f,
				-0.3999999f, -0.23000002f,
				0.2f, holdpar, 0.5f, -0.09999996f, -0.19999993f, 0.0f, 0.0f, 0.09999999f, shotcooldwonpar, 0.0f, 0.0f,
				0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(matrixStack, stack, light, TransformType.FIRST_PERSON_RIGHT_HAND, 3, 3, 3, 0.11f,
				-0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f, holdpar, -0.093899906f, 0.06470034f, 0.13649997f, -0.040999986f,
				0.041599974f, -0.031099983f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);

	}

	@Override
	public void renderLeftHand(MatrixStack matrixStack, ItemStack stack, float holdpar, float shotcooldwonpar,
			int light) {

		RenderHelper.renderGunHand(matrixStack, Hand.OFF_HAND, light, -0.31999996f, -1.0900002f, -1.4499996f,
				-0.09999999f, -0.08999999f,
				0.17f, holdpar, -0.3f, 0.20000002f, 0.6f, 0.0f, 0.0f, 0.1f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f,
				0.0f, 0.0f);
		RenderHelper.renderGunHand(matrixStack, Hand.MAIN_HAND, light, -0.79999983f, 0.19999945f, -0.7700001f,
				-0.3999999f, -0.23000002f,
				0.2f, holdpar, 0.5f, -0.09999996f, -0.19999993f, 0.0f, 0.0f, 0.09999999f, shotcooldwonpar, 0.0f, 0.0f,
				0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(matrixStack, stack, light, TransformType.FIRST_PERSON_LEFT_HAND, 3, 3, 3,
				0.07837011f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f, holdpar, -0.093899906f, 0.06470034f, 0.13649997f, -0.040999986f, 0.041599974f,
				-0.031099983f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
	}

	@Override
	public void renderRightOnryHand(MatrixStack matrixStack, ItemStack stack, float holdpar, float shotcooldwonpar,
			int light) {
		RenderHelper.renderGunHand(matrixStack, Hand.MAIN_HAND, light, -0.31999996f, -1.0900002f, -1.4499996f,
				-0.09999999f, -0.08999999f,
				0.17f, holdpar, -0.2399999f, 0.040000044f, 0.43999988f, 0.0f, -0.10000002f, 0.100000024f,
				shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(matrixStack, stack, light, TransformType.FIRST_PERSON_RIGHT_HAND, 3, 3, 3, 0.11f,
				-0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f, holdpar, -0.009899903f, 0.04370037f, 0.108499914f, -0.039999988f, -0.011400014f,
				-0.031099983f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
	}

	@Override
	public void renderLeftOnryHand(MatrixStack matrixStack, ItemStack stack, float holdpar, float shotcooldwonpar,
			int light) {
		RenderHelper.renderGunHand(matrixStack, Hand.OFF_HAND, light, -0.31999996f, -1.0900002f, -1.4499996f,
				-0.09999999f, -0.08999999f,
				0.17f, holdpar, -0.2399999f, 0.040000044f, 0.43999988f, 0.0f, -0.10000002f, 0.100000024f,
				shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(matrixStack, stack, light, TransformType.FIRST_PERSON_LEFT_HAND, 3, 3, 3,
				0.07837011f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f, holdpar, -0.009899903f, 0.04370037f, 0.108499914f, -0.039999988f, -0.011400014f,
				-0.031099983f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
	}
}
