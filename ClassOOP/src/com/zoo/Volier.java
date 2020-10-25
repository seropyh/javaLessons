package com.zoo;

import java.util.HashSet;

import com.exception.DuplicateAnimalException;
import com.exception.NegativeValueException;
import com.exception.VolierOverflowException;
import com.zoo.animal.Animal;

public class Volier extends HashSet {

	private HashSet<Animal> volier;
	private static int maxCountAnimal = 5;
	private static int count;

	public Volier(HashSet volier) {
		this.volier = volier;

	}

	public Volier() {
		this.volier = new HashSet<Animal>();
	}

	public void addAnimal(Animal animal) throws VolierOverflowException, DuplicateAnimalException {
		count++;
		if (this.getCount() > maxCountAnimal) {
			throw new VolierOverflowException("Ошибка! Вольер переполнен. Сначала удалите зверей из вольера");
		} 
		for (Animal i: volier) {
			if (i.getClass() == animal.getClass()){
				throw new DuplicateAnimalException("Ошибка! Такое животное уже есть в вольере");
			}
		}
			
		
		this.volier.add(animal);
	}

	public void delAnimal(Animal animal) {

		this.volier.remove(animal);
		setCount(getCount() - 1);
	}

	@Override
	public String toString() {
		String result="";
 		for (Animal i : volier) {
			result += i.getName() +'\n';
		}
		return result;

	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Volier.count = count;
	}

}
