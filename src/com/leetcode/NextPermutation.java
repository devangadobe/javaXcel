package com.leetcode;

import java.util.*;

public class NextPermutation {

	public static void main(String[] args) {
		
		int[] nums = {1,1,5};
		
		new NextPermutation().nextPermutation(nums);

	}
	
    public void nextPermutation(int[] nums) {
    	List<String> list = new ArrayList<String>();	
    	String str="";
    	for(int i =0; i<nums.length; i++) {
    		str+=nums[i];
    	}
    	list = permutations(str,"",list);
    	Collections.sort(list);
    	int j=0;
        for(char c : list.get((list.lastIndexOf(str)+1)%list.size()).toCharArray()){
        	nums[j] = Character.getNumericValue(c);
        	j++;
        }
    }

	private List<String> permutations(String ros, String ans, List<String> list) {		
		if(ros.length()==0) {
			list.add(ans);
		}
		
		for(int i=0; i<ros.length(); i++) {
			list = permutations(ros.substring(0,i)+ros.substring(i+1),
					            ans+ros.charAt(i),
					            list);			
		}		
		return list;
	}

}
