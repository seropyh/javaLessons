package com.zoo.animal;

public class Eagle extends Animal {

	public Eagle() {
		super();
	}

	public Eagle(Integer age, String name, String color) {
		super();
		this.age = age;
		this.name = name;
		this.color = color;
	}

	public static void canFly() {
		System.out.println("Орел летает");
	}

	public void canEat() {
		System.out.println(this.name + ':' + "Жрет");
	}
	public void canWolk() {
		System.out.println(this.name + ':' + "Идет");
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

	private Integer age;
	private String name;
	private String color;

}
