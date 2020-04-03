package org.felnull.mineguns.client.render.entity;

import org.felnull.mineguns.client.helper.RenderHelper;
import org.felnull.mineguns.entity.BulletEntity;
import org.felnull.mineguns.item.MGItems;
import org.felnull.mineguns.util.OEMath;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("deprecation")
public class BulletRenderer extends EntityRenderer<BulletEntity> {

	public BulletRenderer(EntityRendererManager renderManager) {
		super(renderManager);

	}

	@Override
	public void func_225623_a_(BulletEntity entity, float p_225623_2_, float p_225623_3_, MatrixStack matx,
			IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
		RenderHelper.matrixPush(matx);

		RenderHelper.matrixScalf(matx, 1, 1, 1);
		RenderHelper.matrixTranslatef(matx, 00.0050000735f,
				0.014000412f + (-0.0143f / 90 * OEMath.positiveFloat(entity.rotationPitch)), -0.003999809f);

		RenderHelper.matrixRotateDegreefY(matx, 180 - entity.rotationYaw);
		RenderHelper.matrixRotateDegreefX(matx, -entity.rotationPitch);
		RenderHelper.matrixRotateDegreefZ(matx, 0);

		Minecraft.getInstance().getItemRenderer().func_229110_a_(new ItemStack(MGItems.BULLET),
				ItemCameraTransforms.TransformType.GROUND, p_225623_6_,
				OverlayTexture.field_229196_a_, matx,
				p_225623_5_);
		RenderHelper.matrixPop(matx);
		super.func_225623_a_(entity, p_225623_2_, p_225623_3_, matx, p_225623_5_, p_225623_6_);
	}

	@Override
	public ResourceLocation getEntityTexture(BulletEntity entity) {
		return null;
	}

}
