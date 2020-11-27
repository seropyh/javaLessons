package com.example;

public class IntWrapper {
	
	private int count;
	
	public synchronized void increment() {
		setCount(getCount() + 1);
	}
	
	public synchronized int getCount() {
		return this.count;
	}
	
	public synchronized void setCount(int count) {
		this.count = count;
	}

}
