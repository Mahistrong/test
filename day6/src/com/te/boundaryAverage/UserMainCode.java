package com.te.boundaryAverage;

public class UserMainCode {
	public static double getBoundaryAverage(int pin[]) {// 369425
		int largest = pin[0];
		int smallest = pin[0];

		for (int i = 0; i < pin.length; i++) {
			if (largest < pin[i]) {
				largest = pin[i];
			}
			if (smallest > pin[i]) {
				smallest = pin[i];

			}
		}
		double number = (float)(largest+smallest)/2;
		return number;

	}

}
