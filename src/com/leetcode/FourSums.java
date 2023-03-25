package com.leetcode;

import java.util.*;

public class FourSums {

	public static void main(String[] args) {		
		int[] nums = {1000000000,1000000000,1000000000,1000000000};
		System.out.println(new FourSums().fourSum(nums ,-294967296));      
	}
	
    public List<List<Integer>> fourSum(int[] nums, int target) { 
    	
    	List<List<Integer>> lists = new ArrayList<List<Integer>>();
    	
    	if(nums.length < 4) {
    		return lists;
    	}
    	
    	Arrays.sort(nums); 
    	int sum;
    	int n=nums.length;
    	List<Integer> temp;
    	for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int s=j+1;
                int e=n-1;
                while(s<e){
                  sum=nums[i];
                  sum+= nums[j];
                  sum+=nums[s];
                  sum+=nums[e];
                  if(sum==target)
                  {
                	 temp = new ArrayList<Integer>();
                	 temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[s]); temp.add(nums[e]);
                	 if(!lists.contains(temp)){
                	 lists.add(temp);   
                	 }
                  }
                  if(sum<target)
                      s++;
                  else
                    e--;
                }
                }
         }
    	return lists;     
    }

}
