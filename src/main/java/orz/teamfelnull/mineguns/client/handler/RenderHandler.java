package orz.teamfelnull.mineguns.client.handler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RenderHandler {
	public static Minecraft mc = Minecraft.getInstance();

	@SubscribeEvent
	public static void onModel(ModelBakeEvent e) {

	}
	/*
		@SubscribeEvent
		public static void onRenderSpecificHand(RenderSpecificHandEvent e) {
			if (e.getItemStack().getItem() instanceof GunItem) {

				((GunItem) e.getItemStack().getItem()).getGun().renderSpecificHand(e);
			}
		}*/
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
