package com.te.addandreverse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Length");
		int size = scanner.nextInt();
		int pin[] = new int[size];
		System.out.println("Enter The Array Element");
		for (int i = 0; i < pin.length; i++) {
			pin[i] = scanner.nextInt();
		}
		int num=scanner.nextInt();
        int result = (UserMainCode.addAndReverse(num,pin));
        String result1=""+result;//789
        String result2="";
        for (int i = result1.length()-1; i >=0; i--) {
        	result2+=result1.charAt(i);
		
        }
        System.out.println("Sum Reverse: " + result2);
	}

}
