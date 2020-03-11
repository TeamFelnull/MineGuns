package org.felnull.mineguns.client.handler;

import org.felnull.mineguns.client.render.gun.animaiton.GunAnimation;
import org.felnull.mineguns.item.GunItem;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RenderHandler {
	public static Minecraft mc = Minecraft.getInstance();

	@SubscribeEvent
	public static void onModel(ModelBakeEvent e) {

	}

	@SubscribeEvent
	public static void onRenderSpecificHand(RenderHandEvent e) {

		if (e.getItemStack().getItem() instanceof GunItem) {
			GL11.glPushMatrix();
			//	GL11.glTranslatef(0, -e.getEquipProgress() * 3, 0);
			GunItem gun = (GunItem) e.getItemStack().getItem();
			GunAnimation animation = gun.getGun().getGunAnimation();
			animation.renderHand(e.getHand(), e.getItemStack());
			e.setCanceled(true);
			GL11.glPopMatrix();
		}
	}
}
