package com.te.largestelement;

public class Main {
	public static int largestElement(int pin[]) {
		int maximum = 0;
		for (int i = 0; i < pin.length; i++) {
			if (maximum < pin[i])
				maximum = pin[i];

		}
		return maximum;
	}

}
