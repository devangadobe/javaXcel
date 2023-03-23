package com.leetcode;

public class MaxArea2 {

	public static void main(String[] args) {
		
		int[] arr = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(new MaxArea2().maxArea(arr));

	}
	
	 public int maxArea(int[] h) {
		 
		    if(h.length == 1) {
		    	return 0;
		    }
		    
		    if(h.length == 2) {
		    	return Math.abs(h[1]-h[0]);
		    }

	        int gmax=0;
	        int k = h.length-1;
	        int max=h[k-1];
	        int i = k-1;
	        while(k>0){
	        	max=h[k-1];
	        	while(i>=0 && h[k]>h[i]) {
	        		if(h[i]>max){
	        			max=h[i];
	        		}
	        		i--;
	        	} 
	            if(max < h[i]) {
	            	gmax = Math.max(gmax,Math.abs(h[k]*(k-i)));
	            }else {
	            	gmax = Math.max(gmax,Math.abs(max*(k-i)));
	            }	            
	            k--;	        	
	        }        
	        
	        return gmax;
	    } 

}
