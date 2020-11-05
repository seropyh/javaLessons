package com.example;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
//		var films = new TreeSet<Film>(new FilmComparator());
		
		var film1 = new Film("Аватар", 2009, "фантастика", 4);
		var film2 = new Film("Титаник", 1996, "драма", 5);
		var film3 = new Film("Притяжение", 2018, "фантастика", 1);
		var film4 = new Film("Форсаж", 2000, "боевик", 3);
		
		var filmCollection = new FilmCollection();
		
		filmCollection.getFilms().add(film1);
		filmCollection.getFilms().add(film2);
		filmCollection.getFilms().add(film3);
		filmCollection.getFilms().add(film4);
		
		for (Film f : filmCollection) {
			System.out.println(f);
		}

	}

}
