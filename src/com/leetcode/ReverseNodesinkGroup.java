package com.leetcode;

import java.util.*;

public class ReverseNodesinkGroup {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2); head.next = two; // two.next = null;
		ListNode three = new ListNode(3); two.next = three;
		ListNode four = new ListNode(4); three.next = four;
		ListNode five = new ListNode(5); four.next = five; five.next = null;
		
		int k=2;	
		
       new ReverseNodesinkGroup().reverseKGroup(head,k);		

	}
	
    public ListNode reverseKGroup(ListNode head, int k) {
    	
    	if(head == null || null == head.next) {
    		return head;
    	}
    	
    	List<ListNode> list = new ArrayList<ListNode>();
    	list = revLL(head,k);
    	ListNode eHead = null;
    	
    	if(list.size()==1) {
			eHead =  list.get(0);
		}else {
			 eHead = list.get(k-1);
		}
    	ListNode prev;
    	while(list.size() > 1){ 
    		head = list.get(k);
    		prev = list.get(0);
    		list = revLL(head,k);
    		if(list.size()==1) {
    			prev.next =  list.get(0);
    		}else {
    			prev.next = list.get(k-1);
    		}
    	}
    	
    	return eHead;
        
    }

	private List<ListNode> revLL(ListNode head, int k) {
		ListNode temp = head;
		List<ListNode> list  = new ArrayList<ListNode>();
		int i=0;
		while(i<k){
			if(temp == null) {
				list.add(head);
				return list;
			}
			temp = temp.next;
			i++;
		}
		list = revLList(head,k,list);
		list.get(0).next = list.get(k);
		return list;
	}

	private List<ListNode> revLList(ListNode head, int k, List<ListNode> list) {
		
		if(k==1){
			list.add(head);
			list.add(head.next);
			return list;
		}
		
		list = revLList(head.next,k-1,list);
		list.get(0).next = head;
		list.add(0,head);
		
		return list;
		
	}

}
