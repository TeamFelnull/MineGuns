package orz.teamfelnull.mineguns.gun;

public class Gun {
	private String Name;//名前
	private GunTyape GunTyape;//銃タイプ
	private boolean Semi;//セミオートかどうか
	private int Capacity;//装填数
	private float Damege;//攻撃力
	private float Knockback;//ノックバック
	private float Propulsion;//推進力
	private float Penetrating;//貫通力、何体まで貫通するか
	private float Blaze;//連射力、秒間何発か
	private int Endurance;//耐久力

	public Gun(String name, GunTyape guntyape, boolean semi, int capacity, float damege, float knockback,
			float propulsion, float penetrating, float blaze, int endurance) {
		this.Name = name;
		this.Semi = semi;
		this.Capacity = capacity;
		this.Damege = damege;
		this.Knockback = knockback;
		this.Propulsion = propulsion;
		this.Penetrating = penetrating;
		this.Blaze = blaze;
		this.GunTyape = guntyape;
		this.Endurance = endurance;
	}

	public String getName() {
		return this.Name;
	}

	public GunTyape getGunTyape() {
		return this.GunTyape;
	}

	public boolean isSemiAuto() {
		return this.Semi;
	}

	public int getCapacity() {
		return this.Capacity;
	}

	public float getDamege() {
		return this.Damege * GunTyape.getDamegeCorrection();
	}

	public float getKnockback() {
		return this.Knockback * GunTyape.getKnockbackCorrection();
	}

	public float getPropulsion() {
		return this.Propulsion * GunTyape.getPropulsionCorrection();
	}

	public float getPenetrating() {
		return this.Penetrating * GunTyape.getPenetratingCorrection();
	}

	public float getBlaze() {
		return this.Blaze * GunTyape.getBlazeCorrection();
	}

	public int getEndurance() {
		return (int) (this.Endurance * GunTyape.getEndurance());
	}
}
