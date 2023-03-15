package com.test;

public class SubclassL2 extends SubclassL1 {
	
	final int i = 0;	
	int x;
	Integer y;
	
	 public void  printMsg() {	
	    super.printMsg();	
	}
	 
	void go() {
		System.out.println(i);
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {		
         SubclassL2 l2 = new SubclassL2();
         l2.x = l2.y;
         l2.go();	
	}

}
