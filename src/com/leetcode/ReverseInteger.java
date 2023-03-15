package com.leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		int p= 1534236469;
        System.out.println(reverse(p));
	}
	
	public static int reverse(int p) {
		
		Integer i = p;
	    StringBuilder  str = new StringBuilder() ;
	    String s = i.toString();
	    int index=0;
	    if(p < 0) {
	    	str.append("-");
	    	index=1;
	    }
	    for(int j=s.length()-1 ;j>=index ; j--) {
	    	str.append(s.charAt(j));
	    }
	    if(Double.parseDouble(str.toString()) < 0-Math.pow(2,31)
	       || Double.parseDouble(str.toString()) >= Math.pow(2,31) ) {
	    	return 0;
	    }
	    return  Integer.parseInt(str.toString());
			
	}

}
