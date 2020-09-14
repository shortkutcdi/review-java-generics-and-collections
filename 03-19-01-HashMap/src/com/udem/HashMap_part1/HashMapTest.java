package com.udem.HashMap_part1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> colorMap = new HashMap<>();
		
/*		System.out.println(colorMap.put(1, "Red"));		// null
		System.out.println(colorMap.put(2, "Green"));	// null
		System.out.println(colorMap.put(3, "Blue"));	// null
		System.out.println(colorMap.put(3, "White"));   // blue     --duplicated key
		System.out.println(colorMap.put(4, "Yellow"));	// null
*/		
		// 4 Entry Sets
		colorMap.put(1, "Red");
		colorMap.put(2, "Green");
		colorMap.put(3, "Blue");
		colorMap.put(3, "White"); // duplicated key (last replace precedent)
		colorMap.put(4, "Yellow");
		
		System.out.println("---------------  using for-each loop (HashMap) --------------------");
		
		for (Map.Entry<Integer, String> entry : colorMap.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}	
		
		System.out.println("---------------  using iterator (HashMap) --------------------");
		
		Iterator<Map.Entry<Integer, String>> iterator = colorMap.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry =  iterator.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		// lambda expression
		System.out.println("---------------  using foreach method (HashMap) --------------------");
		colorMap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v ) );
		

		System.out.println("---------------  iterating over Keys (HashMap) --------------------");
		
		for (Integer key : colorMap.keySet()) {
			System.out.println("Key = " + key);
		}

		
		System.out.println("---------------  iterating over Values (HashMap) --------------------");
		
		for (String value : colorMap.values()) {
			System.out.println("Key = " + value);
		}
		
		
	}
}
