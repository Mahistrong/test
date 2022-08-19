package com.te.programlogic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the number");
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int c= scanner.nextInt();
		int result=(Logic.program(a,b,c));
		System.out.println("program logic:"+result);
				
	}

}
