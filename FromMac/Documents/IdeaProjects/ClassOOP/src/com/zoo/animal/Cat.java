package com.zoo.animal;

public class Cat extends Animal implements canJump {

	public Cat() {

	}

	public Cat(Integer age, String name, String color) {
		this.age = age;
		this.name = name;
		this.color = color;
	}

	public void canWolk() {
		System.out.println(this.name + ':' + "Идет");
	}

	public void canEat() {
		System.out.println(this.name + ':' + "Жрет");
	}

	public void canJump() {
		System.out.println(this.name + ':' + "Прыгает");
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
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
	public void setAge(int age) {
		// TODO Auto-generated method stub

	}

	@Override
	public void say() {
		// TODO Auto-generated method stub

	}
}
