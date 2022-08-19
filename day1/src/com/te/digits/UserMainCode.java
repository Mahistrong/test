package com.te.digits;

public class UserMainCode {
	public static int CountSeven(int num) {
		int last = 0, count = 0;
		while (num > 0) {
			last = num % 10;
			if (last == 7) {
				count++;
				}
			num /= 10;
		}
		    return count;
		}
	}

