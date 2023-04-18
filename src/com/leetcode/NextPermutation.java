package com.leetcode;

public class NextPermutation {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 2 };

		new NextPermutation().nextPermutation(nums);

	}

	public void nextPermutation(int[] nums) {

		if (null == nums || nums.length == 0 || nums.length == 1) {
			return;
		}

		if (nums.length == 2) {
			int temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
			return;
		}

		int breakpoint = 0;
		int i = nums.length - 2;

		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		if (i == -1) {
			nums = reverse(nums, 0, nums.length - 1);
			return;
		}

		breakpoint = i;
		i = nums.length - 1;

		while (i > 0 && nums[i] <= nums[breakpoint]) {
			i--;
		}

		int temp = nums[breakpoint];
		nums[breakpoint] = nums[i];
		nums[i] = temp;

		nums = reverse(nums, breakpoint + 1, nums.length - 1);

	}

	private int[] reverse(int[] nums, int start, int end) {
		int temp;
		for (int i = end, j = start; i > j; i--, j++) {
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		return nums;
	}

}
