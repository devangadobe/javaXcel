package com.leetcode;

public class FirstOccurrenceString {

	public static void main(String[] args) {
		
		System.out.println(new FirstOccurrenceString().strStr("hello", "ll"));
		
	}
	
	public int strStr(String haystack, String needle) {
		 int l = needle.length();
       for(int i=0; i<haystack.length()-needle.length()+1; i++){
			 if(haystack.substring(i,i+l).equals(needle)){
				 return i;
			 }
		 }
		 return -1;
    }

}
