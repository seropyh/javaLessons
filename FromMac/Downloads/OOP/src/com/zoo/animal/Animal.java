package com.zoo.animal;

public class Animal {
	
	protected String name;
	protected int age;
	protected String color;
	protected String breed;
	protected boolean isTrained;
	
	public Animal() {
		super();
	}
	
	
	
	public Animal(String name, int age, String color, String breed, boolean isTrained) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.breed = breed;
		this.isTrained = isTrained;
	}



	public Animal(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isTrained() {
		return isTrained;
	}

	public void setTrained(boolean isTrained) {
		this.isTrained = isTrained;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void say() {
		System.out.println("Я животное");
	}

}
