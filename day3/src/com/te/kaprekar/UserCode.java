package com.te.kaprekar;

public class UserCode {
	public static String name(int num) {
		int last = 0;
		int first = 0;
		int count = 0;
		int square = 0;
		int num1=num;
		square = num * num;
		while(num1>0)
			count++;
		     num1/=10;
		first = square % (int) Math.pow(10, count);
		last = square / (int) Math.pow(10, count);
		if (first + last == num)
			return "yes";
		else
			return "no";
	}

}
