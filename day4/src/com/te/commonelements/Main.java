package com.te.commonelements;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Length1");
		int size = scanner.nextInt();
		int pin[] = new int[size];
		System.out.println("Enter Length2");
		int size1 = scanner.nextInt();
		int pin1[] = new int[size1];
		System.out.println("Enter The first Array Element");
		for (int i = 0; i < pin.length; i++) {
			pin[i] = scanner.nextInt();
		}
		System.out.println("Enter the Second Arrays Element");
		for (int i = 0; i < pin1.length; i++) {
			pin1[i] = scanner.nextInt();

		}

		int result = (UserMainCode.sumCommonElements(pin, pin1));
		System.out.println("Common Elements: " + result);
	}

}
