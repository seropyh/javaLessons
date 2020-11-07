package com.javacollection;

public class Box {
private Object value;

public Box(Object value) {
	super();
	this.value = value;
}

public Box() {
	super();
}

public Object getValue() {
	return value;
}

public void setValue(Object value) {
	this.value = value;
}

}
