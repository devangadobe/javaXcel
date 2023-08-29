package com.test;

public class Solution2 {

	public static void main(String[] args) {
		System.out.println(new Solution2().solution(1,1,1));

	}

	public String solution(int AA, int AB, int BB) {
		
		String Empty = "";
		String sAA = "AA";
		String sA = "A";
		String sBB = "BB";
		String sB = "B";
		String sAB = "AB";

		if (AA == 0 && AB == 0 && BB == 0) {
			return Empty;
		}

		if (AA == 1 && AB == 0 && BB == 0) {
			return sAA;
		}

		if (AA == 0 && AB == 1 && BB == 0) {
			return sAB;
		}

		if (AA == 0 && AB == 0 && BB == 1) {
			return sBB;
		}

		String s = Empty;
		String rem = Empty;
		
		boolean flagAA = (AA >= AB) && (AA >= BB);
		boolean flagAB = (AB >= AA) && (AB >= BB);
		boolean flagBB = (BB >= AA) && (BB >= AB);

		if (AA > 0 && flagAA) {
			rem = solution(AA - 1, AB, BB);
			if (rem.startsWith(sA) && rem.endsWith(sA)) {
				s = rem;
			} else if (rem.startsWith(sA)) {
				s = rem+sAA;
			} else if (rem.endsWith(sA)) {
				s = sAA + rem;
			} else {
				s = sAA + rem;
			}
			return s;
		}

		if (AB > 0 && flagAB) {
			rem = solution(AA, AB-1, BB);
			if(!rem.endsWith("AA")) {
				s = rem+"AB";
			}else if(!rem.startsWith("BB")) {
				s = "AB"+rem;
			}
			return s;
		}

		if (BB > 0 && flagBB) {
			rem = solution(AA, AB, BB-1);
			if (rem.startsWith("B") && rem.endsWith("B")) {
				s = rem;
			} else if (rem.startsWith("B")) {
				s = rem+"BB";
			} else if (rem.endsWith("B")) {
				s = "BB" + rem;
			} else {
				s = "BB" + rem;
			}
			return s;
		}

		return s;

	}

}
