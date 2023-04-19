package com.leetcode;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {5,1,2,3,4};
		System.out.println(new SearchinRotatedSortedArray().search(nums, 1));

	}

	public int search(int[] nums, int target) {

		if (nums.length == 0 || (nums.length == 1 && nums[0] != target)) {
			return -1;
		}
		
		if(nums.length == 1){
			return 0;
		}
		
		if(nums.length == 2) {
			int i = -1;
			for(int j=0; j<2; j++){
				if(nums[j]==target) i=j;
			}
			return i;
		}
		
		//0 rotation check
		if(nums[0] <  nums[nums.length-1]){
			return binarySearch(nums, target, 0, nums.length - 1);
		}

		int i = lookForPivot(nums, 0, nums.length - 1);

		if (target > nums[nums.length - 1]) {
			// look in former array
			return binarySearch(nums, target, 0, i);
		} else {
			// look in later array
			return binarySearch(nums, target, i, nums.length - 1);
		}

	}

	private int lookForPivot(int[] nums, int l, int r) {

		if (l == r-1) {
			if(nums[l]>nums[r]){
				return r;
			}else {
				return l;
			}
		}

		int mid = (l + r) / 2;

		if (l > 0 && nums[l] < nums[l - 1]) {
			return l;
		}

		if (nums[l] < nums[mid]) {
			return lookForPivot(nums, mid + 1, r);
		} else {
			return lookForPivot(nums, l, mid);
		}
	}

	private int binarySearch(int[] nums, int target, int l, int r) {

		if (l > r) {
			return -1;
		}

		int mid = (l + r) / 2;

		if (target == nums[mid]) {
			return mid;
		}

		if (target < nums[mid]) {
			return binarySearch(nums, target, l, mid - 1);
		} else {
			return binarySearch(nums, target, mid + 1, r);
		}

	}

}
