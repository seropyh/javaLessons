package com.zoo.animal;

public class Dog extends Animal implements say,canJump {
	public Dog() {

	}

	public Dog(String name, int age, String breed, String color, boolean isTrained) {
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

	@Override
	public String getColor1() {
		return breed;
		// TODO Auto-generated method stub

	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getBreed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBreed(String breed) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isTrained() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTrained(boolean isTrained) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
