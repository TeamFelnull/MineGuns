package org.felnull.mineguns.bullet.type;

public class BulletType {
	private String Name;
	private float MassCorrection;
	private float MuzzleEnergyCorrection;

	public BulletType(String name, float massCorrection, float muzzleEnergyCorrection) {
		Name = name;
		MassCorrection = massCorrection;
		MuzzleEnergyCorrection = muzzleEnergyCorrection;
	}

	public String getName() {
		return Name;
	}

	public float getMassCorrection() {
		return MassCorrection;
	}

	public float getMuzzleEnergyCorrection() {
		return MuzzleEnergyCorrection;
	}

}
