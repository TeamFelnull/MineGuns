package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.client.helper.RenderHelper;

import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@SuppressWarnings("deprecation")
public class TMPAnimation extends GunAnimation {
	public TMPAnimation() {

	}

	@Override
	public void renderRightHand(ItemStack stack, float holdpar, float shotcooldwonpar) {
		RenderHelper.renderGunHand(Hand.MAIN_HAND, 0.66300035f, 0.26999885f, -0.7819979f, -0.59899974f, 0.04199999f,
				0.09999996f, holdpar, -0.91599965f, -0.11999991f, 0.15800273f, 0.031000009f, -0.048000008f,
				0.016999992f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunHand(Hand.OFF_HAND, -0.12999992f, 0.5869993f, -0.99199915f, -0.58899975f, 0.02199999f,
				0.37699994f, holdpar, 0.16000031f, -0.58300006f, 0.46800277f, -0.029000001f, -0.028f, -0.102999985f,
				shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 2, 2, 2, 0.44099987f, -0.44699973f,
				-0.8299997f, 0.030000014f, 0.03f, 0.0f, holdpar, -0.43999973f, 0.19700001f, 0.16800275f, -0.029000001f,
				-0.028f, -0.0030000007f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
	}

	@Override
	public void renderLeftHand(ItemStack stack, float holdpar, float shotcooldwonpar) {
		RenderHelper.renderGunHand(Hand.OFF_HAND, 0.66300035f, 0.26999885f, -0.7819979f, -0.59899974f, 0.04199999f,
				0.09999996f, holdpar, -0.91599965f, -0.11999991f, 0.15800273f, 0.031000009f, -0.048000008f,
				0.016999992f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunHand(Hand.MAIN_HAND, -0.12999992f, 0.5869993f, -0.99199915f, -0.58899975f, 0.02199999f,
				0.37699994f, holdpar, 0.16000031f, -0.58300006f, 0.46800277f, -0.029000001f, -0.028f, -0.102999985f,
				shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 2, 2, 2, 0.43999988f, -0.44499975f,
				-0.76999974f, 0.030000014f, 0.03f, 0.01f, holdpar, -0.43999973f, 0.19700001f, 0.16800275f,
				-0.029000001f, -0.028f, -0.0030000007f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
	}

	@Override
	public void renderRightOnryHand(ItemStack stack, float holdpar, float shotcooldwonpar) {
		RenderHelper.renderGunHand(Hand.MAIN_HAND, 0.66300035f, 0.26999885f, -0.7819979f, -0.59899974f, 0.04199999f,
				0.09999996f, holdpar, -0.66999936f, 0.04699999f, 0.16800275f, -0.029000001f, -0.028f, -0.13299996f,
				shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 2, 2, 2, 0.43999988f, -0.44499975f,
				-0.76999974f, 0.030000014f, 0.03f, 0.01f, holdpar, -0.2799998f, 0.127f, 0.06800275f, -0.029000044f,
				-0.07800003f, -0.0029999986f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
	}

	@Override
	public void renderLeftOnryHand(ItemStack stack, float holdpar, float shotcooldwonpar) {
		RenderHelper.renderGunHand(Hand.OFF_HAND, 0.66300035f, 0.26999885f, -0.7819979f, -0.59899974f, 0.04199999f,
				0.09999996f, holdpar, -0.66999936f, 0.04699999f, 0.16800275f, -0.029000001f, -0.028f, -0.13299996f,
				shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 2, 2, 2, 0.43999988f, -0.44499975f,
				-0.76999974f, 0.030000014f, 0.03f, 0.01f, holdpar, -0.2799998f, 0.127f, 0.06800275f, -0.029000044f,
				-0.07800003f, -0.0029999986f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
	}
}
