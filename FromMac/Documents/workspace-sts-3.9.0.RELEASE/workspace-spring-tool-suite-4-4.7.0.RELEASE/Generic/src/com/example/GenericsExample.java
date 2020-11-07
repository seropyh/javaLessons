package com.example;

import java.util.ArrayList;

public class GenericsExample {
	public static int sum(ArrayList<Integer> array ) {
		var sum =0;
		for (int i=0; i<array.size();i++) {
			sum += array.get(i).intValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
	ArrayList array = new ArrayList();
	array.add(10);
	array.add(12);
	array.add(14);
	var sum =0;
	for (int i=0; i<array.size();i++)
	{
		if(array.get(i) instanceof Integer)
			sum+=(int) array.get(i);
			
	}
	System.out.println(sum);	
	
	var box = new Box<Integer>();
	box.setValue(7);
	var value =box.getValue();
	System.out.println(value+5);

}
}