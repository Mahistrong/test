package com.te.sumofcubesandsquares;

public class UserMainCode {
	public static int addEvenOdd(int pin[]) {
		int square = 0;
		int number = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;
		for (int i = 0; i < pin.length; i++) {
			if (pin[i] % 2 == 0) {
				square = pin[i] * pin[i];
				sum1 += square;

			} else {
                number = pin[i] * pin[i] * pin[i];
				sum2 += number;
				sum = sum1 + sum2;
			}
		}

		return sum;

	}

}
