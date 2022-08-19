package com.te.sumsquare;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter The Number");
		int num = scanner.nextInt();
		int result=(UserMainCode.sumSquare(num));
				System.out.println("The SumSquare:"+result);
	}
	

}
