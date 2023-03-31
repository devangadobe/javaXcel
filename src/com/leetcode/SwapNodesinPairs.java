package com.leetcode;

public class SwapNodesinPairs {

	public static void main(String[] args) {

	}
	
public ListNode swapPairs(ListNode head) {
    	
    	if(head==null || head.next==null) {
    		return head;
    	}
    	ListNode curr = head;
    	ListNode curr2 = head.next;
    	ListNode temp;
	    ListNode prev;
    	head = curr2;	

		   	temp = curr2.next;
    		curr2.next = curr;
    		curr.next = temp;
		    prev = curr;
    		curr = temp;
            curr2 = (temp == null) ? null : temp.next;

    	while(curr!=null && curr2 != null){
    		temp = curr2.next;
    		curr2.next = curr;
    		curr.next = temp;
			prev.next = curr2;
			prev = curr;
    		curr = temp;
            curr2 = (temp == null) ? null : temp.next;
    	}
      return head;
    }

}
