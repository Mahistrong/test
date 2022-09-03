package com.te.elementsinarraylist;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static int[] arrayListSubstractor(List<Integer> list,List<Integer> list1) {
		List<Integer> first=new ArrayList<Integer>(list);
		first.removeAll(list1);
		System.out.println("first :"+first);
		List<Integer> last=new ArrayList<Integer>(list1);
		last.removeAll(list);
		System.out.println("last :"+last);
		first.addAll(last);
		System.out.println("merge :"+first);
		int [] number=new int[first.size()];
		Object[] array=first.toArray();
		for (int i = 0; i < array.length; i++) {
			number[i]=(int) array[i];
			
		}
		
		return number;
	} 

}
