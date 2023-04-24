package com.test;

public class Solution1 {

	public static void main(String[] args) {

		System.out.println(new Solution1().solution(2,1,10));

	}

	public String solution(int AA, int AB, int BB) {

		boolean isAA = false;
		boolean isBB = false;
		boolean isAB = false;
		boolean isPrint = false;
		StringBuilder sb = new StringBuilder();

		while (AA > 0 || BB > 0 || AB > 0) {

			if (AB > AA && AA == BB) {
				sb.append("AB");
				isAB = true;
				AB--;
				isPrint = true;
			}

			if (AB == 0) {
				if (AA >= BB && isAA == false) {
					sb.append("AA");
					isAA = true;
					AA--;
					if (BB > 0) {
						sb.append("BB");
						isBB = true;
						isAA = false;
						BB--;
					}
				}
				if (BB >= AA && isBB == false && isAB == false) {
					sb.append("BB");
					isBB = true;
					isAA = false;
					BB--;
					if (AA > 0) {
						sb.append("AA");
						isAA = true;
						isBB = false;
						AA--;
					}
				}
			}

			if (BB > 0 && isBB == false && isAB == false) {
				sb.append("BB");
				BB--;
				isAA = false;
				isBB = true;
				isAB = false;
				isPrint = true;
			}

			if (AB > 0 && isAA != true) {
				sb.append("AB");
				AB--;
				isAA = false;
				isBB = false;
				isAB = true;
				isPrint = true;
			}

			if (AA > 0 && isAA == false) {
				sb.append("AA");
				AA--;
				isAA = true;
				isBB = false;
				isAB = false;
				isPrint = true;
			}

			if (isPrint == false) {
				break;
			}

			isPrint = false;

		}
		return sb.toString();
	}
}
