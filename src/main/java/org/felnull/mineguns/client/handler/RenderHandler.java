package org.felnull.mineguns.client.handler;

import org.felnull.mineguns.client.render.gun.animaiton.GunAnimation;
import org.felnull.mineguns.item.GunItem;
import org.felnull.mineguns.util.GunHelper;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RenderHandler {
	public static Minecraft mc = Minecraft.getInstance();

	@SubscribeEvent
	public void onRenderPlayer(RenderPlayerEvent.Pre e) {

		if (e.getPlayer().getHeldItemMainhand().getItem() instanceof GunItem
				&& GunHelper.isMaxHolding(e.getPlayer().getHeldItemMainhand())) {

			PlayerModel<AbstractClientPlayerEntity> playermodel = e.getRenderer().getEntityModel();
			BipedModel.ArmPose bipedmodel$armpose = BipedModel.ArmPose.BOW_AND_ARROW;
			BipedModel.ArmPose bipedmodel$armpose1 = BipedModel.ArmPose.BOW_AND_ARROW;
			if (e.getPlayer().getPrimaryHand() == HandSide.RIGHT) {
				playermodel.rightArmPose = bipedmodel$armpose;
				playermodel.leftArmPose = bipedmodel$armpose1;
			} else {
				playermodel.rightArmPose = bipedmodel$armpose1;
				playermodel.leftArmPose = bipedmodel$armpose;
			}
		}

		if (e.getPlayer().getHeldItemOffhand().getItem() instanceof GunItem
				&& GunHelper.isMaxHolding(e.getPlayer().getHeldItemOffhand())) {

			PlayerModel<AbstractClientPlayerEntity> playermodel = e.getRenderer().getEntityModel();
			BipedModel.ArmPose bipedmodel$armpose = BipedModel.ArmPose.BOW_AND_ARROW;
			BipedModel.ArmPose bipedmodel$armpose1 = BipedModel.ArmPose.BOW_AND_ARROW;
			if (e.getPlayer().getPrimaryHand() == HandSide.RIGHT) {
				playermodel.rightArmPose = bipedmodel$armpose;
				playermodel.leftArmPose = bipedmodel$armpose1;
			} else {
				playermodel.rightArmPose = bipedmodel$armpose1;
				playermodel.leftArmPose = bipedmodel$armpose;
			}
		}

	}

	@SubscribeEvent
	public void onRenderHand(RenderHandEvent e) {
		PlayerEntity pl = mc.player;
		GL11.glPushMatrix();
	//	RenderHelper.glTranslatefRotatef(KeyHandler.deb_ido_x2, KeyHandler.deb_ido_y2, KeyHandler.deb_ido_z2,
	//		KeyHandler.deb_kakudo_x2, KeyHandler.deb_kakudo_y2, KeyHandler.deb_kakudo_z2);

		if (e.getItemStack().getItem() instanceof GunItem) {

			//	GL11.glTranslatef(0, -e.getEquipProgress() * 3, 0);
			GunItem gun = (GunItem) e.getItemStack().getItem();
			GunAnimation animation = gun.getGun().getGunAnimation();
			animation.renderHand(e.getHand(), e.getItemStack(),e);
			e.setCanceled(true);

		}

		if (pl.getHeldItem(e.getHand() == Hand.MAIN_HAND ? Hand.OFF_HAND : Hand.MAIN_HAND)
				.getItem() instanceof GunItem) {
			ItemStack items = pl.getHeldItem(e.getHand() == Hand.MAIN_HAND ? Hand.OFF_HAND : Hand.MAIN_HAND);
			GunItem gun = (GunItem) items.getItem();
			GunAnimation animation = gun.getGun().getGunAnimation();
			animation.renderOppositeHand(e.getHand(), items, e.getItemStack(), e);
		}
		GL11.glPopMatrix();
	}
}
