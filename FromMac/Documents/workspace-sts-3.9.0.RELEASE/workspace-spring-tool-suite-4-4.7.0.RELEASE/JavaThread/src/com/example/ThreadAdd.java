package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadAdd implements Runnable {
	//private ArrayList<String> arrayList;
	List<String> arrayList = Collections.synchronizedList(new ArrayList<String>());
	
	public ThreadAdd (ArrayList<String> arrayList) {
		this.arrayList = arrayList;
	}
	@Override
	public void run() {
		for(int i =1;i<10;i++) {
			arrayList.add("ttt");
			try {
				Thread.sleep(1_000);
			}catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			};
		}
		
	}

public int getSize() {
	return this.arrayList.size();
}

}
