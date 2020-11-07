package com.zoo;

import java.util.HashMap;

import com.exception.DuplicateAnimalException;
import com.exception.OverflowVoliersException;
import com.exception.VolierOverflowException;
import com.zoo.animal.Animal;

public class ComplexVolier {
	private HashMap<Integer, Volier> complexVolier;
	private static int countVoliers;
	public ComplexVolier(int parCountVoliers) {

		this.complexVolier = new HashMap();
		countVoliers = parCountVoliers;
		for (int i = 1; i <= countVoliers; i++) {
			complexVolier.put(i, new Volier());

			Volier thisVolier = this.complexVolier.get(i);
		
		}

	}

	public void addAnimal(int numVolier, Animal animal)
			throws OverflowVoliersException, VolierOverflowException, DuplicateAnimalException {

		if (numVolier <= 0 || numVolier > countVoliers) {
			throw new OverflowVoliersException("Такого вольера нет.Номер вольера от 1 до " + countVoliers);
		}
		Volier thisVolier = this.complexVolier.get(numVolier);
		thisVolier.addAnimal(animal);
		System.out.println("В вольер " + numVolier + " Добавлено животное:" + animal.getName());

	}
}
