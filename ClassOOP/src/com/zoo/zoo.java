package com.zoo;

import com.exception.DuplicateAnimalException;
import com.exception.NegativeValueException;
import com.exception.VolierOverflowException;
import com.zoo.animal.Animal;
import com.zoo.animal.Cat;
import com.zoo.animal.Dog;
import com.zoo.animal.Duck;
import com.zoo.animal.Eagle;
import com.zoo.animal.Elephant;
import com.zoo.animal.Monkey;

public class zoo {

	// private static final int CONSTANT = 1;

	public static void main(String[] args) throws VolierOverflowException, DuplicateAnimalException {

		/* Добавляю собаку */
		var dog = new Dog("Джон", 10, "Хаски", "Белая", true);
		/* Добавляю утку */
		var duck = new Duck(10, "Утка", "Белая");
		/* Добавляю кошку */
		var cat = new Cat(10, "Кошка", "Серая");
		/* Добавляю кошку */
		var eagle = new Eagle(10, "Белый", "Орел");
		var elephant = new Elephant(10, "Слон", "Синий");
		var monkey = new Monkey(10, "Горилла", "Черный"); // Раскомментируй для теста переполнения вольера
		/* Определяем вольер */
		var volier = new Volier();
		/* Добавляем животных в вольер */
		volier.addAnimal(dog);
		volier.addAnimal(duck);
		// volier.addAnimal(dog); // Раскомментируй для теста исключения дублей видов
		// зверей
		volier.addAnimal(cat);
		volier.addAnimal(eagle);
		volier.addAnimal(elephant);
		// volier.addAnimal(monkey); // Раскомментируй для теста исключения переполнения вольера

		

		System.out.println(volier.getCount()); // Печатаем количество зверей в вольере
		System.out.println(volier); // Печатаем содержимое вольера
		volier.delAnimal(dog); // Забираем из вольера собаку
		System.out.println(volier.getCount()); 
		System.out.println(volier);
	}	

}
