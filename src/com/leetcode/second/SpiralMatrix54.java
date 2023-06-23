package com.leetcode.second;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrix3 = { { 1, 2 }, { 3, 4 } };
		int[][] matrix4 = { { 2, 5 }, { 8, 4 }, { 0, -1 } };
		int[][] matrix5 = { { 2, 5, 8 }, { 4, 0, -1 } };
		System.out.println(new SpiralMatrix54().spiralOrder(matrix1));
		System.out.println(new SpiralMatrix54().spiralOrder(matrix2));
		System.out.println(new SpiralMatrix54().spiralOrder(matrix3));
		System.out.println(new SpiralMatrix54().spiralOrder(matrix4));
		System.out.println(new SpiralMatrix54().spiralOrder(matrix5));
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		int m = 0, n = 0;
		n = matrix.length;
		m = matrix[0].length;

		if (m == 1) {
			for (int[] k : matrix) {
				list.add(k[0]);
			}
			return list;
		}

		if (n == 1) {
			for (int k : matrix[0]) {
				list.add(k);
			}
			return list;
		}

		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = m - 1;

		while (top <= bottom && left <= right) {

			// row fix
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			top++;

			// column fix
			for (int i = top; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			right--;

			// row fix
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					list.add(matrix[bottom][i]);
				}
			}
			bottom--;

			// column fix
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					list.add(matrix[i][left]);
				}
			}
			left++;

		}

		return list;

	}

}
