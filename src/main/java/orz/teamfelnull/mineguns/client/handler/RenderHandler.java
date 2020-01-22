package orz.teamfelnull.mineguns.client.handler;

import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.FirstPersonRenderer;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.util.Hand;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import orz.teamfelnull.mineguns.item.GunItem;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RenderHandler {
	public static Minecraft mc = Minecraft.getInstance();
	private static IRenderTypeBuffer Impl = IRenderTypeBuffer
			.func_228455_a_(new BufferBuilder(256));

	@SubscribeEvent
	public static void onModel(ModelBakeEvent e) {

	}

	@SubscribeEvent
	public static void onRenderSpecificHand(RenderSpecificHandEvent e) {
		if (e.getItemStack().getItem() instanceof GunItem) {

			Hand hand = e.getHand();
			float tx = 0.5f;
			float ty = -1.1f;
			float tz = -0.9f;
			//((float) KeyHandler.debuck / 10)

			float rx = -20;
			float ry = 0;
			float rz = 0;
			if (hand == Hand.OFF_HAND) {
				tx *= -1;
			}

			{
				AbstractClientPlayerEntity pl = mc.player;
				mc.getTextureManager().bindTexture(pl.getLocationSkin());
				PlayerRenderer plr = (PlayerRenderer) mc.getRenderManager()
						.getRenderer(pl);
				GL11.glPushMatrix();
				MatrixStack ms = new MatrixStack();
				GL11.glTranslatef(tx, ty, tz);
				GL11.glRotatef(rx, 1, 0, 0);
				GL11.glRotatef(ry, 0, 1, 0);
				GL11.glRotatef(rz, 0, 0, 1);
				if (hand == Hand.MAIN_HAND) {
					plr.func_229146_b_(ms, Impl, 200, pl);
				} else {
					plr.func_229144_a_(ms, Impl, 200, pl);
				}
				GL11.glPopMatrix();
			}

			{
				MatrixStack ms = new MatrixStack();
				GL11.glPushMatrix();
				ms.func_227862_a_(0, ((float) KeyHandler.debuck / 10), 0);
				//GL11.glTranslatef(((float) KeyHandler.debuck / 10), 0, 0);
				FirstPersonRenderer fpr = mc.getFirstPersonRenderer();
				fpr.func_228397_a_(mc.player, e.getItemStack(),
						hand == Hand.MAIN_HAND ? TransformType.FIRST_PERSON_RIGHT_HAND
								: TransformType.FIRST_PERSON_LEFT_HAND,
						false, ms, Impl, 0);

				GL11.glPopMatrix();
			}

			e.setCanceled(true);

		}
	}
	//Map<ResourceLocation, IBakedModel> r = e.getModelRegistry();

	//registerModel(MGItems.TEST_GUN, null, r);
	/*	private static void registerModel(Item item, IBakedModel model, Map<ResourceLocation, IBakedModel> r) {

			ModelResourceLocation loc = new ModelResourceLocation(item.getRegistryName(), "inventory");
			r.put(loc, model);
		}*/
	/*
		@SubscribeEvent
		public static void onHand(RenderHandEvent e) {

			ClientPlayerEntity pl = mc.player;
			Item mainitemstack = pl.getHeldItemMainhand().getItem();
			Item offitemstack = pl.getHeldItemOffhand().getItem();

			if ((mainitemstack instanceof GunItem) || (offitemstack instanceof GunItem)) {
				e.setCanceled(true);

			}
		}*/
}
