package com.zoo.animal;

public class Fly extends Animal implements canFly{
	public Fly() {

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

	public void canWolk() {
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
