package com.udem.arrayList_part1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> colorList = new ArrayList<>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Yellow");
		
		System.out.println("\n------------- Using For-Each loop  -------------");
		
		for (String color : colorList) {
			System.out.println(color);
		}
		
		
		System.out.println("\n------------- Using Iterator  -------------");
		
		Iterator<String> iterator = colorList.iterator();
		
		while (iterator.hasNext()) {
			System.out.println((String) iterator.next());			
		}
		
		
		System.out.println("\n------------- Using For loop  -------------");
		
		for (int i = 0; i < colorList.size(); i++) {
			System.out.println(colorList.get(i));
		}
		
		
		
	}

}
