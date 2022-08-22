package com.te.sequencearray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please Enter The Array Length");
		int size = scanner.nextInt();
		int a[]=new int[size];
		System.out.println("Enter The Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=scanner.nextInt();
		}
	      boolean result=UserMainCode.searchSequence(a);
	      System.out.println("SearchSequence: "+result);
	}

}
