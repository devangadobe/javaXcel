package com.leetcode;

public class MergeTwoLLists {

	public static void main(String[] args) {
		
		ListNode list1 = new ListNode(1);
		ListNode two = new ListNode(2); list1.next = two; 
		ListNode three = new ListNode(4); two.next = three;
		
		ListNode list2 = new ListNode(1);
		ListNode two_2 = new ListNode(2); list2.next = two_2;
		ListNode three_2 = new ListNode(4); two.next = three_2;
		
		System.out.println(new MergeTwoLLists().mergeTwoLists(list1,list2));

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		
		ListNode n1 = list1; ListNode n2 = list2;
		ListNode m = new ListNode(-1);
		ListNode head = m;
		
		while(n1!=null && n2!=null){			
			if(n1.val < n2.val){
				m.next = new ListNode(n1.val);
				n1  = n1.next;				
			}else if(n1.val > n2.val){
				m.next = new ListNode(n2.val);
				n2  = n2.next;
			}else if(n1.val == n2.val) {
				m.next = new ListNode(n1.val);
				m.next.next = new ListNode(n1.val);
				n1  = n1.next; n2  = n2.next;
				m = m.next;
			}
			m = m.next;
		}
		
		if(n1!=null){
			m.next  = n1;
		}
		if(n2!=null){
			m.next  = n2;
		}				
		
		return head.next;		
	}

}
