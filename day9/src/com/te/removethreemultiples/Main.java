package com.te.removethreemultiples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("Please Enter The Length");
		Scanner scanner=new Scanner(System.in);
		Integer number = scanner.nextInt();
		System.out.println("Please Enter the Element");
		for (int i = 0; i <number; i++) {
			list.add(scanner.nextInt());
		}
		
		System.out.println(UserMainCode.removeMultiplesOfThree(list));
	}

}
