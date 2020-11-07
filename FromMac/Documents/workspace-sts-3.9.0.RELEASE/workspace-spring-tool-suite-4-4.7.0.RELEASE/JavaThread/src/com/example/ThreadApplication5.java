package com.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadApplication5 {

	public static void main(String[] args) {
		//		var unservedCustomers = new Vector<Integer>();
//		var servedCustomers = new Vector<Integer>();
//		var unservedCustomers = new LinkedBlockingQueue<Integer>();
//		var servedCustomers = new LinkedBlockingQueue<Integer>();
		var unservedCustomers = new ArrayBlockingQueue<Integer>(2000);
		var servedCustomers = new ArrayBlockingQueue<Integer>(2000);
/*
		new LinkedBlockingQueue<Integer>();
		new ArrayBlockingQueue<Integer>(0);
		new CopyOnWriteArrayList<Integer>();
		new Hashtable<String, String>();
		new ConcurrentHashMap<String, String>();
		new ConcurentSkipListSet<String>();
		new ConcurentSkipListMap<String, String>();
	*/
		var executors = Executors.newFixedThreadPool(4);

		
		for (int i = 1; i <= 2000; i++) {
			// unservedCustomers.add(i);
			unservedCustomers.add(i);
		}
		var arrayListResult = new ArrayList<Future<Integer>>();
			//var result =executors.submit(cashbox1);
		for (int i = 1; i <= 4; i++) {
			
			Future<Integer>task = executors.submit(new CashBox2(unservedCustomers,servedCustomers));
					arrayListResult.add(task);
		}
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(arrayListResult.get(i).get(10,TimeUnit.SECONDS));
				
			}catch (InterruptedException | ExecutionException | TimeoutException e) {
				e.printStackTrace();
			}
		}
		executors.shutdown();
		/*executors.execute(cashbox1);
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
 
 */

	//		System.out.println(unservedCustomers.size());
	//		System.out.println(servedCustomers);
	//		System.out.println(servedCustomers.size());
		

}

}
