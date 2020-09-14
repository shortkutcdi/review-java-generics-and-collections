# TreeMap

Hierarchy of Map Interface
		
(Interface - I)								Map
						---------------------------------------
						|					|				  |	
(Class -c)			HashMap (c)			SortedMap (i)		HashTable (c)
						|					|				  |	 
				LinkedHashMap (c)	   NavigableMap (i)		Properties (c)
											|
										Treemap (c)	
										
Similar to a HashMap or LinkedHashMap, TreeMap :

- allows duplicated values 
- but not duplicated keys

- all element in TreeMap are stored and sorting by keys in a ascending order 

__It might be necessary to implement Comparable and Comparator classes__