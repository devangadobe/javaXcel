package com.leetcode.second;

import java.util.*;

public class FirstPosInt {

	public static void main(String[] args) {
		int[] nums = {1,2,0};
       System.out.println(new FirstPosInt().firstMissingPositive(nums));
	}

	public int firstMissingPositive(int[] nums) {
		int l = nums.length;
		int p = 1;
		Map<Integer,Integer> hmap = new HashMap<Integer, Integer>();
		for(int i=0; i<l; i++) {
			hmap.put(nums[i], null);		
		}
		int i=0;
		while(i<hmap.size()) {
			if(hmap.containsKey(p)){
				p++;
			}else {
				break;
			}
			i++;
		}
		return p;
	}

}
