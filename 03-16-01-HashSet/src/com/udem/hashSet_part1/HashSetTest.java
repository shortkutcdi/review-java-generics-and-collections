package com.udem.hashSet_part1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		// HashSet n'autorise pas les doublons
		// 

		HashSet<String> colorSet = new HashSet<>();
		System.out.println(colorSet.add("Red")); // true
		System.out.println(colorSet.add("Green")); // true
		System.out.println(colorSet.add("Blue")); // true
		System.out.println(colorSet.add("Blue")); // false - existe déjà pas inséré
		
		System.out.println("---------------  display colorSet  --------------------");
		for (String color : colorSet) {
			System.out.println(color);
		}
		
/*		Red
		Blue
		Green*/
		
		HashSet<Student> studentSet = new HashSet<>();
		studentSet.add(new Student("s1", 101));
		studentSet.add(new Student("s3", 103));
		studentSet.add(new Student("s2", 102));
		studentSet.add(new Student("s2", 102));
		studentSet.add(new Student("s2", 102));
		studentSet.add(new Student("s4", 104));

		System.out.println("---------------  using foreach loop  --------------------");
		
		for (Student student : studentSet) {
			System.out.println(student);
		}
		
		// avec equals() dans Student (évite les doublons)
//				Student [name=s1, rollNo=101]
//				Student [name=s2, rollNo=102]
//				Student [name=s3, rollNo=103]
//				Student [name=s4, rollNo=104]		
		
		
		// sans equals() dans Student (garde les doublons)
//			Student [name=s1, rollNo=101]
//			Student [name=s2, rollNo=102]
//			Student [name=s2, rollNo=102]
//			Student [name=s2, rollNo=102]
//			Student [name=s3, rollNo=103]
//			Student [name=s4, rollNo=104]
		
		
		System.out.println("---------------  using iterator (while loop - hasNext)  --------------------");
		
		Iterator<Student> iterator = studentSet.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
		
	}

}
