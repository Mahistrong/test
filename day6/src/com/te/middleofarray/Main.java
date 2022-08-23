package com.te.middleofarray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Length ");
		int size = scanner.nextInt();
		int pin[]=new int[size];
		System.out.println("Enter The Array Element");
		for (int i = 0; i < pin.length; i++) {
			pin[i]=scanner.nextInt();
			
		}
		int result=UserMainCode.middleOfArray(pin);
		System.out.println("The Middle Element: "+result);
		
		
	}
}
