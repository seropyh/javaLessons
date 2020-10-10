package com.zoo.animal;

public class Monkey extends Animal {
	private Integer age;
	private String name;
	private String color;

	public static void canJump() {
		System.out.println("Обезьяна прыгает");
	}
	public static void canWolk() {
		System.out.println("Обезьяна бегает");
	}
	public Integer getAge() {
		return age;
	}
	public void canEat() {
		System.out.println(this.name + ':' + "Жрет");
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
