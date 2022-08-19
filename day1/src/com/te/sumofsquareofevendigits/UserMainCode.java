package com.te.sumofsquareofevendigits;

public class UserMainCode {
	public static int SumOfSquareOfEvenDigits(int num) {
	int last=0, sum=0, square=0;
	while (num>0) {
		last=num%10;
		if (last%2==0) {
			square=last*last;
			sum=sum+square;
			}
		num=num/10;
		}
	    return sum;
	}
}
