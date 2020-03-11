package orz.teamfelnull.mineguns.client.render.gun.animaiton;

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

		if (mc.gameSettings.mainHand == HandSide.RIGHT) {
			if (hand == Hand.MAIN_HAND) {
				if (pl.getHeldItemOffhand().isEmpty())
					renderRightHand(stack);
				else
					renderRightOnryHand(stack);
			} else
				renderLeftOnryHand(stack);
		} else {

			if (hand == Hand.MAIN_HAND) {
				if (pl.getHeldItemOffhand().isEmpty())
					renderLeftHand(stack);
				else
					renderLeftOnryHand(stack);
			} else
				renderRightOnryHand(stack);

		}
	}

	public void renderLeftHand(ItemStack stack) {

	}

	public void renderRightHand(ItemStack stack) {

	}

	public void renderLeftOnryHand(ItemStack stack) {

	}

	public void renderRightOnryHand(ItemStack stack) {

	}
}
