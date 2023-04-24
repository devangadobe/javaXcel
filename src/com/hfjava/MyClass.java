package com.hfjava;

import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		MyClass myClass = new MyClass(1);
	    MyClass anotherMyClass = new MyClass(1);

	    Set<MyClass> myHashSet = new HashSet<>();
	    myHashSet.add(myClass);
	    myHashSet.add(anotherMyClass);

	    System.out.println(myHashSet.size());
	    System.out.println(myClass.equals(anotherMyClass));

	}
	
	    
	    private int myInt;
	    
	    public MyClass(final int myInt) {
	        this.myInt = myInt;
	    }

	    public boolean equals(Object object) {
	        if(this == object){
	            return true;
	        }

	        if(object instanceof MyClass){
	           MyClass m = (MyClass) object; 
	           return (this.myInt == m.myInt);
	        }

	        return false;
	    }
	    

	    public int hashCode() {
	    	return myInt;
	    }


}
