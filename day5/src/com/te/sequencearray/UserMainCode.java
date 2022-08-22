package com.te.sequencearray;

public class UserMainCode {
	public static boolean searchSequence(int a[]) {//1233
		int j = 0, count = 0;
		for (int i = 0; i < a.length; i++) {
			for (j = 0; j < 3;) {
				if (a[i] == j + 1) {//0==1//
					i++;
					j++;
					if (j == 3)
						count = 1;
				} else
					break;
			}
		}
		if (count == 1)
			return true;
		else
			return false;

	}

}
