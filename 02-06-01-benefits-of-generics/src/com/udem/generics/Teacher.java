package com.udem.generics;

/**
 * @author fernand
 *
 */
public class Teacher {

	String name;
	Integer teacherId;
	public Teacher(String name, Integer teacherId) {
		super();
		this.name = name;
		this.teacherId = teacherId;
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", teacherId=" + teacherId + "]";
	}
}
