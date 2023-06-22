package com.leetcode.second;

public class MaxSubArray53_KadaneAlgo {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
         int sum = 0;
         int max = Integer.MIN_VALUE;
         int n = nums.length;

         if(n==1){
             return nums[0]; //edge case
         }

         for(int i=0; i<n; i++){
             sum+=nums[i]; // accumuate sum
             max = Math.max(sum,max); // do max
             if(sum<0){ 
                 sum = 0; //reset sum
             }
         }

         return max;     
  }

}
