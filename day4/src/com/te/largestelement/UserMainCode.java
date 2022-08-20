package com.te.largestelement;

public class UserMainCode {
	public static int checkLargest(int[] pin) {
		int max = 0;
		for (int i = 0; i < pin.length; i++) {
			if (max < pin[i]) {
				max = pin[i];

			}

		}
		return max;
	}

}
