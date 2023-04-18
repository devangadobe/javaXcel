package com.leetcode;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		new RotateMatrix().rotate(matrix);

	}
	
	public void rotate(int[][] matrix) {

		int left, right, top, bottom, topleft;
		left = 0;
		right = matrix.length - 1;

		while (left < right) {

			for (int i = 0; i < right - left; i++) {

				top = left;
				bottom = right;
				
				topleft = matrix[top][left + i];

				matrix[top][left + i] = matrix[bottom - i][left];

				matrix[bottom - i][left] = matrix[bottom][right - i];

				matrix[bottom][right - i] = matrix[top + i][right];

				matrix[top + i][right] = topleft;

			}

			left++;
			right--;
		}

	}

}
