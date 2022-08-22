package com.te.evenduplicatesum;

public class UserMainCode {
	public static int sumElements(int a[]) {
		int sum = 0, count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			} else
				count++;
		}
		if (count != a.length)
			return sum;
		else
			return -1;

	}

}
