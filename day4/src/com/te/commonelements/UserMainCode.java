package com.te.commonelements;

public class UserMainCode {
	public static int sumCommonElements(int[] pin, int[] pin1) {
		int sum = 0;
		for (int i = 0; i < pin.length; i++) {
			for (int j = 0; j < pin1.length; j++) {
				if (pin[i] == pin1[j]) {
					sum = sum + pin[i];

				}

			}

		}
		return sum;
	}
}
