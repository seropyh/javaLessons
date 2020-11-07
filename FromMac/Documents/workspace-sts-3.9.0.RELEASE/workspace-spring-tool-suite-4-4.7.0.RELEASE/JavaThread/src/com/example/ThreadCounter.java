package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCounter implements Runnable {
	//private int count;
	private AtomicInteger count = new AtomicInteger();
	//public int getCount() {
	public AtomicInteger getCount() {
	return count;
	};

	public void sleeping(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			sleeping(i);
			count.getAndIncrement();
		}
	}
}