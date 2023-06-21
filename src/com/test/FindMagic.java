package com.test;

import java.util.Arrays;

class FindMagic {

	public static void main(String[] args) {
		FindMagic fm = new FindMagic();
		int n = 1001;
		System.out.println(fm.findMagical(n));
	}

	private int findMagical(int n) {

		if (n / 1000 == 0 || n == 1000) {
			return -1;
		}

		int p, q;
		int[] seq = twoSeq(n);
		p = seq[0];
		q = seq[1];

		int diff = q - p;
		int steps = 1;

		if (diff == 0) {
			return -1;
		}

		while (diff != 6174) {
			seq = twoSeq(diff);
			p = seq[0];
			q = seq[1];
			diff = q - p;
			if (diff == 0) {
				break;
			}
			steps++;
		}

		if (diff == 6174) {
			return steps;
		}

		return -1;

	}

	private int[] twoSeq(int n) {

		int[] seq = new int[2];

		String str = String.valueOf(n);

		char[] carr = str.toCharArray();

		Arrays.sort(carr);

		String temp = String.valueOf(carr);
		int i;
		for (i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) != '0') {
				break;
			}
		}

		temp = temp.substring(i);

		seq[0] = Integer.parseInt(temp);

		StringBuilder stb = new StringBuilder();
		stb.append(String.valueOf(carr));
		stb.reverse();

		temp = stb.toString();
		for (i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) != '0') {
				break;
			}
		}

		temp = temp.substring(i);

		seq[1] = Integer.parseInt(String.valueOf(temp));

		return seq;

	}
}
