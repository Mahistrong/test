package com.te.sumofodddigits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter The number");
		int num = scanner.nextInt();
		int result = UserMainCode.CheckSum(num);
		if (result == -1)
			System.out.println("Even Digit");
		else
			System.out.println("Odd Digit");	
			
		}

	}

