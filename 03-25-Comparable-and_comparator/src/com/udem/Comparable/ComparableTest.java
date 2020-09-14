package com.udem.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparableTest {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(3);
		intList.add(1);
		intList.add(4);
		intList.add(2);
		
		System.out.println("\n -------------  Before Sorting  ------------------");
		intList.forEach(System.out::println);
		
		// sorting the "intLis" ArrayList
		Collections.sort(intList);
		System.out.println("\n -------------  After Sorting  ------------------");
		intList.forEach(System.out::println);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Red");
		strList.add("Blue");
		strList.add("Green");
		strList.add("Yellow");
		
		System.out.println("\n -------------  Before Sorting  ------------------");
		strList.forEach(System.out::println);
		
		Collections.sort(strList, Comparator.reverseOrder());
		System.out.println("\n -------------  After Sorting  ------------------");
		strList.forEach(System.out::println);
		
		ArrayList<Student> studentList1 = new ArrayList<>();
		studentList1.add(new Student("s3", 103));
		studentList1.add(new Student("s1", 101));
		studentList1.add(new Student("s4", 104));
		
		System.out.println("\n -------------  Before Sorting studentList ------------------");
		studentList1.forEach(System.out::println);
		
		// implements Comparable to Students
		Collections.sort((List<Student>) studentList1);
		// Collections.sort((List<Student>) studentList1, Comparator.reverseOrder());
		
		System.out.println("\n -------------  after Sorting studentList ------------------");
		studentList1.forEach(System.out::println);
		
		
		
	}

}
