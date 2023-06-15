package com.leetcode.second;

import java.util.LinkedList;

public class MultiplyStr43 {

	public static void main(String[] args) {
		System.out.println(new MultiplyStr43().multiply("584", "18"));
	}

	public String multiply(String num1, String num2) {
		
		if("0".equals(num2) || "0".equals(num1)) {
			return "0";
		}
		
		if("1".equals(num2)) {
			return num1;
		}else if("1".equals(num1)) {
			return num2;
		}

		String str1 = num1.length() >= num2.length() ? num1 : num2;
		String str2 = num1.length() >= num2.length() ? num2 : num1;

		LinkedList<String> list = new LinkedList<String>();

		int i = str2.length() - 1, carry = 0, j = str1.length() - 1, d1, d2, r;

		StringBuilder stb = new StringBuilder();

		while (i > -1) {
			d2 = Character.getNumericValue(str2.charAt(i));
			while (j > -1) {
				d1 = Character.getNumericValue(str1.charAt(j));

				r = d2 * d1 + carry;
				carry = r / 10;

				stb.append(r % 10);
				j--;
			}
			if (carry != 0) {
				stb.append(carry);
				carry = 0;
			}

			list.add(stb.reverse().toString());
			stb.delete(0, stb.length());
			j = str1.length() - 1;
			i--;
		}

		i = 0;
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add(list.get(0));
		String s;
		for (int k = 1; k < list.size(); k++) {
			s = list.get(k);		
			for(int y=0; y<k; y++) {
				s+='0';
			}
			list2.add(s);
		}
	
		i = 0;
		stb.delete(0, stb.length());
		stb.append(list.get(0));
		s = "";
		
		for (String str : list2) {
			s = add(str, s, i);
			i++;
		}
		return s;
	}

	private String add(String str, String stb, int p) {

		if (p == 0) {
			return str;
		}

		StringBuilder stbl = new StringBuilder();
		int i = str.length()-1, j = stb.length() - 1;
		int d1, d2, carry = 0, r;

		while (i > -1 && j > -1) {
			d2 = Character.getNumericValue(str.charAt(i));
			d1 = Character.getNumericValue(stb.charAt(j));

			r = d1 + d2 + carry;
			stbl.append(r % 10);
			carry = r / 10;
			i--;
			j--;
		}

		if (i == j && carry > 0) {
			stbl.append(carry);
			carry = 0;
		}

		else if (i > j) {
			while (i > -1) {
				d2 = Character.getNumericValue(str.charAt(i));
				r = d2 + carry;
				stbl.append((carry + d2) % 10);
				carry = r / 10;
				i--;
			}
		}
		if(carry > 0) {
			stbl.append(carry);
		}
		return stbl.reverse().toString();

	}

}
