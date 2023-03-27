package com.leetcode;

public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2); head.next = two; // two.next = null;
		ListNode three = new ListNode(3); two.next = three;
		ListNode four = new ListNode(4); three.next = four;
		ListNode five = new ListNode(5); four.next = five; five.next = null;
		
		int n=2;
		
		System.out.println(new RemoveNthNodeFromEnd().removeNthFromEnd(head,n));

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		if(head==null || head.next == null ){
			return null;
		}		
		
	    int p = removeNth(head,head.next,n);
	    
	    if(p==1){
	    	head = head.next;
	    }
	    
	    return head;
		
	}

	private int removeNth(ListNode prev, ListNode curr, int n) {
		if(curr == null) {
			return -1;
		}
		int p = removeNth(curr,curr.next,n);
		
		if(p==0) {
			return p;
		}
		
		if(p==-1 && n==1){
			prev.next = null;
			return 0;
		}
		if(p==-1 && n>1){
			return n-1;
		}
		if(p==1 && n>1){
			prev.next = curr.next;
			curr.next = null;
		}
		return p-1;
	}

}
