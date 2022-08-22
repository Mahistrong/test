package com.te.finddigits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The double Value");
		double a = scanner.nextDouble();
		String result = UserMainCode.findNoDigits(a);
		System.out.println("The Output is : " + result);
	}

}
