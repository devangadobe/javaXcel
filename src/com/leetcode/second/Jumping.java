package com.leetcode.second;

public class Jumping {

	public static void main(String[] args) {
		int[] nums = {5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
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
