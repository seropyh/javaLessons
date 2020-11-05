package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import com.example.FIlm;
import com.array.Word;
public class Mycomparableexec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var myString = "Это мо предложение для сортировки по123 буквам";

		var wordColl = new TreeSet<Word>();
		var  words =  myString.split(" ");
		
		var wc = new ArrayList <Word>();
		for(String word:words) {
			wc.add(new Word(word));
		}
			Collections.sort(wc);
			for (Word word:wc ) {
			System.out.println(word);
			}
			
		
}

}
