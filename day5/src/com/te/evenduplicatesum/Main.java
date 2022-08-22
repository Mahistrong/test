package com.te.evenduplicatesum;

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

		int result = (UserMainCode.sumElements(pin));
		System.out.println("Sum Elements: " + result);
	}


}
