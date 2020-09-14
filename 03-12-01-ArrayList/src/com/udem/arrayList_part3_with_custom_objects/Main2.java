package com.udem.arrayList_part3_with_custom_objects;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {

		ArrayList<Student> studentList1 =  new ArrayList<>();
		studentList1.add(new Student("s1", 101));
		studentList1.add(new Student("s2", 102));
		studentList1.add(new Student("s3", 103));
		
		ArrayList<Student> studentList2 =  new ArrayList<>();
		studentList2.add(new Student("s4", 104));
		studentList2.add(new Student("s3", 103));
		studentList2.add(new Student("s6", 106));
		
		System.out.println("--------------- Student List 1  -------------------");
		for (Student student : studentList1) {
			System.out.println(student);
		}

		System.out.println("--------------- Student List 2  -------------------");
		for (Student student : studentList2) {
			System.out.println(student);
		}
		
		studentList1.addAll(studentList2);
		System.out.println("--------------- Student List 1  -------------------");
		for (Student student : studentList1) {
			System.out.println(student);
		}
		
		
		// ajout des méthodes hashCode et equals -- alt+maj+s 
		
//		studentList1.retainAll(studentList2);
//		System.out.println("--------------- Student List 1  -------------------");
//		for (Student student : studentList1) {
//			System.out.println(student);
//		}
		
//		studentList1.removeAll(studentList2);
//		System.out.println("--------------- Student List 1  -------------------");
//		for (Student student : studentList1) {
//			System.out.println(student);
//		}

	}

}
