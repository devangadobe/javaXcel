package com.leetcode.second;

public class Jumping {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		System.out.println(new Jumping().jump(nums));

	}

	public int jump(int[] nums) {

		int left = 0;
		int farthest = nums[0];
		int right = 0;
		int result = 0;

		while (right < nums.length-1) {
			for (int i = left; i <= right; i++) {
				farthest = Math.max(farthest, i + nums[i]);
			}
			left = right + 1;
			right = farthest;
			result += 1;
		}

		return result;

	}

	/*
	 * public int jump(int[] nums) { int p = nums.length - 1; int min = p; return
	 * jumping(nums, 0, p, min);
	 * 
	 * }
	 * 
	 * private int jumping(int[] nums, int k, int p, int min) { if (k == p) { return
	 * 0; } else if (p - k <= nums[k]) { return 1; } else { for (int i = 1; (i <=
	 * nums[k] && (k + i) <= p); i++) { min = Math.min(min, 1 + jumping(nums, k + i,
	 * p, min)); } }
	 * 
	 * return min; }
	 */

}
