package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;


class ThreadAdd implements Runnable {
	
	private List<String> arrayList;
	
	public ThreadAdd(List<String> arrayList) {
		this.arrayList = arrayList;
	}
	
	public int getSize() {
		return this.arrayList.size();
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			arrayList.add("ttt");
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
	}
	
}


public class ThreadApplication3 {

	public static void main(String[] args) throws InterruptedException {
		var arrayList = Collections.synchronizedList(new ArrayList<String>());
		
		
		var arrayList2 = new CopyOnWriteArrayList<String>();
		var map = new ConcurrentHashMap<String, String>();
		
		
		ThreadAdd th = new ThreadAdd(arrayList);
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(arrayList.size());
	}

}
