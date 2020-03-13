package org.felnull.mineguns.client.handler;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.InputEvent.KeyInputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KeyHandler {
	public static Minecraft mc = Minecraft.getInstance();

	public static int bangou = 0;

	public static float bairitu = 1;

	public static float deb_ido_x;
	public static float deb_ido_y;
	public static float deb_ido_z;

	public static float deb_kakudo_x;
	public static float deb_kakudo_y;
	public static float deb_kakudo_z;

	public static float deb_ido_x2;
	public static float deb_ido_y2;
	public static float deb_ido_z2;

	public static float deb_kakudo_x2;
	public static float deb_kakudo_y2;
	public static float deb_kakudo_z2;

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
	public static KeyBinding DEBUG_BAIRITU_UP = new KeyBinding("key.dubg_bairitu_up", GLFW.GLFW_KEY_H,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_BAIRITU_DOWN = new KeyBinding("key.dubg_bairitu_down", GLFW.GLFW_KEY_B,
			"key.categories.mineguns.debug");

	public static KeyBinding DEBUG_BANGOU_UP = new KeyBinding("key.dubg_bangou_up", GLFW.GLFW_KEY_G,
			"key.categories.mineguns.debug");
	public static KeyBinding DEBUG_BANGOU_DOWN = new KeyBinding("key.dubg_bangou_down", GLFW.GLFW_KEY_V,
			"key.categories.mineguns.debug");

	public static void init() {
		set(-0.7299993f, 0.04699999f, 0.16800275f, -0.029000001f, -0.028f, -0.163f);
		//	set(0, 0, 0, 0, 0, 0);
	}

	public static void set(float tx, float ty, float tz, float rx, float ry, float rz) {
		deb_ido_x = tx;
		deb_ido_y = ty;
		deb_ido_z = tz;

		deb_kakudo_x = rx;
		deb_kakudo_y = ry;
		deb_kakudo_z = rz;
	}

	@SubscribeEvent
	public static void onKeyInput(KeyInputEvent e) {

		if (DEBUG_LEFT.isPressed()) {
			if (bangou == 0)
				deb_ido_x += bairitu;
			else if (bangou == 1)
				deb_ido_x2 += bairitu;
		}
		if (DEBUG_RIGHT.isPressed()) {
			if (bangou == 0)
				deb_ido_x -= bairitu;
			else if (bangou == 1)
				deb_ido_x2 -= bairitu;
		}
		if (DEBUG_UP.isPressed()) {
			if (bangou == 0)
				deb_ido_y += bairitu;
			else if (bangou == 1)
				deb_ido_y2 += bairitu;
		}
		if (DEBUG_DOWN.isPressed()) {
			if (bangou == 0)
				deb_ido_y -= bairitu;
			else if (bangou == 1)
				deb_ido_y2 -= bairitu;
		}
		if (DEBUG_PUSH.isPressed()) {
			if (bangou == 0)
				deb_ido_z += bairitu;
			else if (bangou == 1)
				deb_ido_z2 += bairitu;
		}
		if (DEUBG_PULL.isPressed()) {
			if (bangou == 0)
				deb_ido_z -= bairitu;
			else if (bangou == 1)
				deb_ido_z2 -= bairitu;

		}
		if (DEBUG_LEFT2.isPressed()) {
			if (bangou == 0)
				deb_kakudo_x += bairitu;
			else if (bangou == 1)
				deb_kakudo_x2 += bairitu;
		}
		if (DEBUG_RIGHT2.isPressed()) {
			if (bangou == 0)
				deb_kakudo_x -= bairitu;
			else if (bangou == 1)
				deb_kakudo_x2 -= bairitu;
		}
		if (DEBUG_UP2.isPressed()) {
			if (bangou == 0)
				deb_kakudo_y += bairitu;
			else if (bangou == 1)
				deb_kakudo_y2 += bairitu;

		}
		if (DEBUG_DOWN2.isPressed()) {
			if (bangou == 0)
				deb_kakudo_y -= bairitu;
			else if (bangou == 1)
				deb_kakudo_y2 -= bairitu;
		}
		if (DEBUG_PUSH2.isPressed()) {
			if (bangou == 0)
				deb_kakudo_z += bairitu;
			else if (bangou == 1)
				deb_kakudo_z2 += bairitu;
		}
		if (DEUBG_PULL2.isPressed()) {
			if (bangou == 0)
				deb_kakudo_z -= bairitu;
			else if (bangou == 1)
				deb_kakudo_z2 -= bairitu;
		}
		if (DEBUG_RESET.isPressed()) {
			if (bangou == 0) {
				init();
			} else if (bangou == 1) {
				deb_ido_x2 = 0;
				deb_ido_y2 = 0;
				deb_ido_z2 = 0;
				deb_kakudo_x2 = 0;
				deb_kakudo_y2 = 0;
				deb_kakudo_z2 = 0;
			}

			bairitu = 1;
		}
		if (DEBUG_BANGOU_UP.isPressed()) {
			bangou++;
			mc.player.sendChatMessage("bangou=" + bangou);

		}
		if (DEBUG_BANGOU_DOWN.isPressed()) {
			bangou--;
			mc.player.sendChatMessage("bangou=" + bangou);

		}
		if (DEBUG_BAIRITU_UP.isPressed()) {
			bairitu *= 10;
			mc.player.sendChatMessage("bairitu=" + bairitu);

		}
		if (DEBUG_BAIRITU_DOWN.isPressed()) {
			bairitu /= 10;
			mc.player.sendChatMessage("bairitu=" + bairitu);

		}
		if (DEBUG_OUT.isPressed()) {
			System.out.println("[" + deb_ido_x + "f, " + deb_ido_y + "f, "
					+ deb_ido_z + "f, " + deb_kakudo_x + "f, "
					+ deb_kakudo_y
					+ "f, " + deb_kakudo_z + "f" + "]");

			mc.player.sendChatMessage(
					"output:" + "[" + deb_ido_x + "f, " + deb_ido_y + "f, "
							+ deb_ido_z + "f, " + deb_kakudo_x + "f, "
							+ deb_kakudo_y
							+ "f, " + deb_kakudo_z + "f" + "]");
		}

	}

}
