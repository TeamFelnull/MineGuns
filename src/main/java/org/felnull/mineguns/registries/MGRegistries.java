package org.felnull.mineguns.registries;

import java.util.HashMap;
import java.util.Map;

import org.felnull.mineguns.client.render.gun.animaiton.GunAnimation;
import org.felnull.mineguns.gun.Gun;

import net.minecraft.util.ResourceLocation;

public class MGRegistries {
	public static Map<ResourceLocation, Gun> GUNS = new HashMap<ResourceLocation, Gun>();
	public static Map<Gun, GunAnimation> GUN_ANIMATIONS = new HashMap<Gun, GunAnimation>();

}
