package com.te.mediancalculation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The Length");
		
		int size = scanner.nextInt();
		int a[] = new int[size];
		System.out.println("Enter The Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
//		Arrays.sort(a);
//		System.out.println("sorting");
//		for (int i : a) {
//			int b[]=i;
//		}
		int result = UserMainCode.calculateMedian(a);
		System.out.println("MedianCalculate: " + result);
	}

}
