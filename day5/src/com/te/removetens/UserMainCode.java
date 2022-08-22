package com.te.removetens;

public class UserMainCode {
	public static int[] removeTens(int pin[]) {//1 10 20 10 2

		for (int i = 0; i <pin.length; i++) {
			if (pin[i] == 10) {
				pin[i] = 0;
			}
		}
		for (int i = 0; i < pin.length; i++) {
			if (pin[i] == 0) {
				for (int j = i + 1; j < pin.length; j++) {
					if (pin[j] != 0) {
						pin[i] = pin[j];
						pin[j] = 0;
						i++;
					}

				}
			}
			
		}
		return pin;
	}

}
