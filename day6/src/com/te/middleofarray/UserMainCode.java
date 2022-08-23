package com.te.middleofarray;

import java.util.Arrays;

public class UserMainCode {
	public static int middleOfArray(int pin[]) {// 12345

		int startIndex = 0;
		int lastIndex = pin.length - 1;//4
		int midIndex = startIndex + (lastIndex - startIndex) / 2;//0+4-0/2
	    return pin[ midIndex];

	}

}
