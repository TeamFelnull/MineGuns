package orz.teamfelnull.mineguns.client.handler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import orz.teamfelnull.mineguns.client.render.gun.animaiton.GunAnimation;
import orz.teamfelnull.mineguns.item.GunItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RenderHandler {
	public static Minecraft mc = Minecraft.getInstance();

	@SubscribeEvent
	public static void onModel(ModelBakeEvent e) {

	}

	@SubscribeEvent
	public static void onRenderSpecificHand(RenderHandEvent e) {

		if (e.getItemStack().getItem() instanceof GunItem) {
			GunItem gun = (GunItem) e.getItemStack().getItem();
			GunAnimation animation = gun.getGun().getGunAnimation();
			animation.renderHand(e.getHand(), e.getItemStack());
			e.setCanceled(true);
		}
	}
	// Hand hand = e.getHand();
//((float) KeyHandler.debuck / 100)
	/*
	 * RenderHelper.renderGunHand(hand, 0.87f, -0.29f, -1.02, -0.54f, -0.1f, 0.31f);
	 *
	 * RenderHelper.renderGunItem(e.getItemStack(), hand == Hand.MAIN_HAND ?
	 * TransformType.FIRST_PERSON_RIGHT_HAND : TransformType.FIRST_PERSON_LEFT_HAND,
	 * 3, 0.235f, -0.33f, -0.53f, 0.07f, 0, 0);
	 */
}
