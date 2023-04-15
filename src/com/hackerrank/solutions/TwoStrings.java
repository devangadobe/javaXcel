package com.hackerrank.solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

	public static void main(String[] args) {
		new TwoStrings();
		System.out.println(TwoStrings.twoStrings("Hello","World"));
	}
	
	public static String twoStrings(String s1, String s2) {
	      Map<Character,Object> hmap = new HashMap<Character,Object>();
	      Object o = new Object();
	      for(int i=0; i<s1.length(); i++){
	          hmap.computeIfAbsent(s1.charAt(i), k -> o );
	      }
	      
	      for(int i=0; i<s2.length(); i++){
	          if(hmap.containsKey(s2.charAt(i))){
	              return "YES";
	          }
	      }
	      
	      return "NO";   
	    }

}
