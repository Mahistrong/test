package com.te.reversing;

public class UserMainCode {
	public static int reverseNumber(int num)
	
	{
	int rev = 0;
	while (num > 0) {
		rev = rev * 10 + (num % 10);
		num /= 10;

	}
	return rev;
	}

	

}
