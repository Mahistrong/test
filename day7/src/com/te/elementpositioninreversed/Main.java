package com.te.elementpositioninreversed;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a size and elements :");
		int size = scanner.nextInt();
		String str[] = new String[size];

		for (int i = 0; i < str.length; i++) {
			str[i] = scanner.next();
		}
		Arrays.sort(str);
		System.out.println(" enter a array element");
		String str1 = scanner.next();
		System.out.println(UserMainCode.getElementsPosition(str, str1));
	}
}
