package orz.teamfelnull.mineguns.gun;

import net.minecraft.client.resources.I18n;

public class GunTyape {
	private String Name;//名前
	private float DamegeCorrection;//攻撃力
	private float KnockbackCorrection;//ノックバック
	private float PropulsionCorrection;//推進力
	private float PenetratingCorrection;//貫通力
	private float BlazeCorrection;//連射力
	private float EnduranceCorrection;//耐久力
	private float AccuracyCorrection;//精度

	public GunTyape(String name, float damegecorrection, float knockbackcorrection, float propulsioncorrection,
			float penetratingcorrection, float blazecorrection, float endurancection, float accuraccorrectiony) {
		this.Name = name;
		this.DamegeCorrection = damegecorrection;
		this.KnockbackCorrection = knockbackcorrection;
		this.PropulsionCorrection = propulsioncorrection;
		this.PenetratingCorrection = penetratingcorrection;
		this.BlazeCorrection = blazecorrection;
		this.EnduranceCorrection = endurancection;
		this.AccuracyCorrection = accuraccorrectiony;
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
}
