package com.leetcode;

public class RemoveElement {

	public static void main(String[] args) {
		
		 int[] nums = {0,1,2,2,3,0,4,2};
		 System.out.println(new RemoveElement().removeElement(nums, 2));
	}
	
    public int removeElement(int[] nums, int val) {
    	int count = 0;
    	int j;
       	for (int i = 0; i < nums.length; i++) {
			while(nums[i]==val){
				for(j=i; j<nums.length-1; j++){					
					nums[j] = nums[j+1];
				}
				nums[j] = -1;
				count++;
			}
		}
        return nums.length - count;
    }
}
