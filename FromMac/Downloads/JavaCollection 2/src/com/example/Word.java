package com.example;

public class Word implements Comparable<Word> {
	
	private String word;
	
	
	public Word() {
		
	}

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return word;
	}

	@Override
	public int compareTo(Word o) {
		Integer length1 = this.word.length();
		Integer length2 = o.word.length();
		return length1.compareTo(length2);
	}
	

}
