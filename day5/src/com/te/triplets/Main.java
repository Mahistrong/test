package com.te.triplets;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter The ArrayLength");
		int size = scanner.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < a.length; i++) {
			 a[i]=scanner.nextInt();
		}
		boolean result=UserMainCode.checkTriplets(a);
		System.out.println("Triplets: "+result);
	}

}
