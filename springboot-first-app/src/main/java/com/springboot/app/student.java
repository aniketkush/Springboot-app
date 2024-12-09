package com.springboot.app;

public class student {
private String fristName;
private String lastName;
public String getFristName() {
	return fristName;
}
public void setFristName(String fristName) {
	this.fristName = fristName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public student(String fristName, String lastName) {
	super();
	this.fristName = fristName;
	this.lastName = lastName;
}
}
