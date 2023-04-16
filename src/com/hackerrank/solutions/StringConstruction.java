package com.hackerrank.solutions;

import java.util.*;

public class StringConstruction {

	public static void main(String[] args) {
		System.out.println(StringConstruction.stringConstruction("bccb"));
	}

	public static int stringConstruction(String s) {
		Set<String> set1 = new HashSet<String>(Arrays.asList(s.split("")));
		return set1.size();
	}
}
