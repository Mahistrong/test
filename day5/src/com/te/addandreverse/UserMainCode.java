package com.te.addandreverse;

public class UserMainCode {
	public static int addAndReverse(int num, int pin[]) {
		int sum = 0;
		int reverse=0;
		int last=0;
		for (int i = 0; i < pin.length; i++) {
			if (pin[i] > num) {
				sum += pin[i];
			}
		}
         return sum;
	}

}
