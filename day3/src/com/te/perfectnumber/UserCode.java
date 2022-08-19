package com.te.perfectnumber;

public class UserCode {
	public static String main(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
			if (num == sum)
				return "yes";
			else
				return "no";

		
	}

}
