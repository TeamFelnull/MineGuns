package org.felnull.mineguns.client.handler;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.InputEvent.KeyInputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KeyHandler {
	public static Minecraft mc = Minecraft.getInstance();

	private static int deb_ido_x;
	private static int deb_ido_y;
	private static int deb_ido_z;

	private static int deb_kakudo_x;
	private static int deb_kakudo_y;
	private static int deb_kakudo_z;

	public static float deb_ido_x_j;
	public static float deb_ido_y_j;
	public static float deb_ido_z_j;

	public static float deb_kakudo_x_j;
	public static float deb_kakudo_y_j;
	public static float deb_kakudo_z_j;

	public static KeyBinding DEBUG_LEFT = new KeyBinding("key.dubg_left", GLFW.GLFW_KEY_RIGHT,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_RIGHT = new KeyBinding("key.dubg_right", GLFW.GLFW_KEY_LEFT,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_UP = new KeyBinding("key.dubg_up", GLFW.GLFW_KEY_UP,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_DOWN = new KeyBinding("key.dubg_down", GLFW.GLFW_KEY_DOWN,
			"key.categories.mineguns.debug");

	public static KeyBinding DEBUG_PUSH = new KeyBinding("key.dubg_push", GLFW.GLFW_KEY_J,
			"key.categories.mineguns.debug");
	public static KeyBinding DEUBG_PULL = new KeyBinding("key.dubg_pull", GLFW.GLFW_KEY_K,
			"key.categories.mineguns.debug");

	public static KeyBinding DEBUG_LEFT2 = new KeyBinding("key.dubg_left2", GLFW.GLFW_KEY_DELETE,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_RIGHT2 = new KeyBinding("key.dubg_right2", GLFW.GLFW_KEY_PAGE_DOWN,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_UP2 = new KeyBinding("key.dubg_up2", GLFW.GLFW_KEY_HOME,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_DOWN2 = new KeyBinding("key.dubg_down2", GLFW.GLFW_KEY_END,
			"key.categories.mineguns.debug");

	public static KeyBinding DEBUG_PUSH2 = new KeyBinding("key.dubg_push2", GLFW.GLFW_KEY_I,
			"key.categories.mineguns.debug");
	public static KeyBinding DEUBG_PULL2 = new KeyBinding("key.dubg_pull2", GLFW.GLFW_KEY_O,
			"key.categories.mineguns.debug");

	public static KeyBinding DEBUG_OUT = new KeyBinding("key.dubg_out", GLFW.GLFW_KEY_ENTER,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_RESET = new KeyBinding("key.dubg_reset", GLFW.GLFW_KEY_N,
			"key.categories.mineguns.debug");

	public static void setJ(int idobaisuu, int kakudobaisuu) {
		deb_ido_x_j = (float) deb_ido_x / idobaisuu;
		deb_ido_y_j = (float) deb_ido_y / idobaisuu;
		deb_ido_z_j = (float) deb_ido_z / idobaisuu;

		deb_kakudo_x_j = (float) deb_kakudo_x / kakudobaisuu;
		deb_kakudo_y_j = (float) deb_kakudo_y / kakudobaisuu;
		deb_kakudo_z_j = (float) deb_kakudo_z / kakudobaisuu;
	}

	@SubscribeEvent
	public static void onKeyInput(KeyInputEvent e) {
		//	System.out.println("test=" + debuck + "test2=" + debuck2 + "test3=" + debuck3 + "n=" + debuckn);
		//	System.out.println("testss=" + debucka + "testss2=" + debucka2 + "testss3=" + debucka3 + "ssn=" + debuckan);

		if (DEBUG_LEFT.isPressed())
			deb_ido_x++;

		if (DEBUG_RIGHT.isPressed())
			deb_ido_x--;

		if (DEBUG_UP.isPressed())
			deb_ido_y++;

		if (DEBUG_DOWN.isPressed())
			deb_ido_y--;

		if (DEBUG_PUSH.isPressed())
			deb_ido_z++;

		if (DEUBG_PULL.isPressed())
			deb_ido_z--;

		if (DEBUG_LEFT2.isPressed())
			deb_kakudo_x++;

		if (DEBUG_RIGHT2.isPressed())
			deb_kakudo_x--;

		if (DEBUG_UP2.isPressed())
			deb_kakudo_y++;

		if (DEBUG_DOWN2.isPressed())
			deb_kakudo_y--;

		if (DEBUG_PUSH2.isPressed())
			deb_kakudo_z++;

		if (DEUBG_PULL2.isPressed())
			deb_kakudo_z--;

		if (DEBUG_RESET.isPressed()) {

			deb_ido_x = 0;
			deb_ido_y = 0;
			deb_ido_z = 0;
			deb_kakudo_x = 0;
			deb_kakudo_y = 0;
			deb_kakudo_z = 0;

		}

		setJ(100, 10);

		if (DEBUG_OUT.isPressed()) {
			System.out.println("[" + deb_ido_x_j + "f, " + deb_ido_y_j + "f, "
					+ deb_ido_z_j + "f, " + deb_kakudo_x_j + "f, "
					+ deb_kakudo_y_j
					+ "f, " + deb_kakudo_z_j + "f" + "]");

			mc.player.sendChatMessage(
					"output:" + "[" + deb_ido_x_j + "f, " + deb_ido_y_j + "f, "
							+ deb_ido_z_j + "f, " + deb_kakudo_x_j + "f, "
							+ deb_kakudo_y_j
							+ "f, " + deb_kakudo_z_j + "f" + "]");
		}

	}

}
