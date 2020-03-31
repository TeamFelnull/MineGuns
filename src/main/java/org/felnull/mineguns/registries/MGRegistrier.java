package org.felnull.mineguns.registries;

import org.felnull.mineguns.client.render.gun.animaiton.GunAnimation;
import org.felnull.mineguns.gun.Gun;

import net.minecraft.util.ResourceLocation;

public class MGRegistrier {
	public static void registrierGunAnimation(Gun gun, GunAnimation animation) {
		MGRegistries.GUN_ANIMATIONS.put(gun, animation);
	}

	public static GunAnimation getGunAnimation(Gun gun) {

		if (MGRegistries.GUN_ANIMATIONS.containsKey(gun))
			return MGRegistries.GUN_ANIMATIONS.get(gun);
		else
			return null;
	}

	public static void registrierGun(Gun gun, ResourceLocation rname) {
		MGRegistries.GUNS.put(rname, gun);
	}

	public static Gun getGun(ResourceLocation rname) {
		if (MGRegistries.GUNS.containsKey(rname))
			return MGRegistries.GUNS.get(rname);
		else
			return null;
	}

}
