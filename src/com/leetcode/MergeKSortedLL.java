package com.leetcode;

import java.util.PriorityQueue;

public class MergeKSortedLL {

	public static void main(String[] args) {
       new MergeKSortedLL().mergeKLists(null);
	}
	
	 public ListNode mergeKLists(ListNode[] lists) {
		 
		 if(lists==null || lists.length==0) {
			 return null;
		 }
		 
		 PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>();
		 
		 int i=0;
		 
		 while(i<lists.length){				 
			 while(lists[i] != null)
			   {
				 pq.add(lists[i]);
				 lists[i] = lists[i].next;
			   }
			 i++;
		 }
		 
		ListNode latest = pq.poll(); 
		ListNode head = latest;
		
	    while(!pq.isEmpty()) {	    	
	    	latest.next = pq.poll();
	    	latest = latest.next;
	    }
		 
		 return head;	        
	   }

}
