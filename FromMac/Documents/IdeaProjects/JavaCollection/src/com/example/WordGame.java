package com.example;

import java.util.HashSet;
import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		var word = scanner.nextLine();

		var set = new HashSet<Character>();
		for (int i = 0; i < word.length(); i++) {
			set.add(word.charAt(i));
		}
	}

}
