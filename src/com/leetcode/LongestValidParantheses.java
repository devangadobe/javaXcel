package com.leetcode;

import java.util.Stack;

public class LongestValidParantheses {

	public static void main(String[] args) {
		
		System.out.println(new LongestValidParantheses().longestValidParentheses("(()))("));

	}
	
	 public int longestValidParentheses(String s) {
	        int maxans = 0;
	        Stack<Integer> stack = new Stack<>();
	        stack.push(-1);
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '(') {
	                stack.push(i);
	            } else {
	                stack.pop();
	                if (stack.empty()) {
	                    stack.push(i);
	                } else {
	                    maxans = Math.max(maxans, i - stack.peek());
	                }
	            }
	        }
	        return maxans;
	    }

}
