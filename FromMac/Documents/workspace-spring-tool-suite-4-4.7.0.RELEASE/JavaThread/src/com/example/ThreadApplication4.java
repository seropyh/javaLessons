package com.example;

import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ThreadApplication4 {

	public static void main(String[] args) throws InterruptedException {

//		var unservedCustomers = new Vector<Integer>();
//		var servedCustomers = new Vector<Integer>();
//		var unservedCustomers = new LinkedBlockingQueue<Integer>();
//		var servedCustomers = new LinkedBlockingQueue<Integer>();
		var unservedCustomers = new ArrayBlockingQueue<Integer>(10);
		var servedCustomers = new ArrayBlockingQueue<Integer>(40);
/*
		new LinkedBlockingQueue<Integer>();
		new ArrayBlockingQueue<Integer>(0);
		new CopyOnWriteArrayList<Integer>();
		new Hashtable<String, String>();
		new ConcurrentHashMap<String, String>();
		new ConcurentSkipListSet<String>();
		new ConcurentSkipListMap<String, String>();
	*/
		var executors = Executors.newFixedThreadPool(5);

		
		for (int i = 1; i <= 20; i++) {
			// unservedCustomers.add(i);
			unservedCustomers.put(i);
		}

		var cashbox1 = new Thread(new CashBox(unservedCustomers, servedCustomers));
		var cashbox2 = new Thread(new CashBox(unservedCustomers, servedCustomers));
		var cashbox3 = new Thread(new CashBox(unservedCustomers, servedCustomers));
		var cashbox4 = new Thread(new CashBox(unservedCustomers, servedCustomers));
		executors.execute(cashbox1);
		executors.execute(cashbox2);
		executors.execute(cashbox3);
		executors.execute(cashbox4);
		executors.awaitTermination(10,TimeUnit.SECONDS);
//		cashbox1.start();
//		cashbox2.start();
//		cashbox3.start();
//		cashbox4.start();
//
//		for (int i = 11; i <= 20; i++) {
//			unservedCustomers.put(i);
//
//			cashbox1.join();
//			cashbox2.join();
//			cashbox3.join();
//			cashbox4.join();

			System.out.println(unservedCustomers.size());
			System.out.println(servedCustomers);
			System.out.println(servedCustomers.size());
		}
	}
