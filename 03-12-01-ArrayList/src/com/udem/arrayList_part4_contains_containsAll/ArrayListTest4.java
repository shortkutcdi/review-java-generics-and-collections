package com.udem.arrayList_part4_contains_containsAll;

import java.util.ArrayList;

import com.udem.arrayList_part3_with_custom_objects.Student;

public class ArrayListTest4 {

	public static void main(String[] args) {
		ArrayList<Student> studentList1 =  new ArrayList<>();
		studentList1.add(new Student("s1", 101));
		studentList1.add(new Student("s2", 102));
		studentList1.add(new Student("s3", 103));
		
		ArrayList<Student> studentList2 =  new ArrayList<>();
		studentList2.add(new Student("s1", 101));
		studentList2.add(new Student("s3", 103));
		studentList2.add(new Student("s2", 102));
/*		studentList2.add(new Student("s4", 104));
		studentList2.add(new Student("s3", 103));
		studentList2.add(new Student("s6", 106));
*/		
		System.out.println("--------------- Student List 1  -------------------");
		for (Student student : studentList1) {
			System.out.println(student);
		}

		System.out.println("--------------- Student List 2  -------------------");
		for (Student student : studentList2) {
			System.out.println(student);
		}

		// ajouter equals (et hashcode) à Student
		System.out.println("--------------- contains() -------------------");
		System.out.println(studentList1.contains(new Student("s3", 103))); // true
		System.out.println(studentList1.contains(new Student("s8", 108))); // false
		
		System.out.println("--------------- containsAll() -------------------");
		System.out.println(studentList1.containsAll(studentList2)); // false
		
		studentList1.addAll(studentList2);
		System.out.println(studentList1.containsAll(studentList2)); // true
		
	}

}
