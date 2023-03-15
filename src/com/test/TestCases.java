package com.test;

public class TestCases {
	
	public static void main(String[] args) {
		System.out.println(solve(2,3,3));
	}

	private static long solve(int i, int j, int k) {
		
		long gcd  = findGCD(2,3);
		
		System.out.println(gcd);
		
		long lcm = i*j/gcd;
	    
		return lcm;		
	}

	private static long findGCD(int a, int b) {
		
		long gcd = 1;
		
		for (long i = 1; i < a && i < b; i++) {
			
			if(a%i==0 && b%i==0) {
				gcd  = i;
				break;
			}
			
		}
		
		return gcd;
	}

}
