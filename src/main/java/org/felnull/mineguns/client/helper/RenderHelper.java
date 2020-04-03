package org.felnull.mineguns.client.helper;

import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.FirstPersonRenderer;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@SuppressWarnings("deprecation")
public class RenderHelper {
	public static Minecraft mc = Minecraft.getInstance();
	private static IRenderTypeBuffer Impl = IRenderTypeBuffer.func_228455_a_(new BufferBuilder(256));

	public static void renderGunHand(MatrixStack ms, Hand hand, int light, float tx, float ty, float tz, float rx,
			float ry, float rz,
			float degree, float dtx, float dty, float dtz, float drx, float dry, float drz) {

		renderGunHand(ms, hand, light, tx + (dtx * degree), ty + (dty * degree), tz + (dtz * degree),
				rx + (drx * degree), ry + (dry * degree), rz + (drz * degree));
	}

	public static void renderGunHand(MatrixStack ms, Hand hand, int light, float tx, float ty, float tz, float rx,
			float ry, float rz,
			float degree, float dtx, float dty, float dtz, float drx, float dry, float drz, float bdegree, float btx,
			float bty, float btz, float brx, float bry, float brz) {
		renderGunHand(ms, hand, light, tx + (dtx * degree) + (btx * bdegree),
				ty + (dty * degree) + (bty * bdegree),
				tz + (dtz * degree) + (btz * bdegree), rx + (drx * degree) + (brx * bdegree),
				ry + (dry * degree) + (bry * bdegree), rz + (drz * degree) + (brz * bdegree));
	}

	public static void renderGunItem(MatrixStack ms, ItemStack stack, int light, TransformType handtyape, float scalex,
			float scaley,
			float scalez,
			float tx, float ty,
			float tz, float rx, float ry, float rz, float degree, float dtx, float dty, float dtz, float drx, float dry,
			float drz) {
		RenderHelper.renderGunItem(ms, stack, light, handtyape, scalex, scaley, scalez, tx + (dtx * degree),
				ty + (dty * degree),
				tz + (dtz * degree), rx + (drx * degree), ry + (dry * degree), rz + (drz * degree));
	}

	public static void renderGunItem(MatrixStack ms, ItemStack stack, int light, TransformType handtyape, float scalex,
			float scaley,
			float scalez, float tx, float ty, float tz, float rx, float ry, float rz, float degree, float dtx,
			float dty, float dtz, float drx, float dry, float drz, float bdegree, float btx, float bty, float btz,
			float brx, float bry, float brz) {

		RenderHelper.renderGunItem(ms, stack, light, handtyape, scalex, scaley, scalez,
				tx + (dtx * degree) + (btx * bdegree),
				ty + (dty * degree) + (bty * bdegree),
				tz + (dtz * degree) + (btz * bdegree), rx + (drx * degree) + (brx * bdegree),
				ry + (dry * degree) + (bry * bdegree), rz + (drz * degree) + (brz * bdegree));

	}

	public static void renderGunHand(MatrixStack msx, Hand hand, int light, float tx, float ty, float tz, float rx,
			float ry, float rz) {
		AbstractClientPlayerEntity pl = mc.player;
		mc.getTextureManager().bindTexture(pl.getLocationSkin());
		PlayerRenderer plr = (PlayerRenderer) mc.getRenderManager().getRenderer(pl);

		if (hand == Hand.OFF_HAND) {
			tx *= -1;
			ry *= -1;
			rz *= -1;
		}
		MatrixStack ms = new MatrixStack();
		matrixTranslatefRotatef(ms, tx, ty, tz, rx, ry, rz);

		if (hand == Hand.MAIN_HAND)
			plr.func_229146_b_(ms, Impl, light, pl);
		else
			plr.func_229144_a_(ms, Impl, light, pl);
	}

	public static void renderGunItem(MatrixStack msx, ItemStack item, int light, TransformType handtyape, float scalex,
			float scaley,
			float scalez,
			float tx, float ty,
			float tz, float rx, float ry, float rz) {

		if (handtyape == TransformType.FIRST_PERSON_LEFT_HAND) {
			tx *= -1;
			ry *= -1;
			rz *= -1;
		}
		MatrixStack ms = new MatrixStack();
		matrixPush(ms);
		matrixScalf(ms, scalex, scaley, scalez);
		matrixTranslatefRotatef(ms, tx, ty, tz, rx, ry, rz);

		//	matrixTranslatef(ms, tx, ty, tz);
		FirstPersonRenderer fpr = mc.getFirstPersonRenderer();
		fpr.func_228397_a_(mc.player, item, handtyape, true, ms, Impl, light);
		matrixPop(ms);
	}

	public static void matrixTranslatefRotatef(MatrixStack ms, float tx, float ty, float tz, float rx, float ry,
			float rz) {
		matrixAllRotatef(ms, rx, ry, rz);
		matrixTranslatef(ms, tx, ty, tz);
	}

	public static void matrixAllRotatef(MatrixStack ms, float x, float y, float z) {
		ms.func_227863_a_(new Quaternion(x, 0, 0, 1));
		ms.func_227863_a_(new Quaternion(0, y, 0, 1));
		ms.func_227863_a_(new Quaternion(0, 0, z, 1));
	}

	public static void matrixTranslatef(MatrixStack ms, float x, float y, float z) {
		ms.func_227861_a_(x, y, z);
	}

	public static void matrixScalf(MatrixStack ms, float x, float y, float z) {
		ms.func_227862_a_(x, y, z);
	}

	public static void matrixPush(MatrixStack ms) {
		ms.func_227860_a_();
	}

