package com.zoo.animal;

public class Cat {
	private Integer age;
	private String name;
	private String color;

	public Cat() {

	}

	public Cat(Integer age, String name, String color) {
		super();
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
}
