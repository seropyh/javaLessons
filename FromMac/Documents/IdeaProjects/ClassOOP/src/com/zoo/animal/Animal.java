package com.zoo.animal;

public abstract class Animal {
	protected String name;
	protected Integer age;
	protected String color;
	protected String breed;
	protected boolean isTrained;

	public abstract String getColor();

	public abstract void setColor();

	public abstract String getBreed();

	public abstract void setBreed(String breed);

	public abstract boolean isTrained();

	public abstract void setTrained(boolean isTrained);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract Integer getAge();

	public abstract void setAge(int age);

	public abstract void say();

	public String getColor1() {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract void canWolk();

	public abstract void canEat();

}
