package com.leetcode;

public class PalindromeInt {

	public static void main(String[] args) {
		
		System.out.println(new PalindromeInt().isPalindrome(-122));

	}
	
	 public boolean isPalindrome(int x) {
		 
		 if(x<0) {
			 return false;
		 }
		 
		 if(x>=0 && x<10) {
			 return true;
		 }
		 
		 String str = String.valueOf(x);
		 
		 for(int i=0,j=str.length()-1; i<str.length()/2 && j>=0; i++,j--) {
			 
			 if(!(str.charAt(i)==str.charAt(j))) {
				 return false;
			 }
			 
		 }
		 
		 
		 return true;
	        
	 }

}
