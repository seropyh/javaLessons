package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class TreadApplication2 {
	private volatile static int number;
	private volatile static boolean ready=false;
	private  static class Reader extends Thread {
		@Override
		public void run() {
			while (!ready) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			System.out.println(number);
		}
	}
	{
		
	}
	public static void main(String[] args) throws InterruptedException {
	new Reader().start();
	number =42;
	ready=true;
		// TODO Auto-generated method stub
		//var count = new IntWrapper();
//		var count = new AtomicInteger();
//		for (int i = 0; i < 2000; i++) {
//			var thread = new Thread() {
//
//				public void run() {
//					//count.increment();
//				count.getAndIncrement(); 
//				}
//			};
//			thread.start();
//		//	thread.join();
//		}
//		System.out.println(count.get());
		ThreadCounter th = new ThreadCounter();
		
		Thread t1  = new Thread(th);
		Thread t2  = new Thread(th);
		t1.start();
		t2.start();
				t1.join();
				t2.join();
		System.out.println(th.getCount());		
	}

}
