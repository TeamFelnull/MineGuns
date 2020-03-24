package org.felnull.mineguns.client.render.gun.animaiton;

import org.felnull.mineguns.client.helper.RenderHelper;

import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraftforge.client.event.RenderHandEvent;

@SuppressWarnings("deprecation")
public class MK23Animation extends GunAnimation {
	@Override
	public void renderOppositeHand(Hand hand, ItemStack handstack, ItemStack oppositestack, RenderHandEvent e) {
		if (oppositestack.getItem() instanceof SwordItem)
			e.setCanceled(true);
	}

	@Override
	public void renderRightHand(ItemStack stack, float holdpar, float shotcooldwonpar) {
		RenderHelper.renderGunHand(Hand.MAIN_HAND, 0.66300035f, 0.26999885f, -0.7819979f, -0.59899974f, 0.04199999f,
				0.09999996f, holdpar, -0.91599965f, -0.11999991f, 0.15800273f, 0.031000009f, -0.048000008f,
				0.016999992f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunHand(Hand.OFF_HAND, -0.12999992f, 0.5869993f, -0.99199915f, -0.58899975f, 0.02199999f,
				0.37699994f, holdpar, 0.16000031f, -0.58300006f, 0.46800277f, -0.029000001f, -0.028f, -0.102999985f,
				shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 2, 2, 2, 0.43999988f, -0.27000004f,
				-0.76999974f, 0.030000014f, 0.03f, 0.0f, holdpar, -0.43999973f, 0.19700001f, 0.16800275f, -0.029000001f,
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
		RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 2, 2, 2, 0.43999988f, -0.27000004f,
				-0.76999974f, 0.030000014f, 0.03f, 0.0f, holdpar, -0.43999973f, 0.19700001f, 0.16800275f, -0.029000001f,
				-0.028f, -0.0030000007f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
	}

	@Override
	public void renderRightOnryHand(ItemStack stack, float holdpar, float shotcooldwonpar) {
		ItemStack leftitem = mc.player.getPrimaryHand() == HandSide.RIGHT ? mc.player.getHeldItemOffhand()
				: mc.player.getHeldItemMainhand();

		if (leftitem.getItem() instanceof SwordItem) {
			renderRightHand(stack, holdpar, shotcooldwonpar);
			RenderHelper.renderGunItem(leftitem, TransformType.FIRST_PERSON_LEFT_HAND, -2, -2, -2, 0.36000004f,
					0.3100001f,
					0.77999973f, 0.0f, 0.0f, 0.2f, holdpar, -0.21000017f, 0.040000014f, -0.21000004f, 0.1f, 0.0f,
					0.23000003f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		} else {
			RenderHelper.renderGunHand(Hand.MAIN_HAND, 0.66300035f, 0.26999885f, -0.7819979f, -0.59899974f, 0.04199999f,
					0.09999996f, holdpar, -0.66999936f, 0.04699999f, 0.16800275f, -0.029000001f, -0.028f, -0.13299996f,
					shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
			RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_RIGHT_HAND, 2, 2, 2, 0.43999988f, -0.27000004f,
					-0.76999974f, 0.030000014f, 0.03f, 0.0f, holdpar, -0.2799998f, 0.127f, 0.06800275f, -0.029000044f,
					-0.07800003f, -0.0029999986f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		}
	}

	@Override
	public void renderLeftOnryHand(ItemStack stack, float holdpar, float shotcooldwonpar) {

		ItemStack rightitem = mc.player.getPrimaryHand() == HandSide.RIGHT ? mc.player.getHeldItemMainhand()
				: mc.player.getHeldItemOffhand();

		if (rightitem.getItem() instanceof SwordItem) {
			renderLeftHand(stack, holdpar, shotcooldwonpar);
			RenderHelper.renderGunItem(rightitem, TransformType.FIRST_PERSON_RIGHT_HAND, 2, 2, 2, -0.16999997f,
					0.37000006f, -0.9800004f, -0.4f, -0.09999999f, 0.26000002f, holdpar, 0.36f, -0.35000026f,
					0.080000184f, 0.0f, 0.0f, 0.2f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		} else {
			RenderHelper.renderGunHand(Hand.OFF_HAND, 0.66300035f, 0.26999885f, -0.7819979f, -0.59899974f, 0.04199999f,
					0.09999996f, holdpar, -0.66999936f, 0.04699999f, 0.16800275f, -0.029000001f, -0.028f, -0.13299996f,
					shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
			RenderHelper.renderGunItem(stack, TransformType.FIRST_PERSON_LEFT_HAND, 2, 2, 2, 0.43999988f, -0.27000004f,
					-0.76999974f, 0.030000014f, 0.03f, 0.0f, holdpar, -0.2799998f, 0.127f, 0.06800275f, -0.029000044f,
					-0.07800003f, -0.0029999986f, shotcooldwonpar, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f);
		}
	}
}
