package com.leetcode;

import java.util.*;

public class IsValidSudoku {

	public static void main(String[] args) {

		char[][] mat = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(new IsValidSudoku().isValidSudoku(mat));

	}

	public boolean isValidSudoku(char[][] board) {

		// check for all grids first

		HashMap<Character, Object> hmap = new HashMap<Character, Object>();

		int i, j, p, q;

		for (i = 0; i < 9; i += 3) {
			for (j = 0; j < 9; j += 3) {
				for (p = i; p < i + 3; p++) {
					for (q = j; q < j + 3; q++) {
						if (board[p][q] != '.') {
							if (hmap.containsKey(board[p][q])) {
								return false;
							} else {
								hmap.put(board[p][q], null);
							}
						}
					}
				} // ends grid check
				hmap = new HashMap<Character, Object>();
			}
		}

		// check for all rows
		for (i = 0; i < 9; i++) {
			for (j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (hmap.containsKey(board[i][j])) {
						return false;
					} else {
						hmap.put(board[i][j], null);
					}
				}
			}
			hmap = new HashMap<Character, Object>();
		}

		// check for all columns
		for (j = 0; j < 9; j++) {
			for (i = 0; i < 9; i++) {
				if (board[i][j] != '.') {
					if (hmap.containsKey(board[i][j])) {
						return false;
					} else {
						hmap.put(board[i][j], null);
					}
				}
			}
			hmap = new HashMap<Character, Object>();
		}

		return true;

	}

}
