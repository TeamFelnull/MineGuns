package orz.teamfelnull.mineguns.client.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import orz.teamfelnull.mineguns.item.GunItem;
import orz.teamfelnull.mineguns.packet.PacketHandler;
import orz.teamfelnull.mineguns.packet.message.GunStateMessage;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientHandler {
	public static Minecraft mc = Minecraft.getInstance();

	public static boolean semishot;

	@SubscribeEvent
	public static void onTick(ClientTickEvent e) {

		if (mc.player != null) {
			Item mainitemstack = mc.player.getHeldItemMainhand().getItem();
			Item offitemstack = mc.player.getHeldItemOffhand().getItem();
			if ((mainitemstack instanceof GunItem) || (offitemstack instanceof GunItem)) {
				if (isGunShot()) {
					PacketHandler.INSTANCE.sendToServer(new GunStateMessage(1));//打つ
				}
				if (isHold()) {
					PacketHandler.INSTANCE.sendToServer(new GunStateMessage(2));//構え
				}
				if (isGunShot() && !semishot) {
					PacketHandler.INSTANCE.sendToServer(new GunStateMessage(3));//セミオートで打つ
					semishot = true;
				}
				if (!isGunShot()) {
					semishot = false;
				}
			}
		}

	}

	public static boolean isGunShot() {
		return mc.gameSettings.keyBindAttack.isKeyDown();
	}

	public static boolean isHold() {
		return mc.gameSettings.keyBindUseItem.isKeyDown();
	}
}
