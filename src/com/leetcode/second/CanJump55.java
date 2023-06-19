package com.leetcode.second;

public class CanJump55 {

	public static void main(String[] args) {
		int[] nums = { 8, 2, 4, 4, 4, 9, 5, 2, 5, 8, 8, 0, 8, 6, 9, 1, 1, 6, 3, 5, 1, 2, 6, 6, 0, 4, 8, 6, 0, 3, 2, 8,
				7, 6, 5, 1, 7, 0, 3, 4, 8, 3, 5, 9, 0, 4, 0, 1, 0, 5, 9, 2, 0, 7, 0, 2, 1, 0, 8, 2, 5, 1, 2, 3, 9, 7, 4,
				7, 0, 0, 1, 8, 5, 6, 7, 5, 1, 9, 9, 3, 5, 0, 7, 5 };
		System.out.println(new CanJump55().canJump(nums));

	}

	public boolean canJump(int[] nums) {
		/*
		 * int n = nums.length; int reachable = 0; for(int i=0 ;i<n; i++) {
		 * 
		 * if(reachable < i) { return false; }
		 * 
		 * reachable = Math.max(reachable, i+nums[i]);
		 * 
		 * } return true;
		 */
		
		int goal = nums.length - 1;
		
		if(goal<1){
			return true;
		}
		
		for(int i = goal-1; i>=0; i--) {
			if(nums[i] >= goal-i) {
				goal = i;
			}
		}
		
		return (goal==0);
		
		/*int[] flag = new int[nums.length];
		return canJump(nums, 0, nums.length - 1, false, flag);*/
	}

	/*private boolean canJump(int[] nums, int curr, int last, boolean b, int[] flag) {

		if (curr >= last) {
			return true;
		}

		if (flag[curr] == 1) {
			return true;
		}

		if (flag[curr] == -1) {
			return false;
		}

		for (int i = nums[curr]; i > 0; i--) {
			if (i >= last - curr) {
				flag[curr] = 1;
				b = true;
				break;
			} else {
				b = canJump(nums, curr + i, last, b, flag);
				if (b) {
					break;
				} else {
					flag[curr + i] = -1;
				}
			}
		}
		return b;
	}*/
}
