package org.felnull.mineguns.gun;

import org.felnull.mineguns.MineGuns;
import org.felnull.mineguns.client.render.gun.animaiton.GunAnimation;
import org.felnull.mineguns.client.render.gun.animaiton.MGGunAanimations;
import org.felnull.mineguns.gun.tyape.MGGunTyapes;
import org.felnull.mineguns.registries.MGRegistrier;

import net.minecraft.util.ResourceLocation;

public class MGGuns {
	// 名前,銃タイプ,バースド数（0でフルオート,1でセミオート),装填数,攻撃力,ノックバック,推進力,貫通力,連射力,耐久力,精度,構え速度
	public static Gun TEST = new Gun("test", MGGunTyapes.HANDGUN, 0, 15, 5.5f, 1, 10, 1, 20,
			1000, 1, 20);
	public static Gun TMP = new Gun("tmp", MGGunTyapes.SUBMACHINEGUN, 0, 15, 5.5f, 1, 2, 1,
			3, 1000, 1, 10);
	public static Gun HK433 = new Gun("hk433", MGGunTyapes.RIFL, 0, 15, 5.5f, 1, 10, 1, 3,
			1000, 1, 20);
	public static Gun MK23 = new Gun("mk23", MGGunTyapes.HANDGUN, 1, 15, 5.5f, 1, 10, 1, 3,
			1000, 1, 7);

	public static void registerGun() {
		registryGun(TEST, new ResourceLocation(MineGuns.MODID, "test"));
		registryGun(TMP, new ResourceLocation(MineGuns.MODID, "tmp"));
		registryGun(HK433, new ResourceLocation(MineGuns.MODID, "hk433"));
		registryGun(MK23, new ResourceLocation(MineGuns.MODID, "mk23"));
	}

	public static void registerGunAnimation() {
		registryGunAnimation(TEST, MGGunAanimations.TMP);
		registryGunAnimation(TMP, MGGunAanimations.TMP);
		registryGunAnimation(HK433, MGGunAanimations.HK433);
		registryGunAnimation(MK23, MGGunAanimations.MK23);
	}

	private static void registryGunAnimation(Gun gun, GunAnimation animation) {
		MineGuns.LOGGER.info("Registering GunAnimation : " + gun.getName());
		MGRegistrier.registrierGunAnimation(gun, animation);

	}

	private static void registryGun(Gun gun, ResourceLocation rname) {
		MineGuns.LOGGER.info("Registering Gun : " + rname);
		MGRegistrier.registrierGun(gun, rname);

	}
}
