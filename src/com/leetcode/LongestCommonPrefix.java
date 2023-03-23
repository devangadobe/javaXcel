package com.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
	   String[]	strs = {"flower","flow","flight"};
       System.out.println(new LongestCommonPrefix().longestCommonPrefixS(strs));
	}
	
	public String longestCommonPrefixS(String[] strs) {
		
		if(strs.length < 1) {
			return "";
		}
		
		char c = strs[0].charAt(0);
		int j=0;		

		boolean flag=true;
		while(j<strs[0].length() && flag){
			c = strs[0].charAt(j);
	        for (int i = 0; i < strs.length; i++) {
				if(!(strs[i].charAt(j)==c)) {
					flag=false;
					break;					
				}
			}	        
	        j++;
		}
        
        return strs[0].substring(0,j-1);
        
    }

}
