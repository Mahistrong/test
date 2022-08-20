package com.te.averageofprime;

import java.text.DecimalFormat;

public class UserMainCode {
	public static double averageElements(int[] pin) {
		int sum = 0;
		int count = 0;
		int count1=0;
		double average=0;
		for (int i = 1; i < pin.length; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				count1++;
				sum =sum+pin[i];
			}
		}
				average = (double)(sum) / count1;
				DecimalFormat df=new DecimalFormat("#.00");
				double product=Double.parseDouble(df.format(average));

		return product;
	}

}
