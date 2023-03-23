package com.leetcode;

public class MaxArea {

	public static void main(String[] args) {
		
		int[] arr = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(new MaxArea().maxArea(arr));

	}
	
	 public int maxArea(int[] h) {
		 
		    if(h.length == 1) {
		    	return 0;
		    }
		    
		    if(h.length == 2) {
		    	return Math.abs(Math.min(h[0],h[1]));
		    }

	        int left = 0;
	        int right = h.length-1;
	        int gmax =0;

	        
	        while(left<right){
	        		gmax = Math.max(gmax,Math.abs(Math.min(h[left],h[right])*(right-left)));
	        		if(h[left]<h[right]) {
	        		    left++;
	        		}else if(h[left]>h[right]){
	        		right--;
	        		}else {
	        			left++;
	        			right--;
	        		}
	        }        
	        
	        return gmax;
	    } 

}
