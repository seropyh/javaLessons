package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class FilmCollection implements Iterable<FIlm> {
	private ArrayList<FIlm> films;

	public FilmCollection(ArrayList<FIlm> films) {

		this.films = films;
	}
	public FilmCollection() {

		this.films = new ArrayList<FIlm>();
	}
	public ArrayList<FIlm> getFilms() {
		return films;
	}

	public void setFilms(ArrayList<FIlm> films) {
		this.films = films;
	}

	public FilmCollection() {
		this.films = new ArrayList<FIlm>();
	}

	@Override
	public Iterator<FIlm> iterator() {
		// TODO Auto-generated method stub

		return null;
	}

	class FilmIterator implements Iterator<FIlm> {
		private int pos = 0;

	@Override
	public boolean hasNext() {
		while (pos< films.size()) {
			if (films.get(pos).getPublish() >2000)
				break;
			else  pos++;
		}
		return pos< films.size();
	}

		@Override
		public FIlm next() {
			// TODO Auto-generated method stub
			return films.get(pos++);
		}

	}
}
