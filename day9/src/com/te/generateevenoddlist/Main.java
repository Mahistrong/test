package com.te.generateevenoddlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		System.out.println("Plese Enter The  Length");
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Please Enter The first Arraylist elements");
		for (int i = 0; i < number; i++) {
			list.add(scanner.nextInt());
			
		}
		System.out.println("Please Enter the Second Arraylist elements");
		for (int i = 0; i < number; i++) {
			list1.add(scanner.nextInt());
			
		}
		List<Integer> result= UserMainCode.generateOddEvenList(list,list1);
		for (Integer integer : result) {
			System.out.println(integer);
			
		}
		
		
	}

}
