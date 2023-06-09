package com.leetcode.second;

public class IsPalindrome125 {

	public static void main(String[] args) {

		String str = "A man, a plan, a canal: Panama";
		System.out.println(new IsPalindrome125().isPalindrome(str));

	}

	public boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		boolean flagA, flagB;
		while (i <= j) {
			flagA = isAlphanumeric(s.charAt(i));
			flagB = isAlphanumeric(s.charAt(j));

			if (flagA && flagB) {
				if ((s.charAt(i) - s.charAt(j)) == 0
						|| (s.charAt(i) > 57 && s.charAt(j) > 57 && Math.abs((s.charAt(i) - s.charAt(j))) == 32)) {
					i++;
					j--;
				} else {
					return false;
				}
			} else if (flagA) {
				j--;
			} else if (flagB) {
				i++;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}

	private boolean isAlphanumeric(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
	}

}
