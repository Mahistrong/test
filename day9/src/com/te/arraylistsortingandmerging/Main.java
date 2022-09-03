package com.te.arraylistsortingandmerging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list1= new ArrayList<Integer>();
		List<Integer> list2= new ArrayList<Integer>();
		System.out.println("Please Enter the size");
		Scanner scanner=new Scanner(System.in);
		Integer array = scanner.nextInt();
		System.out.println("Enter The first arraylist element");
		for (int i = 0; i < array; i++) {
			Integer number=scanner.nextInt();
			list1.add(number);
			}
		System.out.println("Enter The second arraylist element");
		for (int i = 0; i < array; i++) {
			Integer num=scanner.nextInt();
			list2.add(num);
			}
		
		list1.addAll(list2);
		System.out.println("Merging");
		System.out.println(list1);
		System.out.println("sorting");
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("The output from the list");
		System.out.println(UserMainCode.sortMergeArrayList(list1));
	}

}
