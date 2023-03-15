package com.leetcode;

public class LongestPalindrome {
	
   public void printMsg() {
	   System.out.println("In Solution class");
   }
   
   public String longestPalindrome(String s) {
	   
	   String str = s.substring(0,1);
	   System.out.println(str);
	   int MAX=1;
	   int temp;
	   int j=1;
	   int i=0;
	   
	   for(i=0; i<s.length() && i < j; i++) {
		   for(j=i+1; j<=s.length(); j++) {
			   if(isPalindrome(s.substring(i,j))) {
				   temp=j-i+1;
				   if(temp > MAX) {
				   MAX = temp;	   
				   str = s.substring(i,j);
				   }
			   }		   
		   }
	   }
	   
	return str;
	   
   }

   boolean isPalindrome(String s){
	   
	   for(int i=0; i <s.length()/2 ; i++) {
		   if(s.charAt(i) != s.charAt(s.length()-i-1)) {
			   return false;
		   }
	   }
	   
       return true;
   }
   
   public static void main(String[] args) {
	   
	   System.out.println(new LongestPalindrome().longestPalindrome("eabcb"));
	
   }  

}
