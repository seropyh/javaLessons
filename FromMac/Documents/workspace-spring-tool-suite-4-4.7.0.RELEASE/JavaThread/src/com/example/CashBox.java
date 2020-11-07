package com.example;

import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CashBox implements Runnable {
//	private Vector<Integer> unserved;
//	private Vector<Integer> served;
//	private LinkedBlockingQueue<Integer> unserved;
//  private LinkedBlockingQueue<Integer> served;
	ArrayBlockingQueue<Integer> unserved = new ArrayBlockingQueue<Integer>(2000);
	ArrayBlockingQueue<Integer> served = new ArrayBlockingQueue<Integer>(2000);
	
	new ArrayBlockingQueue<Integer> servedCustomers = new ArrayBlockingQueue<Integer>(2000);
	private static Object a = new Object();

	public CashBox(ArrayBlockingQueue<Integer> unservedCustomers2, ArrayBlockingQueue<Integer> servedCustomers2) {
		this.unserved = unservedCustomers2;
		this.served = servedCustomers2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (process())
			;
	}

	public boolean process() {
		// synchronized (a) {
		Integer client =unserved.poll();
		//synchronized (CashBox.class) {

		/*	if (unserved.isEmpty())
				return false;
			else {
				 client = unserved.remove(0);

			}
			served.add(client);
			return true;
			*/
			if (client == null ) {
				return false;
			}else {
					 served.add(client);
				}
			return true;	
		}
	}

