package com.te.elementsinarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		System.out.println("Plese Enter The  Length");
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Please Enter The first element");
		for (int i = 0; i < number; i++) {
			list.add(scanner.nextInt());
			
		}
		System.out.println("Please Enter the Second  element");
		for (int i = 0; i < number; i++) {
			list1.add(scanner.nextInt());
			
		}
		int [] num1=UserMainCode.arrayListSubstractor(list,list1);
		for (int i : num1) {
			
		
		System.out.println(i);
		}
		
	}


}
