package com.test;

class Solution{
	
	public static void main(String[] args) {
		new Solution().Solutions(10078);
	}
	
	public void Solutions(int N) {
	    int enable_print = N % 10;
	    while (N > 0) {
	        if (enable_print == 0 && N % 10 != 0) {
	            enable_print = 1;
	        }
	        if (enable_print != 0) { //this
	            System.out.print(N % 10);
	        }
	        N = N / 10;
	    }
}
}