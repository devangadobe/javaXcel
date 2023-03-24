package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsS {

	public static void main(String[] args) {		
		System.out.println(new LetterCombinationsS().letterCombinations(""));
	}
	
	 public List<String> letterCombinations(String digits) {		 
		 HashMap<String,String> hmap = new HashMap<String,String>();		 
		 hmap.put("2", "abc");hmap.put("3", "def"); hmap.put("4", "ghi");
		 hmap.put("5", "jkl");hmap.put("6", "mno"); hmap.put("7", "pqrs");
		 hmap.put("8", "tuv");hmap.put("9", "wxyz");	 
			      
	     return letCombo(digits,hmap);  
	 }
	 
	 private List<String> letCombo(String digits, Map<String,String> hmap){
		 
		 List<String> slist = new ArrayList<String>();
		 
		 if(digits.isEmpty()){
			 return slist;
		 }
		 
		 String s = hmap.get(digits.substring(0,1));		 
		 if(digits.length() == 1) {		 			 			 
			 for (int i = 0; i < s.length(); i++) {			 
				 slist.add(String.valueOf(s.charAt(i)));			
			 }	
			 return slist;
		 }
		 
		 for(int i=0; i < s.length() ;i++) {			 
			 String c = String.valueOf(hmap.get(digits.substring(0,1)).charAt(i));			 
			 for(String str : letCombo(digits.substring(1),hmap)){
				slist.add(c+str); 
			 }			 			 
		 }		 
		return slist;
	 }
	 
}
