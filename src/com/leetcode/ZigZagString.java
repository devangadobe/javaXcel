package com.leetcode;

public class ZigZagString {

	public static void main(String[] args) {
		
		ZigZagString zzstr = new ZigZagString();
		System.out.println(zzstr.convert("PAYPALISHIRING", 4));
		
	}
	
	 public String convert(String s, int numRows) {
	        StringBuilder stb = new StringBuilder();
	        int j=0;
	        int max=(numRows-1)*2;
	        int k=0;
	              
	        for(int i=0; i<numRows ; i++){
	        	j=i;
	        	k = max-2*i;
	        	if(k==0){k=max;}
	            while(j<s.length()){
	            	stb.append(s.charAt(j));
	            	j = j + k;
	            	if(i>0 && i<numRows-1) {k=max-k;}
	            }   
	        }
	        return stb.toString();
	  }


     public String convertB(String str, int numRows) {
    	 
    	 if(str==null) {
    		 return null;
    	 }
    	 
    	 if(str.length()==0) {
    		 return "";
    	 }
    	 
    	 if(str.length()==1) {
    		 return str;
    	 }
    	 
    	 
         return str.charAt(0) + convertB(str.substring(1),numRows-1);
    	 
     }
}
