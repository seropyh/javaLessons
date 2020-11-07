package com.zoo.animal;

public class Dog extends Animal {
	
	private static int count;
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Dog.count = count;
	}

	public Dog() {
		count++;
	}
	
	
	
	public Dog(String name, int age, String breed, String color, boolean isTrained) {
		super();
		this.age = age;
		this.breed = breed;
		this.isTrained = isTrained;
		this.color = color;
		count++;
	}
	
	public void say() {
		System.out.println(this.name + ":Гав");
	}
}
