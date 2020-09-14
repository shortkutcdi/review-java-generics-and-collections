package com.udem.generics;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		Student[] studentArray = new Student[10];
		studentArray[0] = new Student("s1", 101);
		studentArray[1] = new Student("s2", 102);
		// studentArray[2] = new Teacher("t1", 1001); // compile time error
		Student student1 = studentArray[0];
		System.out.println("StudentArray:\t" + student1);
		
		ArrayList list = new ArrayList();
		list.add(new Student("s1", 101));
		list.add(new Student("s2", 102));
		list.add(new Teacher("t1", 1001));
		Student student2 = (Student) list.get(2); // compile time error -> solution type-casting
		System.out.println("list: \t\t" + student2); // runtime exception
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("s1", 101));
		studentList.add(new Student("s2", 102));
		// studentList.add(new Teacher("t1", 1001)); // compile type error
		Student student3 = studentList.get(1);
		System.out.println("studentList: \t" + student3);

	}
}


	

