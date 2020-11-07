package com.example;

public class HelloWorldTask implements Runnable {

	private int number;

	public HelloWorldTask(int number) {
		this.number = number;

	}

	@Override
	public void run() {
		System.out.println("Hello world " + this.number);
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

		System.out.println("Я проснулся поток - " + this.number);
	}
}