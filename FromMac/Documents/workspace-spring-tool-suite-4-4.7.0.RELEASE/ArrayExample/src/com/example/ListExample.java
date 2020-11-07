package com.example;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		var s = list.size();
		var sum = 0.0;
		var average =0.0;
		var min =999999999;
		var max = -9999999;
		for (int i = 0; i < s; i++) {
			sum += list.get(i);
			if (min <list.get(i))
			{
		}
		average = sum/list.size();
		System.out.println(average);
		for (int i)
		
	}
}
