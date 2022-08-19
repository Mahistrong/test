package com.te.fibonacci;

public class UserMainCode4 {
	public static int getSumOfNfibos(int num) {
		int n1=0;
		int n2=1;
		int temp;
		int sum=1;
		for (int i = 1; i <=num-2; i++) {
			temp=n1+n2;
			n1=n2;
			n2=temp;
			sum=sum+temp;
			
		} 
		return sum;
		
	}
	

}
