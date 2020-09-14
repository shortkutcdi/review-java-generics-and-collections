package com.udem.HashMap_part1;

import java.util.HashMap;
import java.util.Map;


public class HashMapTest2 {

	public static void main(String[] args) {
		
//		- store data in key-value pairs
//		- insertion order is not maintain 
//		- allow duplicated values, but does not duplicate keys
//		- order keys

		HashMap<Integer, Student> studentMap1 = new HashMap<>();
		studentMap1.put(2, new Student("s2", 102));
		studentMap1.put(1, new Student("s1", 101));
		studentMap1.put(3, new Student("s3", 103));

		HashMap<Integer, Student> studentMap2 = new HashMap<>();
		studentMap2.put(4, new Student("s4", 102));
		studentMap2.put(3, new Student("s3", 1033));
		studentMap2.put(5, new Student("s5", 105));
		
		System.out.println("\n ---------------- Student Map 1  ----------------------");
		for (Map.Entry<Integer, Student> entry : studentMap1.entrySet()) 
		{
			System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		System.out.println("\n ---------------- Student Map 2  ----------------------");
		for (Map.Entry<Integer, Student> entry : studentMap2.entrySet()) 
		{
			System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		studentMap1.putAll(studentMap2);
		
		System.out.println("\n ---------------- Student Map 1 after  studentMap1.putAll(studentMap2)   ----------------------");
		for (Map.Entry<Integer, Student> entry : studentMap1.entrySet()) 
		{
			System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		System.out.println("\n ---------------- containsKey  ----------------------");
		System.out.println(studentMap1.containsKey(5)); // true
		System.out.println(studentMap1.containsKey(15)); // false
		
		System.out.println("\n ---------------- containsValue  ----------------------");
		System.out.println( studentMap1.containsValue(new Student("s4", 102)) ); // true
		System.out.println( studentMap1.containsValue(new Student("s3", 103)) ); // false
	}

}
