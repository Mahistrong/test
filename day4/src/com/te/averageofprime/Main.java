package com.te.averageofprime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Length");
		int size = scanner.nextInt();
		int pin[] = new int[size];
		System.out.println("Enter The Array Element");
		for (int i = 0; i < pin.length; i++) {
			pin[i] = scanner.nextInt();
		}

		double result = (UserMainCode.averageElements(pin));
		System.out.println("Prime Average: " + result);
	}

}
