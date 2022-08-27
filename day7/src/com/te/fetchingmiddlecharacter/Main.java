package com.te.fetchingmiddlecharacter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The String");
		String m1 = scanner.next();
		//String result=Middle.mid(m1);
		if(m1.length()%2!=0) {
			System.out.println("please enter the even length");
		}
			else
				System.out.println(UserMainCode.getMiddleClass(m1));
			
		
			
		
	}

}
