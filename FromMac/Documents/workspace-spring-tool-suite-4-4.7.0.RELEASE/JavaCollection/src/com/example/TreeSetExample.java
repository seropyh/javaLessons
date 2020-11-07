package com.example;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		var films = new TreeSet<FIlm>();

		var film1 = new FIlm("Аватар", 2009, "фантастика", 4);
		var film2 = new FIlm("Титаник", 1996, "драма", 5);
		var film3 = new FIlm("Притяжение", 2018, "фантастика", 1);
		var film4 = new FIlm("Форсаж", 2000, "боевик", 3);
		films.add(film1);
		var filmCollection = new FilmCollection();
		filmCollection.getFilms().add(film1);
		filmCollection.getFilms().add(film2);
		filmCollection.getFilms().add(film3);
		filmCollection.getFilms().add(film4);
		films.add(film2);
		films.add(film3);
		films.add(film4);
		for (FIlm f : films)
			System.out.println(f);

		for (FIlm f : filmCollection)
			System.out.println(f);
	}
}
