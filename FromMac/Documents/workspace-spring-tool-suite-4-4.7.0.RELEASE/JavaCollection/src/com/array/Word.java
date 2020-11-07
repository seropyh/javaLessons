
package com.array;

import java.util.Comparator;

import com.example.FIlm;

public class Word implements Comparable<Word> {
	private String myWord;
	private Integer leng;

	public Word(String myWord) {
		super();
		this.myWord = myWord;
	
	}

	public Word() {
		super();
	}

	public String getMyWord() {
		return myWord;
	}

	public void setMyWord(String myWord) {
		this.myWord = myWord;
	}

	public int getLeng() {
		return leng;
	}

	public void setLeng(int leng) {
		this.leng = leng;
	}

	@Override
	public String toString() {
		return "Word [myWord=" + myWord + ", leng=" + leng + "]";
	}

	@Override
	public int compareTo(Word o) {
		// TODO Auto-generated method stub
		Integer lehgth1 = this.myWord.length();
		Integer lehgth2 = o.myWord.length();
		return lehgth1.compareTo(lehgth2);
	}

	
}
