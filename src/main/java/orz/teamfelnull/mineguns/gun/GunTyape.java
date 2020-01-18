package orz.teamfelnull.mineguns.gun;

public class GunTyape {
	private String Name;//名前
	private float DamegeCorrection;//攻撃力
	private float KnockbackCorrection;//ノックバック
	private float PropulsionCorrection;//推進力
	private float PenetratingCorrection;//貫通力
	private float BlazeCorrection;//連射力

	public GunTyape(String name, float damegecorrection, float knockbackcorrection, float propulsioncorrection,
			float penetratingcorrection, float blazecorrection) {
		this.Name = name;
		this.DamegeCorrection = damegecorrection;
		this.KnockbackCorrection = knockbackcorrection;
		this.PropulsionCorrection = propulsioncorrection;
		this.PenetratingCorrection = penetratingcorrection;
		this.BlazeCorrection = blazecorrection;
	}

	public String getName() {
		return this.Name;
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
}
