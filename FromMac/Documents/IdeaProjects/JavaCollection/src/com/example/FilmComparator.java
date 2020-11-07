package com.example;

import java.util.Comparator;

public class FilmComparator implements Comparator<Film> {

	@Override
	public int compare(Film o1, Film o2) {
		// o1 > o2 => 1
		// o1 == o2 => 0
		// o1 < o2 => -1
		return o1.getRate().compareTo(o2.getRate());
	}

}
