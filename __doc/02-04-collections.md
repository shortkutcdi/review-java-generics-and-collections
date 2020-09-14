# collections

![collections](Capture.JPG)

Les interfaces

- List
- Map
- Set
- Queue

Les classes qui les implémentent

- ArraList implémente List
- HashMap
- HashSet
- LinkedList


````java
class ArraList							class ArraList<E>
{										{
	// public boolean add(Object p)				// public boolean add(E e)
	// public Object get(int index)				// public E get(int index)
}										}

ArrayList list = new ArrayList();			ArrayList<Integer> list = new ArrayList<>();
````