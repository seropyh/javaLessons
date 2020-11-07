package com.example;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExample {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(1);
		
		list.add(0, 5);
		
		
		for (var i : list)
			System.out.println(i);

		System.out.println(list.get(2));
		
		
		var matrix = new ArrayList<ArrayList<HashMap<String,Integer>>>();
	}

}
