package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ListofPermutations {

	public static void main(String[] args) {

      String str = "abc";
      
      List<String> slist = new ArrayList<String>();
         
	  new ListofPermutations().listOfPerms(str,"",slist);
	  
	  System.out.println(slist);
		
	}

	private  void listOfPerms(String str,String answer, List<String> slist) {
		
		if(str.isEmpty()) {
			slist.add(answer);
		}else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0,i) + str.substring(i+1);
				listOfPerms(rem, answer + str.charAt(i), slist);
			}
		}
		
	}

}
