package com.te.elementpositioninreversed;


//import java.util.Collections;

public class UserMainCode {
	public static int getElementsPosition(String[] str, String str1) {

		String str3[] = new String[str.length];
		for (int i = 0; i < str3.length; i++) {
			str3[i] = str[str3.length - i - 1];
		}

		int res = 0;
		for (int i = 0; i <str3.length; i++) {
			if (str3[i].equals(str1))
				res = i + 1;
		}

		return res;
	}

}
