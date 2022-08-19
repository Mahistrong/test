package com.te.kaprekar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter The Number");
		int num = scanner.nextInt();
		String result=(UserCode.name(num));
		System.out.println("karpeter: "+result);
	}
}
