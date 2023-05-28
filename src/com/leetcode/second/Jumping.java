package com.leetcode.second;

public class Jumping {

	public static void main(String[] args) {
		int[] nums = {2,1,1,1};
		System.out.println(new Jumping().jump(nums));

	}

	public int jump(int[] nums) {
		int p = nums.length - 1;
		int min = p;
		return jumping(nums, 0, p, min);

	}

	private int jumping(int[] nums, int k, int p, int min) {
		if (k == p) {
			return 0;
		} else if (p - k <= nums[k]) {
			return 1;
		} else {
			for (int i = 1; (i <= nums[k] && (k + i) <= p); i++) {
				min = Math.min(min, 1 + jumping(nums, k + i, p, min));
			}
		}

		return min;
	}

}
