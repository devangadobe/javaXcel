package com.leetcode.second;

public class MinSubArrayLen209 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(new MinSubArrayLen209().minSubArrayLen(15, nums));
	}

	public int minSubArrayLen(int target, int[] nums) {
		int min = Integer.MAX_VALUE;
		int l = 0, r = nums.length - 1, i = 0, k=1;
		int sum;

		while (l <= r) {
			i = l;
			sum = 0;
			while (i <= r ) {
				sum += nums[i];
				if (sum >= target) {
					break;
				}
				i++;
				k++;
			}
			if(sum >= target){
			 min = Math.min(i - l + 1, min);
			}
			l++;
		}
		return (min != Integer.MAX_VALUE) ? min : 0;
	}

}
