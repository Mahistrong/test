package com.te.reversing;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter The number");
		int num=scanner.nextInt();
		int result=UserMainCode.reverseNumber(num);
		System.out.println(result);
			
		}
	}

