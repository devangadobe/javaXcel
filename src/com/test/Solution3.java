package com.test;

public class Solution3 {

	public static void main(String[] args) {
		System.out.println(new Solution3().solution("AABB"));
	}

	public String solution(String str) {
		StringBuilder sb = new StringBuilder(str);
		int i = 0;
		while (sb.length() > 0 && i + 1 < sb.length()) {
			if (isAdjacent(sb, i)) {
				sb.deleteCharAt(i);
				sb.deleteCharAt(i);
				i = 0;
				continue;
			}
			i++;
		}
		return sb.toString();
	}

	private boolean isAdjacent(StringBuilder sb, int i) {
		       if ((sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'B') 
				|| (sb.charAt(i) == 'B' && sb.charAt(i + 1) == 'A')
				|| (sb.charAt(i) == 'C' && sb.charAt(i + 1) == 'D')
				|| (sb.charAt(i) == 'D' && sb.charAt(i + 1) == 'C')) {
			return true;
		}
		return false;
	}
}
