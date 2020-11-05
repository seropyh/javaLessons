package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
//		var map = new HashMap<String, ArrayList<String>>();
//		map.put("test", (ArrayList<String>) Arrays.asList("Тестировать"));
//		map.put("add", (ArrayList<String>) Arrays.asList("Добавлять", ""));
		
		var map = new LinkedHashMap<String, String>();
		map.put("test", "test1");
		map.put("test1", "test1");
		map.put("test2", "test1");
		
		map.remove("test1");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		
		
		System.out.println("===========");
		
		var hmap = new HashMap<String, String>();
		hmap.put("test", "test1");
		hmap.put("test1", "test1");
		hmap.put("test2", "test1");
		
		for (Map.Entry<String, String> entry : hmap.entrySet()) {
			System.out.println(entry);
		}
	}

}
