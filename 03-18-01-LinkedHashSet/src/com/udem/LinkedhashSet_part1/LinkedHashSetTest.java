package com.udem.LinkedhashSet_part1;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		// insertion order is not maintain   --- without duplicate insertion
		HashSet<Student> studentSet1 = new HashSet<>();
		studentSet1.add(new Student("s1", 101));
		studentSet1.add(new Student("s3", 103));
		studentSet1.add(new Student("s3", 103));
		studentSet1.add(new Student("s2", 102));
		studentSet1.add(new Student("s4", 104));
		
		// insertion order is maintain      --- without duplicate insertion
		LinkedHashSet<Student> studentSet2 = new LinkedHashSet<>();
		studentSet2.add(new Student("s1", 101));
		studentSet2.add(new Student("s3", 103));
		studentSet2.add(new Student("s3", 103));
		studentSet2.add(new Student("s2", 102));
		studentSet2.add(new Student("s4", 104));
		studentSet2.add(new Student("s4", 104));
		
		System.out.println("---------------  Student Set 1 (HashSet) --------------------");
		studentSet1.forEach(System.out::println);
		
		System.out.println("---------------  Student Set 2 (LinkedHashSet)  --------------------");
		studentSet2.forEach(System.out::println);

	}

}
