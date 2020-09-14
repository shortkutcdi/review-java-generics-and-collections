# benefits of generics

- provides Type-safety
- eliminates the need for Type-casting

## Type-safety

````java
Integer arr[] = new Integer[10];
arr[0] = 9;
arr[1] = 12;
arr[2] = "Abhay"; // Compile time error 

ArrayList list = new ArrayList();
list.add(10);
list.add(7);
list.add("Abhay");
list.add(true);
````	

## Type casting

````java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(10); 	
list.add(7); 	
list.add("Abhay"); // compile timer error 	
list.add(true); 	 // compile timer error 	

Integer arr[] = new Integer[10];
arr[0] = 9;
int v = arr[0];

ArrayList list = new ArraList();
list.add(10);
int v = lis.get(0); // compile time error
int v = (Integer)list.get(0); // need to type-casting

ArrayList<Integer> list = new ArrayList<>(); // define here the type of the array "list"
list.add(0);
int v1 = list.get(0);  // no need to type-casting
````	