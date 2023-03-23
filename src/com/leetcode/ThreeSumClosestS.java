package com.leetcode;

import java.util.Arrays;

public class ThreeSumClosestS {

	public static void main(String[] args) {
		int[] arr = {-1,2,1,-4};
		System.out.println(new ThreeSumClosestS().threeSumClosest(arr, 1));
		
	}
	
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int j=nums.length-1;
        int s,sum;
        sum = nums[0] + nums[1] + nums[nums.length-1];
        int d = Math.abs(sum-target); 
        int k;

        for(int i=0 ; i<nums.length-2; i++){
            k=i+1;
            j=nums.length-1;
            while(k<j){  
                s = nums[i]+nums[j]+nums[k];
                if(s==target){
                    return target;
                }else if(s>target){                 
                    j--;
                }else if(s<target){
                    k++;
                }   
                if(Math.abs(s-target) < d ) {
                	sum = s;
                	d = Math.abs(s-target);
                }
            }
        }
		return sum;       
    }

}
