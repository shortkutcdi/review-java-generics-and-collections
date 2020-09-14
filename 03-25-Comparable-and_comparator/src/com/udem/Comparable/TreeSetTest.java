package com.udem.Comparable;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<Integer> inSet = new TreeSet<>();
		inSet.add(8);
		inSet.add(3);
		inSet.add(9);
		inSet.add(1);
		
		System.out.println("\n---------- Integer TreeSet  (data are sorted in a descending order)------------------");
		inSet.forEach(System.out::println);
		
		TreeSet<String> strSet = new TreeSet<>();
		
		strSet.add("x");
		strSet.add("a");
		strSet.add("b"); // ASCII code is 98
		strSet.add("y"); // ASCII code is 66
		strSet.add("B");
		
		System.out.println("\n---------- Character TreeSet  (data are sorted in a descending order)------------------");
		strSet.forEach(System.out::println);
		
		TreeSet<Student> studentSet = new TreeSet<>();
		studentSet.add(new Student("s2", 102));
		studentSet.add(new Student("s1", 101));
		studentSet.add(new Student("s3", 103));
		studentSet.add(new Student("s4", 104));

		System.out.println("\n---------- Student TreeSet  (data are sorted in a descending order) -----------");
		studentSet.forEach(System.out::println);  // ClassCastException: Student cannot be cast to java.lang.Comparable
	}											  // implementing Comparable<Student> and @Overriding comparableTo(Student student)	

}
