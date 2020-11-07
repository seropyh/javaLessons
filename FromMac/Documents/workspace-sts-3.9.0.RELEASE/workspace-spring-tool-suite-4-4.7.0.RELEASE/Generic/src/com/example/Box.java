package com.example;

public class Box<T> {
	private T value;

	public Box(T value) {
		super();
		this.value = value;
	}

	public Box() {
		super();
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
