package com.udem.arrayList_part2_methods;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {

		ArrayList<String> colorList = new ArrayList<>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Yellow");
		
		ArrayList<String> colorList2 = new ArrayList<>();
		colorList2.add("Purple");
		colorList2.add("White");
		colorList2.add("Blue");
		colorList2.add("Pink");

		System.out.println("\n------------- Color List 1  -------------");		
		for (String color : colorList) {
			System.out.println(color);
		}
		
		System.out.println("\n------------- Color List 2  -------------");		
		for (String color : colorList2) {
			System.out.println(color);
		}
		
		System.out.println("\n------------- add colorList 2 to Color List 1 after addAll(list2)  -------------");		
		// add colorList2 to colorList
		colorList.addAll(colorList2);
		for (String color : colorList) {
			System.out.println(color);
		}
		
		colorList.removeAll(colorList2);
		System.out.println("\n------------- Color List 1 after removeAll(list2)  -------------");	
		for (String color : colorList) {
			System.out.println(color);
		}
		
		System.out.println("\n------------- add colorList 2 to Color List 1 after addAll(list2)  -------------");		
		// add colorList2 to colorList
		colorList.addAll(colorList2);
		for (String color : colorList) {
			System.out.println(color);
		}
		
		
		System.out.println("\n------------- Color List 1 after retainAll(list2)  -------------");	
		colorList.retainAll(colorList2);
		for (String color : colorList) {
			System.out.println(color);
		}
		
		System.out.println(colorList.contains("Blue")); // true

		System.out.println(colorList.containsAll(colorList2)); // true
		
		colorList.clear();
		
		System.out.println(colorList.isEmpty()? "yes list is empty": "list is not empty");
		
		
		
		
		
	}

}
