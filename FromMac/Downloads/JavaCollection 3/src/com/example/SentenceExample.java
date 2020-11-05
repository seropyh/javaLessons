package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SentenceExample {

	public static void main(String[] args) {
		var str = "А Роза упала на лапу Азора";
		var words = str.split(" "); // String[]
		
		var wordList = new ArrayList<Word>();
		for (String word : words) {
			wordList.add(new Word(word));
		}
		
		Collections.sort(wordList);


//		for (int i = 0; i < wordList.size(); i++)
//			System.out.println(wordList.get(i));
		
		var iterator = wordList.iterator();
		while (iterator.hasNext()) {
			var word = iterator.next();
			System.out.println(word);
		}
		
//		for (Word word : wordList) {
//			System.out.println(word);
//		}
	}

}
