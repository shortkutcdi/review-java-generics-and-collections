package com.udem.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorTest {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList1 = new ArrayList<>();
		studentList1.add(new Student("s3", 103));
		studentList1.add(new Student("s1", 101));
		studentList1.add(new Student("s4", 104));
		
		System.out.println("\n -------------  Before Sorting studentList ------------------");
		studentList1.forEach(System.out::println);
		
		// implements Comparable to Students
		Collections.sort(studentList1, new StudentComparatorAsc());
		// Collections.sort(studentList1, new StudentComparatorAsc().reversed());
		// Collections.sort(studentList1, new StudentComparatorDesc());
		
		System.out.println("\n -------------  after Sorting studentList ------------------");
		studentList1.forEach(System.out::println);
		
	}

}
