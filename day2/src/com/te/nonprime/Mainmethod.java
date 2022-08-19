package com.te.nonprime;

import java.util.Scanner;

public class Mainmethod {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The PrimeNumber");
		int num = scanner.nextInt();
		int result= UserMainCode.addNumbers(num);
		System.out.println("The Sum of NonPrime Number is:" + result);

	}

}
