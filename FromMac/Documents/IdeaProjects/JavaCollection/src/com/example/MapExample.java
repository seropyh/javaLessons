package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args) {
		var map = new HashMap<Character, Integer>();
		
		var scanner = new Scanner(System.in);
		var word = scanner.nextLine();
		
		for (int i = 0;i < word.length(); i++) {
			if (!map.containsKey(word.charAt(i))) {
				map.put(word.charAt(i), 1);
			}
			else {
				var value = map.get(word.charAt(i));
				map.put(word.charAt(i), value+1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
