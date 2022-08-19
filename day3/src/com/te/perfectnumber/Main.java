package com.te.perfectnumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Please Enter The Number");
			int num = scanner.nextInt();
			String result=(UserCode.main(num));
			System.out.println("sumfactor: "+result);
	}

}
