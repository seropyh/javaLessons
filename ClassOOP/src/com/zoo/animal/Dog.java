package com.zoo.animal;

public class Dog extends Animal {
	public Dog() {

	}

	public Dog(String name, int age, String breed, String color, boolean isTrained) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.color = color;
		this.isTrained = isTrained;
	}

	public void say() {
		System.out.println(this.name + ':' + "Гав");
	}

	public void canWolk() {
		System.out.println(this.name + ':' + "Идет");
	}

	public static void canJump() {
		System.out.println("Собака прыгает");
	}
	public void canEat() {
		System.out.println(this.name + ':' + "Жрет");
	}

}
