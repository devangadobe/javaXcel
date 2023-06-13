package com.leetcode.second;

import java.util.Stack;

public class SimplifyPath71 {

	public static void main(String[] args) {
		System.out.println(new SimplifyPath71().simplifyPath("/a/./b/../../c/"));
	}

	public String simplifyPath(String path) {
		StringBuilder stb = new StringBuilder();
		Stack<Integer> stk = new Stack<Integer>();
		boolean flag = false;
		for (int i = path.length() - 1; i >= 0; i--) {
			if (path.charAt(i) != '/' && path.charAt(i) != '.' && stk.empty()) {
				stb.append(path.charAt(i));
				flag = true;
			} else if (path.charAt(i) == '/' && flag) {
				if (i > 0 && (path.charAt(i - 1) != '.' || path.charAt(i - 1) != '/')) {
					stb.append(path.charAt(i));
					flag = false;
				}
			} else if (path.charAt(i) == '.') {
				if (i > 0 && (path.charAt(i - 1) == '.')) {
					stk.push(i);
				}
			} else if (path.charAt(i) != '/' && path.charAt(i) != '.' && !stk.empty()) {
				stk.pop();
			}
		}
		if (!stb.toString().endsWith("/")) {
			stb.append('/');
		}

		return stb.reverse().toString();

	}

}
