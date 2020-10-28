package com.zoo;

import java.util.HashSet;

import com.exception.DuplicateAnimalException;
import com.exception.NegativeValueException;
import com.exception.VolierOverflowException;
import com.zoo.animal.Animal;

public class Volier {

	private HashSet<Animal> volier;
	private  int maxCountAnimal = 5;
	private  int count; 
	
	public Volier(HashSet volier) {
		this.volier = volier;

	}

	public Volier() {
		this.volier = new HashSet<Animal>();
	}

	public void addAnimal(Animal animal) throws VolierOverflowException, DuplicateAnimalException {
		this.count++;
		if (this.count > maxCountAnimal) {
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
		this.count--;;
	}

	@Override
	public String toString() {
		String result="";
 		for (Animal i : volier) {
			result += i.getName() +'\n';
		}
		return result;

	}

	public  int getCount() {
		return count;
	}

	

}
