package orz.teamfelnull.mineguns.client.handler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import orz.teamfelnull.mineguns.packet.PacketHandler;
import orz.teamfelnull.mineguns.packet.message.GunStateMessage;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientHandler {
	public static Minecraft mc = Minecraft.getInstance();

	@SubscribeEvent
	public static void onTick(ClientTickEvent e) {
		if (isGunShot()) {
			PacketHandler.INSTANCE.sendToServer(new GunStateMessage(1));//打つ
		}
		if (isHold()) {
			PacketHandler.INSTANCE.sendToServer(new GunStateMessage(2));//構え
		}
	}

	public static boolean isGunShot() {
		return mc.gameSettings.keyBindAttack.isKeyDown();
	}

	public static boolean isHold() {
		return mc.gameSettings.keyBindUseItem.isKeyDown();
	}
}
