package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.client.helper.RenderHelper;
import org.felnull.mineguns.util.GunHelper;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@SuppressWarnings("deprecation")
public class HK433Animation extends GunAnimation {

	@Override
	public void renderRightHand(ItemStack stack) {

		float holdpar = (float) GunHelper.getHoldProgress(stack) / (float) GunHelper.getHold(stack);

		GL11.glPushMatrix();
		RenderHelper.gTranslateflRotatefDegree(holdpar, -0.36f, -0.01f, 0.31f, 1.3f, 5.2f, -1.5f);

		RenderHelper.renderGunHand(Hand.MAIN_HAND, -0.24f, -0.76f, -1.41f, -0.24f, -0.12f, 0.21f);
		RenderHelper.renderGunHand(Hand.OFF_HAND, -0.52f, -0.15f, -1.31f, -0.28f, 0.0f, 0.29f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 3, 0.11f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f);
		GL11.glPopMatrix();
	}

	@Override
	public void renderLeftHand(ItemStack stack) {
		float holdpar = (float) GunHelper.getHoldProgress(stack) / (float) GunHelper.getHold(stack);

		GL11.glPushMatrix();
		RenderHelper.gTranslateflRotatefDegree(-holdpar, -0.36f, -0.01f, 0.31f, 1.3f, 5.2f, -1.5f);

		RenderHelper.renderGunHand(Hand.OFF_HAND, -0.24f, -0.76f, -1.41f, -0.24f, -0.12f, 0.21f);
		RenderHelper.renderGunHand(Hand.MAIN_HAND, -0.52f, -0.15f, -1.31f, -0.28f, 0.0f, 0.29f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 3, 0.11f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f);
		GL11.glPopMatrix();
	}

	@Override
	public void renderRightOnryHand(ItemStack stack) {
		//	float holdpar = (float) GunHelper.getHoldProgress(stack) / (float) GunHelper.getHold(stack);

		GL11.glPushMatrix();
		//	RenderHelper.gTranslateflRotatefDegree(holdpar, -0.36f, -0.01f, 0.31f, 1.3f, 5.2f, -1.5f);

		RenderHelper.renderGunHand(Hand.MAIN_HAND, -0.24f, -0.76f, -1.41f, -0.24f, -0.12f, 0.21f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 3, 0.11f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f);
		GL11.glPopMatrix();
	}

	@Override
	public void renderLeftOnryHand(ItemStack stack) {
		//	float holdpar = (float) GunHelper.getHoldProgress(stack) / (float) GunHelper.getHold(stack);

		GL11.glPushMatrix();
		//	RenderHelper.gTranslateflRotatefDegree(-holdpar, -0.36f, -0.01f, 0.31f, 1.3f, 5.2f, -1.5f);

		RenderHelper.renderGunHand(Hand.OFF_HAND, -0.24f, -0.76f, -1.41f, -0.24f, -0.12f, 0.21f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 3, 0.11f, -0.24f, -0.48f, 0.02f,
				-0.04f, 0.03f);
		GL11.glPopMatrix();
	}
}
