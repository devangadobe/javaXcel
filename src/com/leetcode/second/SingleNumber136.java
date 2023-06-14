package com.leetcode.second;

import java.util.Arrays;

public class SingleNumber136 {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2,4,5};
		System.out.println(new SingleNumber136().singleNumber(nums));
	}

	
	 public int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        int i;
	        for(i=0; i<nums.length-1; i+=2 ){
	        	if(nums[i] != nums[i+1]) {
	        		return nums[i];
	        	}
	        }
	        return nums[i];
    }
}
