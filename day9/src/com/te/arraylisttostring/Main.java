package com.te.arraylisttostring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> string=new ArrayList<String>();
		System.out.println("Please Enter The Length");
		Scanner scanner=new Scanner(System.in);
		Integer number = scanner.nextInt();
		System.out.println("Please Enter The String input");
		for (int i = 0; i < number; i++) {
			string.add(scanner.next());
			
		}
	
		String[] number1=UserMainCode.convertToStringArray(string);
		for (String string2 : number1) {
			System.out.println(string2);
			
		}
	}

}
