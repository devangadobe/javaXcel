package com.test;

import java.io.Serializable;

public class Flavor implements Comparable<Flavor>, Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int stock;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public int compareTo(Flavor o) {
		return stock - o.getStock();
	}
	
	@Override
	public String toString() {
		return name + "=" + stock;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return this.name == ((Flavor) obj).name;
	}
	
    @Override
    public int hashCode() {
    	return this.stock;
    }


}
