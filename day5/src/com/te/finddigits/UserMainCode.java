package com.te.finddigits;

public class UserMainCode {
	public static String findNoDigits(double a) {// 843.21
		String statement1 = "" + a;// 843.21
		String statement2 = "";
		int first = 0;
		int last = 0;
		for (int i = 0; i < statement1.length(); i++){// i=0;i<6;i++
		     //i-->0=8,1=4,2=3,3=.,4=2,5=1
			if (statement1.charAt(i) == '.') {
				first = i;//3--->(843)
				last = statement1.length() - 1 - i;//last=6-1-3=2-->(21)
				break;
			}
		}
		statement2 = first + ":" + last;//3:2
		return statement2;
	}

}
