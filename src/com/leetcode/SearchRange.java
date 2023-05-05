package com.leetcode;

import java.util.Arrays;

public class SearchRange {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		System.out.println(Arrays.toString(new SearchRange().searchRange(arr, 8)));
	}

	public int[] searchRange(int[] nums, int target) {
		int length = nums.length;
		int left = 0, right = length - 1, mid = 0;
		int[] result = { -1, -1 };

		if (right == -1) {
			return result;
		}

		if (right == 0) {
			if (target == nums[0]) {
				return new int[] { 0, 0 };
			} else {
				return result;
			}
		}

		while (left <= right && left < length && right >= 0) {
			mid = left + ((right - left) / 2);
			if (nums[mid] == target) {
				if ((mid > 0 && nums[mid - 1] != target) || mid == 0) {
					result[0] = mid;
					break;
				} else {
					left = 0;
					right = mid - 1;
				}
				continue;
			}
			if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		left = 0;
		right = length - 1;
		mid = 0;

		while (left <= right && left < length && right >= 0) {
			mid = left + ((right - left) / 2);
			if (nums[mid] == target) {
				if ((mid + 1 < length && nums[mid + 1] != target) || mid == length - 1) {
					result[1] = mid;
					break;
				} else {
					left = mid + 1;
					right = length - 1;
					continue;
				}
			}
			if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return result;
	}
}
