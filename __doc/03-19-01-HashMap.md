# HashMap

HashMap  implements Map interface

- store data in key-value pairs
- insertion order is not maintain 
- allow duplicated values, but does not duplicate keys
- order keys

	all keys in a HashMap will be unique
	
Example iteration over a HashMap

````java	
HashMap<Integer, String> colorMap = new HashMap<>();


// 4 Entry Sets
colorMap.put(1, "Red");
colorMap.put(2, "Green");
colorMap.put(3, "Blue");
colorMap.put(3, "White"); // duplicated key
colorMap.put(4, "Yellow");

System.out.println("---------------  using foreach loop (HashMap) --------------------");

for (Map.Entry<Integer, String> entry	: colorMap.entrySet()) {
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
````	
