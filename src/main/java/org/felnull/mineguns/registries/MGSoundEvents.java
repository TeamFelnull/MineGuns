package org.felnull.mineguns.registries;

import org.felnull.mineguns.MineGuns;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class MGSoundEvents {
	public static final SoundEvent GUN_SHOT_HANDGUN = sound("gun.shot.handgun");

	private static SoundEvent sound(String name) {
		return new SoundEvent(new ResourceLocation(MineGuns.MODID, name))
				.setRegistryName(new ResourceLocation(MineGuns.MODID, name));
	}

	public static void registerSound(IForgeRegistry<SoundEvent> r) {
		registrySound(r, GUN_SHOT_HANDGUN);
	}

	private static void registrySound(IForgeRegistry<SoundEvent> r, SoundEvent s) {
		MineGuns.LOGGER.info("Registering Sound : " + s.getRegistryName());
		r.register(s);
	}
}
