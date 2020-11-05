package com.javacollection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapClass {
	public static void main(String[] args) {

	var hp = new HashMap<Character, Integer>();
	var sc = new Scanner(System.in);
	var str=sc.nextLine();
	//System.out.println(i);
	for(int i =0; i<str.length();i++) {
	
	if (!hp.containsKey(str.charAt(i)){
		hp.put(str.charAt(i),1);
		
	}
	else {
		var value = hp.get(str.charAt(i));
		hp.put(str.charAt(i),value+1);
	}
	
	}
//	for (Map.Entry<Character, Integer>, hp.entrySet)
	{
		
		
	}
	
	}
	}
