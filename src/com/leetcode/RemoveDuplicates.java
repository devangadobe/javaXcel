package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));
	}
	
    public int removeDuplicates(int[] nums) {
    	
    	Set<Integer> exnums = new HashSet<Integer>();
    	
    	int k = 0;
    	boolean flag;
    	for(int i=0 ; i<nums.length ;i++){
    		flag = exnums.add(nums[i]);
    		if(flag) {
    			nums[k] = nums[i];
    			k++;
    		}
    	}
       
        return exnums.size();
    }

}
