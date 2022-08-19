package com.te.oddindex;

public class Index {
	public static String indexSum(int num) {

		int sum = 0;
		int sum2=0;
		int last = 0;
		int last2=0;
		int temp = num;
		int temp1=num;
		//even
		while (temp > 0) {
			last = temp % 10;
			sum = sum + last;
			temp /= 100;
		}
		//odd
		temp1=temp1/10;
		while (temp1 > 0) {
			last2 = temp1 % 10;
			sum2 = sum2 + last2;
			temp1 /= 100;
		}
		if (sum == sum2)
			return "yes";

		else
			return "no";
      }

}
