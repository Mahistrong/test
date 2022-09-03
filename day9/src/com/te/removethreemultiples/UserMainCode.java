package com.te.removethreemultiples;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List<Integer> removeMultiplesOfThree(List<Integer> list){
		for (int i = 2; i <list.size(); i+=2) {
			list.remove(i);
			
			
		}
		
	return list;
	}

}
