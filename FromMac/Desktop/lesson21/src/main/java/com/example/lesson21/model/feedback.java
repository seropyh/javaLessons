package com.example.lesson21.model;

public class feedback {
private String status;
private String message;
	
public feedback() {}

@Override
public String toString() {
	return "feedback [status=" + status + ", message=" + message + "]";
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public feedback(String status, String message) {
	super();
	this.status = status;
	this.message = message;
}



}
