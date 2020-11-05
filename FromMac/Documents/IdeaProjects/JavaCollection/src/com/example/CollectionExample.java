package com.example;

import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		var set = new TreeSet<String>();
		set.add("test");
		set.add("tttt");
		set.add("aaaa");
		
		for (String str : set) {
			System.out.println(str);
		}

	}

}
