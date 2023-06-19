package com.leetcode.second;

public class NextGreatestLetter744 {

	public static void main(String[] args) {
		char[] arr = { 'c', 'd', 'j' };

		System.out.println(new NextGreatestLetter744().nextGreatestLetter(arr, 'a'));
	}

	public char nextGreatestLetter(char[] letters, char target) {
		char res = letters[0];
		int n = binarySearch(letters, 0, letters.length - 1, target);
		if (n != -1) {
			res = letters[n];
		}
		return res;
	}

	private int binarySearch(char[] letters, int l, int r, char target) {

		if (r < l) {
			return -1;
		}

		int mid = l + ((r - l) / 2);

		if ((letters[mid] > target && mid > 0 && (letters[mid - 1] <= target))) {
			return mid;
		}

		if (letters[mid] <= target) {
			return binarySearch(letters, mid + 1, r, target);
		} else {
			return binarySearch(letters, l, mid - 1, target);
		}

	}
}
