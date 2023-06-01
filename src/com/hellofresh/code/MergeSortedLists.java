package com.hellofresh.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedLists {

	public static void main(String[] args) {

		List<Integer> listA = new ArrayList<>();
		listA.addAll(Arrays.asList(2, 5, 6, 9, 11));
		List<Integer> listB = new ArrayList<>();
		listB.addAll(Arrays.asList(1, 1, 3, 5, 8));

		System.out.println(new MergeSortedLists().mergeSortedLists(listA, listB));

	}

	/*
	 * 
	 */
	private List<Integer> mergeSortedLists(List<Integer> listA, List<Integer> listB) {			
		listA.addAll(listB);
		Collections.sort(listA);
		return listA;
	}

}
