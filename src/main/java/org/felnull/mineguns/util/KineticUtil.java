package org.felnull.mineguns.util;

public class KineticUtil {
	public static float calculationKineticEnergyJ(float massKg, float speedMs) {

		return 1f / 2f * massKg * speedMs * speedMs;
	}

	public static float calculationInitialSpeedMs(float massKg, float kineticJ) {

		return (float) Math.sqrt(kineticJ / (1f / 2f * massKg));
	}

	public static float calculationMassKg(float speedMs, float kineticJ) {

		return kineticJ / (1f / 2f * speedMs * speedMs);
	}
}
