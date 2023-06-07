package com.leetcode.second;

import java.util.Arrays;

public class PlusOneCode {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 2, 0, 0, 4, 6, 2, 4, 9 };
        System.out.println(Arrays.toString(new PlusOneCode().plusOne(arr)));
	}

	public int[] plusOne(int[] digits) {
		int l = digits.length - 1;
		if (digits[l] != 9) {
			digits[l]++;
			return digits;
		}
		int i = l;
		while (i >= 0) {
			if (digits[i] == 9) {
				digits[i] = 0;
				i--;
			} else {
				digits[i]++;
				break;
			}
		}
		if (digits[0] != 0) {
			return digits;
		} else {
			int[] arr = new int[l + 2];
			arr[0] = 1;
			return arr;
		}
	}
}
