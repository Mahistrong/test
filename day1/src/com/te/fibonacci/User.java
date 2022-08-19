package com.te.fibonacci;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The number");
		int num = scanner.nextInt();
		int result = UserMainCode.getSumOfNfibos(num);
		System.out.println(result);

	}
}
