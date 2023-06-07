package com.leetcode.second;

public class AddBinaryN {

	public static void main(String[] args) {
		System.out.println(new AddBinaryN().addBinary("1", "0"));

	}

	public String addBinary(String a, String b) {
		int i, j, carry = 0;
		i = a.length() - 1;
		j = b.length() - 1;
		String str = "";
		while (i >= 0 && j >= 0) {
			if (a.charAt(i) == '0' && b.charAt(j) == '0' && carry == 0) {
				str += '0';
			} else if (a.charAt(i) == '0' && b.charAt(j) == '0' && carry == 1) {
				str += '1';
				carry = 0;
			} else if (a.charAt(i) == '0' && b.charAt(j) == '1' && carry == 0) {
				str += '1';
			} else if (a.charAt(i) == '1' && b.charAt(j) == '0' && carry == 0) {
				str += '1';
			} else if (a.charAt(i) == '0' && b.charAt(j) == '1' && carry == 1) {
				str += '0';
			} else if (a.charAt(i) == '1' && b.charAt(j) == '0' && carry == 1) {
				str += '0';
			} else if (a.charAt(i) == '1' && b.charAt(j) == '1' && carry == 0) {
				str += '0';
				carry = 1;
			} else if (a.charAt(i) == '1' && b.charAt(j) == '1' && carry == 1) {
				str += '1';
			}
			i--;
			j--;
		}
		StringBuilder sbc = new StringBuilder();
		sbc.append(str);
		sbc.reverse();
		str = sbc.toString();

		// carry 0
		if (i < 0 && j < 0 && carry == 0) {
			return str;
		}
		if (i < 0 && j >= 0 && carry == 0) {
			return b.substring(0, j + 1) + str;
		}
		if (j < 0 && i >= 0 && carry == 0) {
			return a.substring(0, i + 1) + str;
		}

		// carry 1
		if (i < 0 && j < 0 && carry == 1) {
			return '1' + str;
		}
		if (i < 0 && j >= 0 && carry == 1) {
			return addOne(b, j) + str;
		}
		if (j < 0 && i >= 0 && carry == 1) {
			return addOne(a, i) + str;
		}
		
		return str;

	}

	private String addOne(String a, int i) {
		char[] arr = a.substring(0,i+1).toCharArray();
		int carry = 1;
		for (; i >= 0; i--) {
			if (carry == 0) {
				break;
			} else if (arr[i] == '0') {
				arr[i] = '1';
				carry = 0;
			} else {
				arr[i] = '0';
			}
		}

		if (carry == 1) {
			return '1' + String.valueOf(arr);
		}

		return String.valueOf(arr);
	}

}
