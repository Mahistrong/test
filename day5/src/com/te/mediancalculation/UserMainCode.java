package com.te.mediancalculation;

public class UserMainCode {
	public static int calculateMedian(int a[]) {//1112247//1214712
		double d = 0.0;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		if (a.length % 2 != 0)
			return a[a.length / 2];
		else {
			double out = (double) (a[a.length / 2] + a[a.length / 2 - 1]) / 2 + 0.5;
			return (int) out;
		}
	}
}
