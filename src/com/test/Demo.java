package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Demo {
		public static void main(String[] args) {		
			int[] a = { 1, 7 };
			int[] b = { 7, 1 };
			List<Integer> alist = new ArrayList<Integer>();
			List<Integer> blist = new ArrayList<Integer>();
			for (int i : a)
			{
				alist.add(i);
			}
			for (int i : b)
			{
				blist.add(i);
			}
			Collections.sort(alist);
			Collections.sort(blist);
			System.out.println(new Demo().equalLists(alist, blist));
			HashSet<List<Integer>> hset = new HashSet<List<Integer>>();
			hset.add(alist);
			hset.add(blist);
			System.out.println(hset.toString());
			
			String str = "1101";		 
	        StringBuilder sbc = new StringBuilder();	 
			sbc.append(str);
	        sbc.reverse();
			System.out.println(sbc.toString());
		}

		public boolean equalLists(List<Integer> a, List<Integer> b) {
			
			return a.equals(b);

		}

	}

