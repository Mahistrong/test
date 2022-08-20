package com.te.sumofpowerofelement;

public class Main {
	public static int getSumOfPower(int[] pin) {
		int sum = 0;
		for (int i = 0; i < pin.length; i++) {
			sum = sum + (int) (Math.pow(pin[i], i));

		}
		return sum;
	}
}
