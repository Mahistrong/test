package com.te.arraylisttostring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode {
  public static String[] convertToStringArray(List<String> string) {
	  System.out.println(string);
	  Collections.sort(string);
	  String[] array=string.toArray(new String[string.size()]);
	  
  return array;
  }
	  
}
