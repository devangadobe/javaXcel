package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		List<List<Integer>> mainl = new CombinationSumI().combinationSum(candidates, 7);
		System.out.println(mainl);

	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> mainList = new ArrayList<List<Integer>>();

		List<Integer> list = new ArrayList<Integer>();

		mainList = combinationSums(candidates, target, mainList, list, 0);

		return mainList;
	}

	private List<List<Integer>> combinationSums(int[] arr, int target, List<List<Integer>> mainList, List<Integer> list,
			int pos) {

		if (target <= 0) {
			if (target == 0) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.addAll(list);
				mainList.add(temp);
			}
			return mainList;
		}

		if (pos < arr.length) {
			list.add(arr[pos]);
			combinationSums(arr, target - arr[pos], mainList, list, pos);
			list.remove(list.size() - 1);
			combinationSums(arr, target, mainList, list, pos + 1);
		}

		return mainList;
	}
}
