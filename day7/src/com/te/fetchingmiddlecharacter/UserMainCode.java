package com.te.fetchingmiddlecharacter;

public class UserMainCode {
	public static String getMiddleClass(String m1) {
		int i=m1.length()/2-1;//prasanth
		int j=i+1;
		StringBuffer m2=new StringBuffer();
		m2.append(m1.charAt(i)).append(m1.charAt(j));
		String s3=m2.toString();
		return s3;
		
	}

}
