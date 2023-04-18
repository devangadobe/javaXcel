package com.hackerrank.solutions;

import java.util.*;

public class SherlockandtheValidString {

	public static void main(String[] args) {

		System.out.println(SherlockandtheValidString.isValid("aaaaabc"));
	}

	public static String isValid(String s) {
		final String yes = "YES";
		final String no = "NO";
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}

		Set<Integer> hset = new HashSet<Integer>(hmap.values());
		if (hset.size() > 2) {
			return no;
		}
		if (hset.size() < 2) {
			return yes;
		}
		List<Integer> list = new ArrayList<Integer>(hset);

		if (!hset.contains(1) && Math.abs(list.get(0) - list.get(1)) != 1) {
			return no;
		}

		Map<Integer, Integer> imap = new HashMap<Integer, Integer>();
		for (int i : hmap.values()) {
			if (imap.containsKey(i)) {
				imap.put(i, imap.get(i) + 1);
			} else {
				imap.put(i, 1);
			}
		}

		if (imap.containsKey(1) && imap.get(1) > 1) {
			return no;
		}

		if (imap.containsValue(1)) {
			return yes;
		}

		return no;
	}

}
