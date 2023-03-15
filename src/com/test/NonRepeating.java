package com.test;

import java.util.*;
import java.util.Map.Entry;

public class NonRepeating {

	public static void main(String[] args) {
		
		String str  = "applea";
		
		System.out.println(nonRepeating(str));

	}

	private static Character nonRepeating(String str) {
		
		Character nstr = null;
		
		Map<Character,Integer> hmap = new LinkedHashMap<Character,Integer>();
		
		for(int i=0; i<str.length() ; i++) {
			if(!hmap.containsKey(str.charAt(i))) {
				hmap.put(str.charAt(i),1);
			}else {
				hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
			}
		}
		
		for(Entry<Character,Integer> e : hmap.entrySet()) {
			
			if( e.getValue() == 1) {
				return e.getKey();
			}
			
		}
		
		return nstr;
	}

}
