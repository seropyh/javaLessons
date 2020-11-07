package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.animal.Dog;

public class Zoo {

	public static void main(String[] args) {
		var dog = new Dog();
		var dog1 = new Dog();
		var dog2 = new Dog();
		
		dog.setName("Джон");
		dog.setAge(10);
		dog.setBreed("Хаски");
		dog.setColor("Белая");
		dog.setTrained(true);
		
//		dog.name = "Мяу";
		dog.say();
		System.out.println(dog.getName());
		System.out.println(dog.getName());
		
		System.out.println(Dog.count);
	}

}
