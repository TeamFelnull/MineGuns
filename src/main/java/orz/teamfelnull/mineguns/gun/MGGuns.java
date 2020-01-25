package orz.teamfelnull.mineguns.gun;

import orz.teamfelnull.mineguns.client.render.gun.animaiton.MGGunAanimations;
import orz.teamfelnull.mineguns.gun.tyape.MGGunTyapes;

public class MGGuns {
	// 名前,銃タイプ,セミオートかどうか,装填数,攻撃力,ノックバック,推進力,貫通力,連射力,耐久力,精度
	public static Gun TEST = new Gun("test", MGGunTyapes.HANDGUN, MGGunAanimations.TMP, false, 15, 5.5f, 1, 10, 1, 10,
			1000, 1);
	public static Gun TMP = new Gun("tmp", MGGunTyapes.SUBMACHINEGUN, MGGunAanimations.TMP, false, 15, 5.5f, 1, 10, 1,
			3, 1000, 1);

}
