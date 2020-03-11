package org.felnull.mineguns.client.helper;

import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.FirstPersonRenderer;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@SuppressWarnings("deprecation")
public class RenderHelper {
	public static Minecraft mc = Minecraft.getInstance();
	private static IRenderTypeBuffer Impl = IRenderTypeBuffer.func_228455_a_(new BufferBuilder(256));

	public static void renderGunHand(Hand hand, double tx, double ty, double tz, float rx, float ry, float rz) {
		AbstractClientPlayerEntity pl = mc.player;
		mc.getTextureManager().bindTexture(pl.getLocationSkin());
		PlayerRenderer plr = (PlayerRenderer) mc.getRenderManager().getRenderer(pl);
		MatrixStack ms = new MatrixStack();

		if (hand == Hand.OFF_HAND) {
			tx *= -1;
			ry *= -1;
			rz *= -1;
		}

		ms.func_227863_a_(new Quaternion(rx, 0, 0, 1));
		ms.func_227863_a_(new Quaternion(0, ry, 0, 1));
		ms.func_227863_a_(new Quaternion(0, 0, rz, 1));

		ms.func_227861_a_(tx, ty, tz);
		if (hand == Hand.MAIN_HAND)
			plr.func_229146_b_(ms, Impl, 150, pl);
		else
			plr.func_229144_a_(ms, Impl, 150, pl);

	}

	public static void renderGunItem(ItemStack item, TransformType handtyape, float scale, float tx, float ty, float tz,
			float rx, float ry, float rz) {

		if (handtyape == TransformType.FIRST_PERSON_LEFT_HAND) {
			tx *= -1;
			ry *= -1;
			rz *= -1;
		}

		MatrixStack ms = new MatrixStack();
		GL11.glPushMatrix();
		ms.func_227863_a_(new Quaternion(rx, 0, 0, 1));
		ms.func_227863_a_(new Quaternion(0, ry, 0, 1));
		ms.func_227863_a_(new Quaternion(0, 0, rz, 1));
		ms.func_227862_a_(3, 3, 3);
		ms.func_227861_a_(tx, ty, tz);
		FirstPersonRenderer fpr = mc.getFirstPersonRenderer();
		fpr.func_228397_a_(mc.player, item, handtyape, false, ms, Impl, 150);
		GL11.glPopMatrix();
	}

	public static void glAllRotatef(float x, float y, float z) {
		GL11.glRotatef(x, 1, 0, 0);
		GL11.glRotatef(y, 0, 1, 0);
		GL11.glRotatef(z, 0, 0, 1);
	}

	public static void glTranslatefDegree(float degree, float x, float y, float z) {
		GL11.glTranslatef(x * degree, y * degree, z * degree);
	}

	public static void glRotatefDegree(float degree, float x, float y, float z) {
		glAllRotatef(x * degree, y * degree, z * degree);
	}

	public static void gTranslateflRotatefDegree(float degree, float tx, float ty, float tz, float rx, float ry,
			float rz) {
		glTranslatefDegree(degree, tx, ty, tz);
		glRotatefDegree(degree, rx, ry, rz);
	}
}
