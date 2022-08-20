package com.te.diffbwlargestsmallest;

public class UserMainCode {
	public static int getBigDiff(int[] pin) {
		int max =pin[0];
		int min =pin[0];
		int diff = 0;
		for (int i = 0; i < pin.length; i++) {
			if (max < pin[i])
				max = pin[i];
		}

			for (int j = 0; j < pin.length; j++) {
				if (min > pin[j])
					min = pin[j];
				
			}
			diff = max - min;
		

		return max;
	}

}
