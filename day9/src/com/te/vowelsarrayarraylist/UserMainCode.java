package com.te.vowelsarrayarraylist;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.NestingKind;

public class UserMainCode {
	public static List<String> matchCharacter(String[] string){
		List<String> nill= new ArrayList<String>();
		for (int  i= 0; i < string.length; i++) {
			Character first=string[i].charAt(0);
		    Character last=string[i].charAt(string[i].length()-1);
		    if ((first=='a'|| first=='e'|| first=='i'|| first=='o'|| first=='u')
		    		&&(last=='a' || last=='e'||last=='i'||last=='o'|| last=='u')) {
		    	
				nill.add(string[i]);
			}
		
		}
		
		
		
		return nill;
	}

}
