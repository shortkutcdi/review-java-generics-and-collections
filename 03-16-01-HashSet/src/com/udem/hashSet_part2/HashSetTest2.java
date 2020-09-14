package com.udem.hashSet_part2;

import java.util.HashSet;

import com.udem.hashSet_part1.Student;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		HashSet<Student> studentSet1 = new HashSet<>();
		studentSet1.add(new Student("s1", 101));
		studentSet1.add(new Student("s3", 103));
		studentSet1.add(new Student("s2", 102));
		studentSet1.add(new Student("s4", 104));

		HashSet<Student> studentSet2 = new HashSet<>();
		studentSet2.add(new Student("s3", 103));
		studentSet2.add(new Student("s5", 105));
		studentSet2.add(new Student("s6", 106));
		studentSet2.add(new Student("s7", 107));
		
		System.out.println("---------------  Student Set 1  --------------------");
		for (Student student : studentSet1) {
			System.out.println(student);
		}

		System.out.println("---------------  Student Set 2  --------------------");
		studentSet2.forEach(System.out::println);
		
		studentSet1.addAll(studentSet2);
		System.out.println("---------------  Student Set 1 after addAll() --------------------");
		studentSet1.forEach(System.out::println);
		
		studentSet1.removeAll(studentSet2);
		System.out.println("---------------  Student Set 1 after removeAll() --------------------");
		studentSet1.forEach(System.out::println);
		
		studentSet1.addAll(studentSet2);
		System.out.println("---------------  Student Set 1 after addAll() --------------------");
		studentSet1.forEach(System.out::println);
		
		studentSet1.retainAll(studentSet2);
		System.out.println("---------------  Student Set 1 after retainAll() intersection --------------------");
		studentSet1.forEach(System.out::println);

		
		System.out.println("---------------  contains() --------------------");
		System.out.println(studentSet1.contains(new Student("s3", 103)));

		System.out.println("---------------  containsAll() --------------------");
		System.out.println(studentSet1.containsAll(studentSet2));
		
		
		
		
	}
}
