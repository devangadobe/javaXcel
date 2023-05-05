package com.leetcode;

public class MyPow {

	public static void main(String[] args) {
		System.out.println(new MyPow().myPow(2.000, -2147483648));
	}

	public double myPow(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (x == 0 || x == 1) {
			return x;
		}
		double m = Math.abs((double) n);
		double res = 1;
		while (m > 0) {
			if (m % 2 == 1) {
				res *= x;
				m--;
			} else {
				x = x * x;
				m = m / 2;
			}
		}
		if (n < 0) {
			return 1 / res;
		}
		return res;
	}

}
