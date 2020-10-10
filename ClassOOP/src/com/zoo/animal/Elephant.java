package com.zoo.animal;

public class Elephant extends Animal{
	public Elephant() {
		super();
	}

	public Elephant(Integer age, String name, String color) {
		super();
		this.age = age;
		this.name = name;
		this.color = color;
	}

	private Integer age;
	private String name;
	private String color;

	public static void canTrumpet() {
		System.out.println("Слон Трубит");
	}

	public Integer getAge() {
		return age;
	}
	public void canWolk() {
		System.out.println(this.name + ':' + "Идет");
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void canEat() {
		System.out.println(this.name + ':' + "Жрет");
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
