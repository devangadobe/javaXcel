package com.leetcode.second;

import java.util.Arrays;

public class LongestConsecutive128 {

	public static void main(String[] args) {
		int[] nums = {2,1,0,1};
        System.out.println(new LongestConsecutive128().longestConsecutive(nums));
	}

	public int longestConsecutive(int[] nums) {
		int n = nums.length;
		if (n < 2) {
			return n;
		}
		Arrays.sort(nums);
		int r = 1;
		int res = 1;
		int i = res;
		while (r < n) {
			if (nums[r] == nums[r - 1] + 1) {
				i++;
			} else if (nums[r] != nums[r - 1]) {
				res = Math.max(res, i);
				i = 1;
			}
			r++;
		}
		return Math.max(res, i);
	}

}
