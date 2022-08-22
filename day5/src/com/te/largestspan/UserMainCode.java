package com.te.largestspan;

public class UserMainCode {
	public static int getLargestSpan(int a[]) {// 421457
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					sum = j - i + 1;// 3

					break;
				}
			}
			if (sum != 0)
				break;
		}
		if (sum == 0)
			return -1;
		else
			return sum;

	}

}
