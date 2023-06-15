package com.leetcode.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(new GroupAnagrams49().groupAnagrams(strs));
	}

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> list = new ArrayList<List<String>>();

		Map<String, List<String>> hmap = new HashMap<String, List<String>>();
		char[] carr;
		List<String> tmp;
		String str;
		for (String s : strs) {
			carr = s.toCharArray();
			Arrays.sort(carr);
			str = String.valueOf(carr);
			if (hmap.containsKey(str)) {
				tmp = hmap.get(str);
				tmp.add(s);
			} else {
				tmp = new ArrayList<String>();
				tmp.add(s);
				hmap.put(str, tmp);
			}
		}
		
		for(List<String> tmp1 : hmap.values()) {
			list.add(tmp1);
		}
		
		return list;

	}

}
