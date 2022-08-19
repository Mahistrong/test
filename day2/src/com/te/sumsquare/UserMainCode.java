package com.te.sumsquare;

public class UserMainCode {
	public static int sumSquare(int num) {
		int sum=0;
		int last=0;
		int store=0;
		while (num>0) {
			last=num%10;
			store=last*last;
			sum=sum+store;
			num/=10;
			
		}
		
		return sum;
	}
	
    
}
