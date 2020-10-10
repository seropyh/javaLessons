package com.zoo.animal;

public class Fly extends Animal {
	public Fly() {
		super();
	}

	public Fly(Integer age, String name, String color) {
		super();
		this.age = age;
		this.name = name;
		this.color = color;
	}

	private Integer age;
	private String name;
	private String color;

	public static void canFly() {
		System.out.println("Муха летает");
	}
	public static void canWolk() {
		System.out.println("Муха бегает");
	}
	public void canEat() {
		System.out.println(this.name + ':' + "Жрет");
	}
	public Integer getAge() {
		return age;
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
