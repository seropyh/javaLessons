package com.example;

public class HelloWorldTask implements Runnable {
	
	private int number;
	
	public HelloWorldTask(int number) {
		this.number = number;	
	}

	@Override
	public void run() {
		System.out.println("Привет, мир. Поток-" + this.number);
		
		try {
			Thread.sleep(2_000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Я проснулся. Поток-" + this.number);
	}

}
