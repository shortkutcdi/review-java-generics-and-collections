package com.udem.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMap<Integer, String> intMap = new TreeMap<>();
		intMap.put(8,  "str8");
		intMap.put(3,  "str3");
		intMap.put(9,  "str9");
		intMap.put(1,  "str1");
		
		System.out.println("\n -----------  TreeMap 1 ( key ordered ascending )  ----------------"); 
		for (Map.Entry<Integer, String> entry : intMap.entrySet()) {
			System.out.println("Key = "+ entry.getKey() + ", value = " + entry.getValue());
		}
		
		TreeMap<String, String> strMap = new TreeMap<>();
		strMap.put("x", "stra");
		strMap.put("a", "stra");
		strMap.put("b", "strb");
		strMap.put("B", "strB");
		strMap.put("y", "stry");
		
		
		System.out.println("\n -----------  TreeMap 2 ( key ordered ascending )  ----------------"); 
		for (Map.Entry<String, String> entry : strMap.entrySet()) {
			System.out.println("Key = "+ entry.getKey() + ", value = " + entry.getValue());
		}

		
		TreeMap<Student, String> studentMap = new TreeMap<>(new StudentComparatorDesc());
		studentMap.put(new Student("s2", 102), "Student 2");
		studentMap.put(new Student("s1", 101), "Student 1");
		studentMap.put(new Student("s3", 103), "Student 3");
		studentMap.put(new Student("s4", 104), "Student 4");
		
		
		System.out.println("\n -----------  TreeMap 3 ( key ordered ascending )  ----------------"); 
		for (Map.Entry<Student, String> entry : studentMap.entrySet()) {
			System.out.println("Key = "+ entry.getKey() + ", value = " + entry.getValue()); // ClassCastException: Student cannot be cast to java.lang.Comparable
		}

	}

}
