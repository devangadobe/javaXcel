package com.leetcode;

import java.util.*;

public class Permutations {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(new Permutations().permute(nums));
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		solve(nums, 0, list);
		return list;
	}

	public static void swap(int[] arr, int idx, int idx2) {
		int temp = arr[idx];
		arr[idx] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void solve(int[] arr, int idx, List<List<Integer>> list) {
		if (idx == arr.length - 1) { // Base condition of recursion
			List<Integer> item = new ArrayList<Integer>(arr.length);
			for (int i : arr) {
				item.add(i);
			}
			list.add(item);
		}

		for (int i = idx; i < arr.length; i++) {
			swap(arr, idx, i);
			solve(arr, idx + 1, list);
			swap(arr, idx, i);
			// Backtracking: reverting all the elements to their original places
		}
	}

}
