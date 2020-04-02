package org.felnull.mineguns.util;

public class OEMath {
	public static int convertIntegerFromString(String name) {
		int n = 0;
		int m = 0;
		for (char c : name.toCharArray()) {
			m++;
			n = n + (int) c * m;
		}
		return n;
	}

	public static int differenceInt(int n1, int n2) {
		int r = n1 - n2;

		return positiveInt(r);
	}

	public static int averageInt(int... n) {
		int r = 0;
		for (int a : n) {
			r += a;
		}
		r /= n.length;
		return r;
	}

	public static int positiveInt(int n) {
		int r = n;
		if (r <= -1)
			r *= -1;
		return r;
	}

	public static int negativeInt(int n) {
		int r = n;
		if (r >= 1)
			r *= -1;
		return r;
	}

	public static float positiveFloat(float n) {
		float r = n;
		if (r <= -1)
			r *= -1;
		return r;
	}

	public static float negativeFloat(float n) {
		float r = n;
		if (r >= 1)
			r *= -1;
		return r;
	}

	public static boolean isRangeIn(int n, int n1, int n2) {

		if (n1 == n2)
			return n1 == n;

		if (n1 <= n2)
			return n >= n1 && n <= n2;

		if (n1 >= n2)
			return n <= n1 && n >= n2;

		return false;
	}

	public static boolean isRangeOut(int n, int n1, int n2) {
		return !isRangeIn(n, n1, n2);
	}

	public static boolean isRangeIn(float n, float n1, float n2) {

		if (n1 == n2)
			return n1 == n;

		if (n1 <= n2)
			return n >= n1 && n <= n2;

		if (n1 >= n2)
			return n <= n1 && n >= n2;

		return false;
	}

	public static boolean isRangeOut(float n, float n1, float n2) {
		return !isRangeIn(n, n1, n2);
	}
}
