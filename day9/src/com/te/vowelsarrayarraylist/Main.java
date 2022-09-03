package com.te.vowelsarrayarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Input size");
		String[] string=new String[scanner.nextInt()];
		System.out.println("Enter The input string");
		for (int i = 0; i <string.length; i++) {
			string[i]  = scanner.next();
			
		}
		System.out.println("The ouput for the given input is :");
		System.out.println(UserMainCode.matchCharacter(string));
	}

}

