package com.example;

import java.util.concurrent.atomic.AtomicInteger;


class Table {
	 void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
		}
		try {
			Thread.sleep(400);
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

class Thread1 implements Runnable {
	
	private Table t;
	
	public Thread1(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(5);
	}
	
}

class Thread2 implements Runnable {
	
	private Table t;
	
	public Thread2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(100);
	}
	
}

class ThreadCounter implements Runnable {
	
	private int count = 8;
	
	public int getCount() {
		return count;
	}
	
	public void sleeping(int i) {
		try {
			Thread.sleep(i * 1000);
		}
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			sleeping(i);
			count--;
		}
		
	}
	
}


public class ThreadApplication2 {
	
	private static int number;
	private static boolean ready;
	
	private static class Reader extends Thread {

		@Override
		public void run() {
			while (!ready) {
				Thread.yield();
			}
			
			System.out.println(number);
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
//		var count = new IntWrapper();
//		for (int i = 0; i < 2000; i++) {
//			var thread = new Thread() {
//				
//				public void run() {
//					count.increment();
//				}
//			};
//			thread.start();
////			thread.join();
//		}
//		System.out.println(count.getCount());

//		Table obj = new Table();
//		Thread thread1 = new Thread(new Thread1(obj));
//		Thread thread2 = new Thread(new Thread2(obj));
//		thread1.start();
//		thread2.start();
		
//		ThreadCounter th = new ThreadCounter();
//		Thread t1 = new Thread(th);
//		Thread t2 = new Thread(th);
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		
//		System.out.println(th.getCount());
		
		new Reader().start();
		number = 42;
		ready = true;
	}

}
