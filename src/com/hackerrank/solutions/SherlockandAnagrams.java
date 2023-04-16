package com.hackerrank.solutions;

import java.util.Arrays;
import java.util.HashMap;

public class SherlockandAnagrams {

	public static void main(String[] args) {
		System.out.println(SherlockandAnagrams.sherlockAndAnagrams("cdcd"));
	}
	
	 public static int sherlockAndAnagrams(String s) {
		 
		 int count = 0;
		 
		 HashMap<String,Integer> hmap = new HashMap<String, Integer>();		
		 
		 String temp,sorted;
		 
		 for(int i=0; i<s.length(); i++){
			 for(int j=i+1; j<s.length()+1; j++) {
				 temp = s.substring(i,j);
				 sorted = sort(temp);
				 if(hmap.containsKey(sorted)) {					 
					 hmap.put(sorted,hmap.get(sorted)+1);					 
				 }else {
					 hmap.put(sorted,1);
				 }
			 }			 
		 }
		 
		 for(Integer i : hmap.values()){
			 if(i>1){
				 //Combinations are iC2 
				 count+=((i*(i-1))/2);
			 }
		 }
		 
       	return count;	         
    }

	private static String sort(String temp) {
		
		char[] arr = temp.toCharArray();
		Arrays.sort(arr);		
		return String.valueOf(arr);

	}

}
