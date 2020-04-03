package org.felnull.mineguns.bullet;

public class Bullet {
	private String Name;// 名前
	private float Mass; //質量(g)
	private float MuzzleEnergy;//マズルエネルギー(J)

	public Bullet(String name, float mass, float muzzleEnergy) {
		this.Name = name;
		Mass = mass;
		MuzzleEnergy = muzzleEnergy;
	}

	public String getName() {
		return this.Name;
	}

	public float getMuzzleEnergy() {
		return MuzzleEnergy;
	}

	public float getMass() {
		return Mass;
	}

}
