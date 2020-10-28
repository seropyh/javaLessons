package com.zoo;

import com.exception.DuplicateAnimalException;
import com.exception.NegativeValueException;
import com.exception.OverflowVoliersException;
import com.exception.VolierOverflowException;
import com.zoo.animal.Animal;
import com.zoo.animal.Cat;
import com.zoo.animal.Dog;
import com.zoo.animal.Duck;
import com.zoo.animal.Eagle;
import com.zoo.animal.Elephant;
import com.zoo.animal.Monkey;

public class zoo {

	public static void main(String[] args)
			throws VolierOverflowException, DuplicateAnimalException, OverflowVoliersException {

		/* создаем животных */
		var dog = new Dog("Джон", 10, "Хаски", "Белая", true);
		var duck = new Duck(10, "Утка", "Белая");
		var cat = new Cat(10, "Кошка", "Серая");
		var eagle = new Eagle(10, "Белый", "Орел");
		var elephant = new Elephant(10, "Слон", "Синий");
		var monkey = new Monkey(10, "Горилла", "Черный");
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
		// volier.addAnimal(monkey); // Раскомментируй для теста исключения переполнения
		// вольера
		System.out.println(volier.getCount()); // Печатаем количество зверей в вольере
		System.out.println(volier); // Печатаем содержимое вольера
		volier.delAnimal(dog); // Забираем из вольера собаку
		System.out.println(volier.getCount());
		System.out.println(volier);

		// Определяем множество вольеров.
		var complexVolier = new ComplexVolier(3); // В конструкторе передаем количество вольеров

		complexVolier.addAnimal(1, dog);
		// complexVolier.addAnimal(1,dog); // Раскомментируй для теста исключения дублей
		// видов
		complexVolier.addAnimal(1, cat);
		complexVolier.addAnimal(1, duck);
		complexVolier.addAnimal(1, eagle);
		complexVolier.addAnimal(1, elephant);
		// complexVolier.addAnimal(1,monkey); // Раскомментируй для теста исключения
		// переполнения

		// complexVolier.addAnimal(0, eagle); // Раскомментируй для теста исключения
		// несуществующего вольера

		// complexVolier.addAnimal(-1, eagle); // Раскомментируй для теста исключения
		// несуществующего вольера

		// complexVolier.addAnimal(4, eagle); // Раскомментируй для теста исключения
		// несуществующего вольера

		complexVolier.addAnimal(2, eagle);
		complexVolier.addAnimal(2, elephant);
	}

}
