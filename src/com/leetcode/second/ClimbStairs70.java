package com.leetcode.second;

public class ClimbStairs70 {

	public static void main(String[] args) {

		System.out.println(new ClimbStairs70().climbStairs(4));

	}

	public int climbStairs(int n) {
		int[] mem = new int[n + 1];

		/*mem[1] = 1;
		mem[0] = 1;

		for (int i = 2; i <= n; i++) {
			mem[i] = mem[i - 1] + mem[i - 2];
		}

		mem[0] = 0;

		return mem[n];*/
		return climbStairsMem(n, mem);
	}

	public int climbStairsMem(int n, int[] mem) {

		if (n <= 2) {
			return n;
		}

		if (mem[n - 1] == 0) {
			mem[n - 1] = climbStairsMem(n - 1, mem);
		}

		if (mem[n - 2] == 0) {
			mem[n - 2] = climbStairsMem(n - 2, mem);
		}

		return mem[n - 1] + mem[n - 2];
	}
}
