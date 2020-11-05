package com.example;

import java.util.ArrayList;

public class ThreadApplication3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		var arrayList = new ArrayList<String>();
		ThreadAdd th = new ThreadAdd(arrayList);
		Thread t1= new Thread(th);
		Thread t2 = new Thread(th);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(arrayList.size());
	}

}