	public static void matrixPop(MatrixStack ms) {
		ms.func_227865_b_();
	}

	public static void glAllRotatef(float x, float y, float z) {
		GL11.glRotatef(x, 1, 0, 0);
		GL11.glRotatef(y, 0, 1, 0);
		GL11.glRotatef(z, 0, 0, 1);
	}

	public static void glTranslatefDegree(float degree, float x, float y, float z, boolean inversion) {
		if (!inversion)
			GL11.glTranslatef(x * degree, y * degree, z * degree);
		else
			GL11.glTranslatef(-x * degree, -y * degree, z * degree);

	}

	public static void glRotatefDegree(float degree, float x, float y, float z, boolean inversion) {
		if (!inversion)
			glAllRotatef(x * degree, y * degree, z * degree);
		else
			glAllRotatef(-x * degree, -y * degree, z * degree);
	}

	public static void glTranslateflRotatefDegree(float degree, float tx, float ty, float tz, float rx, float ry,
			float rz, boolean inversion) {
		glTranslatefDegree(degree, tx, ty, tz, inversion);
		glRotatefDegree(degree, rx, ry, rz, inversion);
	}

	public static void glTranslatefRotatef(float tx, float ty, float tz, float rx, float ry,
			float rz) {
		GL11.glTranslatef(tx, ty, tz);
		glAllRotatef(rx, ry, rz);

	}

	//########### THE IKISUGI ###########

	public static void matrixAllRotateDegreef(MatrixStack ms, float x, float y, float z) {
		matrixRotateDegreefX(ms, x);
		matrixRotateDegreefY(ms, y);
		matrixRotateDegreefZ(ms, z);
	}

	public static void matrixRotateDegreefX(MatrixStack ms, float x) {
		ms.func_227863_a_(new Vector3f(1, 0, 0).func_229187_a_(x));
	}

	public static void matrixRotateDegreefY(MatrixStack ms, float y) {
		ms.func_227863_a_(new Vector3f(0, 1, 0).func_229187_a_(y));
	}

	public static void matrixRotateDegreefZ(MatrixStack ms, float z) {
		ms.func_227863_a_(new Vector3f(0, 0, 1).func_229187_a_(z));
	}

	public static void matrixMaster(MatrixStack ms, float scale, float tx, float ty, float tz, float rx, float ry,
			float rz) {
		matrixScalf(ms, scale, scale, scale);
		matrixMaster(ms, tx, ty, tz, rx, ry, rz);
	}

	public static void matrixMaster(MatrixStack ms, float tx, float ty, float tz, float rx, float ry,
			float rz) {
		matrixAllRotateDegreef(ms, rx, ry, rz);
		matrixTranslatef(ms, tx, ty, tz);
	}

	public static void renderHand(MatrixStack ms, Hand hand, int light, float tx, float ty, float tz, float rx,
			float ry, float rz) {
		AbstractClientPlayerEntity pl = mc.player;
		mc.getTextureManager().bindTexture(pl.getLocationSkin());
		PlayerRenderer plr = (PlayerRenderer) mc.getRenderManager().getRenderer(pl);
		if (hand == Hand.OFF_HAND) {
			tx *= -1;
			ry *= -1;
			rz *= -1;
		}
		matrixMaster(ms, tx, ty, tz, rx, ry, rz);
		if (hand == Hand.MAIN_HAND)
			plr.func_229146_b_(ms, Impl, light, pl);
		else
			plr.func_229144_a_(ms, Impl, light, pl);
	}

	public static void renderHandItem(MatrixStack ms, ItemStack item, int light, Hand hand, float scale, float tx,
			float ty, float tz, float rx, float ry, float rz) {

		if (hand == Hand.OFF_HAND) {
			tx *= -1;
			ry *= -1;
			rz *= -1;
		}
		matrixPush(ms);
		matrixMaster(ms, scale, tx, ty, tz, rx, ry, rz);
		FirstPersonRenderer fpr = mc.getFirstPersonRenderer();
		fpr.func_228397_a_(mc.player, item,
				hand == Hand.MAIN_HAND ? TransformType.FIRST_PERSON_RIGHT_HAND : TransformType.FIRST_PERSON_LEFT_HAND,
				true, ms, Impl, light);
		matrixPop(ms);
	}

	public static void renderHandItem(MatrixStack ms, ItemStack stack, int light,
			Hand handtyape, float scale, float tx, float ty, float tz, float rx, float ry, float rz, float degree,
			float dtx, float dty, float dtz, float drx, float dry, float drz) {
		RenderHelper.renderHandItem(ms, stack, light, handtyape, scale, tx + (dtx * degree),
				ty + (dty * degree), tz + (dtz * degree), rx + (drx * degree), ry + (dry * degree),
				rz + (drz * degree));
	}

	public static void renderHandItem(MatrixStack ms, ItemStack stack, int light, Hand handtyape, float scale, float tx,
			float ty, float tz, float rx, float ry, float rz, float degree, float dtx, float dty, float dtz, float drx,
			float dry, float drz, float bdegree, float btx, float bty, float btz, float brx, float bry, float brz) {

		RenderHelper.renderHandItem(ms, stack, light, handtyape, scale, tx + (dtx * degree) + (btx * bdegree),
				ty + (dty * degree) + (bty * bdegree), tz + (dtz * degree) + (btz * bdegree),
				rx + (drx * degree) + (brx * bdegree), ry + (dry * degree) + (bry * bdegree),
				rz + (drz * degree) + (brz * bdegree));
	}
}
