package com.te.triplets;

public class UserMainCode {
	public static boolean checkTriplets(int a[]) {//3331
		for(int i=0;i<a.length;i++)
		{
			
			if(i+1<a.length && a[i]==a[i+1])//1<4&&3==3//2<4-3==3
			{
				if(i+2<a.length && a[i]==a[i+2])//2<4&&3=3
					return true;
			}
			
			
		}
		return false;
	}

}
