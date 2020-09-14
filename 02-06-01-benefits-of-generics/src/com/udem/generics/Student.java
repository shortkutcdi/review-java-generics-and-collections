package com.udem.generics;

public class Student {

	String name;
	Integer rollNo;
	
	public Student(String name, Integer rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	
}
