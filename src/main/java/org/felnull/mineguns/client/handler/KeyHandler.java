package org.felnull.mineguns.client.handler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.InputEvent.KeyInputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KeyHandler {
	public static Minecraft mc = Minecraft.getInstance();
	public static int debuckn;
	public static int debuck;
	public static int debuck2;
	public static int debuck3;

	public static int debuckan;
	public static int debucka;
	public static int debucka2;
	public static int debucka3;

	@SubscribeEvent
	public static void onKeyInput(KeyInputEvent e) {
		System.out.println("test=" + debuck + "test2=" + debuck2 + "test3=" + debuck3 + "n=" + debuckn);
		System.out.println("testss=" + debucka + "testss2=" + debucka2 + "testss3=" + debucka3 + "ssn=" + debuckan);

		if (mc.gameSettings.keyBindJump.isPressed()) {
			if (debuckn != 2) {
				debuckn++;
			} else {
				debuckn = 0;
			}
		}
		if (mc.gameSettings.keyBindSprint.isPressed()) {

			switch (debuckn) {
			case 0:
				debuck++;
				break;
			case 1:
				debuck2++;
				break;
			case 2:
				debuck3++;
				break;
			}

		}
		if (mc.gameSettings.keyBindDrop.isPressed()) {

			switch (debuckn) {
			case 0:
				debuck--;
				break;
			case 1:
				debuck2--;
				break;
			case 2:
				debuck3--;
				break;
			}
		}

		if (mc.gameSettings.keyBindChat.isPressed()) {
			if (debuckan != 2) {
				debuckan++;
			} else {
				debuckan = 0;
			}
		}
		if (mc.gameSettings.keyBindRight.isPressed()) {

			switch (debuckan) {
			case 0:
				debucka++;
				break;
			case 1:
				debucka2++;
				break;
			case 2:
				debucka3++;
				break;
			}

		}
		if (mc.gameSettings.keyBindLeft.isPressed()) {

			switch (debuckan) {
			case 0:
				debucka--;
				break;
			case 1:
				debucka2--;
				break;
			case 2:
				debucka3--;
				break;
			}
		}

		if (mc.gameSettings.keyBindSwapHands.isPressed()) {
			System.out.println(((float) debuck / 100) + "f, " + ((float) debuck2 / 100) + "f, "
					+ ((float) debuck3 / 100) + "f, " + ((float) debucka / 100) + "f, " + ((float) debucka2 / 100)
					+ "f, " + ((float) debucka3 / 100) + "f");
		}

	}

}
