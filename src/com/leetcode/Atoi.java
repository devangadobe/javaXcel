package com.leetcode;

public class Atoi {

	public static void main(String[] args) {
		String s = "-13+8";
        System.out.println(new Atoi().myAtoi(s));
	}
	
	public int myAtoi(String s) {
		
		StringBuilder stb = new StringBuilder();
		final String ZeroStr ="0";
		int i=0;
		
		boolean zeroFlag = true;
		boolean spaceFlag = true;
		boolean minusFlag = true;
		boolean plusFlag = true;
		
		for(; i<s.length(); i++) {
			
			if((!(s.charAt(i) >= 48 && s.charAt(i) <= 57))
			    && s.charAt(i) != 32
			    && s.charAt(i) != '-'
			    && s.charAt(i) != '+') {
				break;
			}
			else if(s.charAt(i)=='-' && minusFlag) {
				stb.append('-');
				spaceFlag = false;
				minusFlag = false;
				if( i+1 < s.length() && !(s.charAt(i+1) >= 48 && s.charAt(i+1) <= 57)) {
					break;
				}
				if( i>0 && (s.charAt(i-1) == 48)) {
					break;
				}
			}	
			else if(s.charAt(i)=='+' && plusFlag && minusFlag) {
				spaceFlag = false;
				minusFlag = false;
				plusFlag = false;
				if( i+1 < s.length() && !(s.charAt(i+1) >= 48 && s.charAt(i+1) <= 57)) {
					break;
				}
				if( i>0 && (s.charAt(i-1) == 48)) {
					break;
				}
			}	
			else if(s.charAt(i)==48 ) {				
				if(!zeroFlag){stb.append(ZeroStr);}	
				spaceFlag = false;
				minusFlag = false;
				plusFlag = false;
				if( i+1 < s.length() && !(s.charAt(i+1) >= 48 && s.charAt(i+1) <= 57)) {
					break;
				}
			} 
			else if(s.charAt(i) > 48 && s.charAt(i) <= 57) {
				zeroFlag = false;
				spaceFlag = false;
				minusFlag = false;
				plusFlag = false;
				stb.append(s.charAt(i));
			} 
			else if( s.charAt(i) == 32 && !spaceFlag ){
				break;
			}
			else if( s.charAt(i) == '+' && !plusFlag ){
				break;
			}
		}
		
		if(stb.toString() == null ) {
			return 0;
		}
		
		if(stb.toString().length()==0 ) {
			return 0;
		}
		
		if(stb.toString().equals("-") || stb.toString().equals("+")) {
			return 0;
		}
		
	    if(Double.parseDouble(stb.toString()) < 0-Math.pow(2,31)){
	    	return (int) (0-Math.pow(2,31));
	    }
	    if(Double.parseDouble(stb.toString()) >= Math.pow(2,31) ){
	    	return (int) (Math.pow(2,31)-1) ;
	    }
	    return  Integer.parseInt(stb.toString());
			
	}

}
