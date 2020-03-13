package org.felnull.mineguns.gun;

import org.felnull.mineguns.client.render.gun.animaiton.MGGunAanimations;
import org.felnull.mineguns.gun.tyape.MGGunTyapes;

public class MGGuns {
	// 名前,銃タイプ,セミオートかどうか,装填数,攻撃力,ノックバック,推進力,貫通力,連射力,耐久力,精度,構え速度
	public static Gun TEST = new Gun("test", MGGunTyapes.HANDGUN, MGGunAanimations.TMP, false, 15, 5.5f, 1, 10, 1, 10,
			1000, 1, 50);
	public static Gun TMP = new Gun("tmp", MGGunTyapes.SUBMACHINEGUN, MGGunAanimations.TMP, false, 15, 5.5f, 1, 10, 1,
			3, 1000, 1, 20);
	public static Gun HK433 = new Gun("hk433", MGGunTyapes.RIFL, MGGunAanimations.HK433, false, 15, 5.5f, 1, 10, 1, 3,
			1000, 1, 10);
	public static Gun MK23 = new Gun("mk23", MGGunTyapes.HANDGUN, MGGunAanimations.MK23, true, 15, 5.5f, 1, 10, 1, 3,
			1000, 1, 20);
}
