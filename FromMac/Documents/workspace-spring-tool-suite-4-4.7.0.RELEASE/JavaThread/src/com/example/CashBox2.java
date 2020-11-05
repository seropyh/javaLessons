package com.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

	public class CashBox2 implements Callable <Integer> {
//		private Vector<Integer> unserved;
//		private Vector<Integer> served;
//		private LinkedBlockingQueue<Integer> unserved;
	//  private LinkedBlockingQueue<Integer> served;
		ArrayBlockingQueue<Integer> unserved = new ArrayBlockingQueue<Integer>(2000);
		ArrayBlockingQueue<Integer> served = new ArrayBlockingQueue<Integer>(2000);
		
		//new ArrayBlockingQueue<Integer> 
		ArrayBlockingQueue<Integer> servedCustomers = new ArrayBlockingQueue<Integer>(2000);
		private static Object a = new Object();

		public CashBox2(ArrayBlockingQueue<Integer> unservedCustomers2, ArrayBlockingQueue<Integer> servedCustomers2) {
			this.unserved = unservedCustomers2;
			this.served = servedCustomers2;
		}

	/*	@Override
		public void run() {
			// TODO Auto-generated method stub
			while (process())
				;
		}
*/
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

		@Override
		public Integer call() throws Exception {
			// TODO Auto-generated method stub
			int count = 0;
			while (process()) {
				count++;
			}
				
			return count;
		
		}


}
