package com.te.oddindex;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please Enter the Number");
	int num = scanner.nextInt();
	String result=(Index.indexSum(num));
	System.out.println("IndexSum:"+result);
	
}
}
