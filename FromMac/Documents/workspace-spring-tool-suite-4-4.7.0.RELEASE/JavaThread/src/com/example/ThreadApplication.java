package com.example;

public class ThreadApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		var thread1 = new Thread(new HelloWorldTask(1));
		var thread2 = new Thread(new HelloWorldTask(2));
		var thread3 = new Thread(new HelloWorldTask(3));
		var thread4 = new Thread(new HelloWorldTask(4));
		thread1.start();
		thread1.join(1000);
		Thread.sleep(1000);
		thread2.start();
		thread2.join();
		Thread.sleep(1000);
		thread3.start();
		thread3.join();
		Thread.sleep(1000);
		thread4.start();
		thread4.join();
	}

}
