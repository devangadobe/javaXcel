package com.hfjava;

import java.io.Serializable;

public class Foo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int width;
	int height;
	Flavor fvr;
	transient String name;
	
	@Override
	public String toString() {
		return "Foo [width=" + width + ", height=" + height + ", fvr=" + fvr.toString() + ", name=" + name + "]";
	}
	
	

}
