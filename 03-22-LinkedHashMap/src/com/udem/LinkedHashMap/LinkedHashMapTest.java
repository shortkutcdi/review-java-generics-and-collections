package com.udem.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> studentMap1 = new HashMap<>();
		studentMap1.put(4, new Student("s4", 102));
		studentMap1.put(2, new Student("s2", 102));
		studentMap1.put(1, new Student("s1", 101));
		studentMap1.put(3, new Student("s3", 103));
		
		LinkedHashMap<Integer, Student> studentMap2 = new LinkedHashMap<>();
		studentMap2.put(4, new Student("s4", 102));
		studentMap2.put(2, new Student("s2", 102));
		studentMap2.put(1, new Student("s1", 101));
		studentMap2.put(3, new Student("s3", 103));
		
		System.out.println("\n -------------- Student Map 1  (HashMap) -------------------");
		// insertion order is not maintain
		for (Map.Entry<Integer, Student> entry : studentMap1.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
		}

		System.out.println("\n -------------- Student Map 2  (LinkedHashMap) -------------------");
		// insertion order is maintain
		for (Map.Entry<Integer, Student> entry : studentMap2.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
		}
	}

}
