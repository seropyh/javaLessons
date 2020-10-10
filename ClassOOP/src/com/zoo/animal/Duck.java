package com.zoo.animal;

public class Duck extends Animal{
	public Duck() {
		
	}

	public Duck(Integer age, String name, String color) {
		
		this.age = age;
		this.name = name;
		this.color = color;
	}

	private Integer age;
	private String name;
	private String color;

	public static void canSweem() {
		System.out.println("Утка плавает");
	}

	public static void canFly() {
		System.out.println("Утка летает");
	}

	public static void canWolk() {
		System.out.println("Утка ходит");
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
