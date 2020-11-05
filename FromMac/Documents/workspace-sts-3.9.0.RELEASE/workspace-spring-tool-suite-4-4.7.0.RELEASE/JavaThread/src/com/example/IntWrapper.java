package com.example;

public class IntWrapper {
	
	private volatile int count; //volatile
	public synchronized void increment() {
		setCount(getCount()+1);
		
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
