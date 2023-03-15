package com.leetcode;

public class RegexMatch {

	public static void main(String[] args) {		
		System.out.println(new RegexMatch().isMatch("aab","a*."));
	}
	
	 public boolean isMatch(String s, String p) {
		  return java.util.regex.Pattern.matches(p,s);
	    }
	}

