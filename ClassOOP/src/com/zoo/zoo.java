package com.zoo;

import com.exception.NegativeValueException;
import com.zoo.animal.Animal;
import com.zoo.animal.Cat;
import com.zoo.animal.Dog;

public class zoo {

	// private static final int CONSTANT = 1;

	public static void main(String[] args) {

		var dog = new Dog("Джон", 10, "Хаски", "Белая", true);
		/*
		 * dog.setName("Джон"); dog.setAge(10); dog.setBreed("Хаски");
		 * dog.setColor("Белая"); dog.setTrained(true);
		 */
//		dog.name = "Мяу";
		dog.say();
		System.out.println(dog.getName());
		// dog.setName("Джон");
		System.out.println(dog.getName());
		try {
		/*	var z = 5 / 0;
			Object r = null;
			r.getClass();
		*/
			throw new NegativeValueException("Привет");
			} 
		catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
//			System.exit(0);
		}
		catch (NegativeValueException ex) {
				System.out.println(ex.getMessage());
//				System.exit(0);
		}
		catch (NullPointerException ex) {
				System.out.println(ex.getMessage());
		}
		finally {
			System.out.println ("finally");
		}
		/*
		 * var cat = new Cat(); cat.setName("Ящик"); cat.setAge(3);
		 * cat.setColor("black"); System.out.println(cat.getName());
		 * System.out.println(cat.getAge()); System.out.println(cat.getColor());
		 */

	}

}
