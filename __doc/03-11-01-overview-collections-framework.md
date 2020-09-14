# overview collections framework

	(Interfaces)				Iterable
									|
	(Interfaces)				Collection
									|
							-------------------------------------------------------------			
							|				 	      |				  					|
	(Interfaces)  	  	  List     				     Set							  Queue
					------------------------	  --------------						-		
					|			|			|	  |				|						|
	(Class)		ArrayList	LinkedList	Vector	HashSet		SortedSet(interface)	PriorityQueue
										|	      |				|
									Stack  LinkedHashSet  NavigableSet(Interface) 
																|
															TreeSet (class)
								   						 
								   						 
Hierarchy of Map Interface
		
	(Interface - I)								Map
							---------------------------------------
							|					|				  |	
	(Class -c)			HashMap (c)			SortedMap (i)		HashTable (c)
							|					|				  |	 
					LinkedHashMap (c)	   NavigableMap (i)		Properties (c)
												|
											Treemap (c)															   						 
## List

- duplicate values are allowed
- insertion order is maintained		

Important : ajouter les m�thodes equals et hashCode

## Set

- duplicate values are not allowed
- insertion order is not maintained	(except LinkedHashSet)	

## Map (key/value pairs)

- used to store data in key-value p�irs
- duplicate values are allowed but duplicate keys are not allowed
- insertion order is not maintain (except with LinkedHashMap)
- 						   						 