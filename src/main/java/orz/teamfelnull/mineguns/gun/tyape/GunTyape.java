package orz.teamfelnull.mineguns.gun.tyape;

import net.minecraft.client.resources.I18n;

public class GunTyape {
	private String Name;// 蜷榊燕
	private float DamegeCorrection;// 謾ｻ謦�蜉�
	private float KnockbackCorrection;// 繝弱ャ繧ｯ繝舌ャ繧ｯ
	private float PropulsionCorrection;// 謗ｨ騾ｲ蜉�
	private float PenetratingCorrection;// 雋ｫ騾壼鴨
	private float BlazeCorrection;// 騾｣蟆�蜉�
	private float EnduranceCorrection;// 閠蝉ｹ�蜉�
	private float AccuracyCorrection;// 邊ｾ蠎ｦ
	private float HoldCorrection;

	public GunTyape(String name, float damegecorrection, float knockbackcorrection, float propulsioncorrection,
			float penetratingcorrection, float blazecorrection, float endurancection, float accuraccorrectiony,
			float holdction) {
		this.Name = name;
		this.DamegeCorrection = damegecorrection;
		this.KnockbackCorrection = knockbackcorrection;
		this.PropulsionCorrection = propulsioncorrection;
		this.PenetratingCorrection = penetratingcorrection;
		this.BlazeCorrection = blazecorrection;
		this.EnduranceCorrection = endurancection;
		this.AccuracyCorrection = accuraccorrectiony;
		this.HoldCorrection = holdction;
	}

	public String getName() {

		return this.Name;
	}

	public String getLocalizedName() {
		return I18n.format("gun.tyape." + this.Name + ".name");
	}

	public float getDamegeCorrection() {
		return this.DamegeCorrection;
	}

	public float getKnockbackCorrection() {
		return this.KnockbackCorrection;
	}

	public float getPropulsionCorrection() {
		return this.PropulsionCorrection;
	}

	public float getPenetratingCorrection() {
		return this.PenetratingCorrection;
	}

	public float getBlazeCorrection() {
		return this.BlazeCorrection;
	}

	public float getEnduranceCorrection() {
		return this.EnduranceCorrection;
	}

	public float getAccuracyCorrection() {
		return this.AccuracyCorrection;
	}

	public float getHoldCorrection() {
		return this.HoldCorrection;
	}
}
