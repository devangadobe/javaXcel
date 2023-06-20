package com.test;

public class Epam {
	
	 public static void main(String[] args) { 
	        String ex1 = "aabbaa";  //true
	        String ex2 = "aabdaa";  //false
	        String ex3 = "aabcbaa"; //true

	        System.out.println("ex1"+ isPalindrom(ex1));
	        System.out.println("ex2"+ isPalindrom(ex2));
	        System.out.println("ex3"+ isPalindrom(ex3));
	        
	    }
	    
	    private static boolean isPalindrom(String str){
	        
	        if(null == str || str.length() <= 1){
	            return true;
	        }
	        
	        int l=0, r=str.length()-1;
	        
	        while(l<=r){
	            if(str.charAt(l) != str.charAt(r)){
	                return false;
	            }
	            r--;
	            l++;
	        }
	        
	        return true;
	    }
	}

