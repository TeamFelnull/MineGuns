package orz.teamfelnull.mineguns.client.handler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.InputEvent.KeyInputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KeyHandler {
	public static Minecraft mc = Minecraft.getInstance();
	public static int debuck;

	@SubscribeEvent
	public static void onKeyInput(KeyInputEvent e) {
		System.out.println("test=" + debuck);
		if (mc.gameSettings.keyBindSprint.isPressed()) {
			debuck++;
		}
		if (mc.gameSettings.keyBindDrop.isPressed()) {
			debuck--;
		}
	}
}
