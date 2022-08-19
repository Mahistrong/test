package com.te.sumofodddigits;

public class UserMainCode {
	public static int CheckSum(int num){
		
	  int sum=0;
		for (int i = 0; i <=num; i++) {
	
		if(i%2!=0) {
			sum=sum+i;
		}
		}
	
		if (sum % 2 == 1)
			return 1;
		else
			return -1;

	}
}
