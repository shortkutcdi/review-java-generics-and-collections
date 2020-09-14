# Comparable and Comparator

There are two ways in implement comparison logic :

- 1: implementing the Comparable Interface 
    (note that String and Integer implements by default Comparable interface)
- 2: adding a Comparator object externally

````java
ArrayList<Integer> intList = new ArrayList<>();
intList.add(3);
intList.add(1);
intList.add(4);
intList.add(2);

// sorting the "intList" ArrayList
Collections.sort(intList);
````

## to sort a studentList - implements Comparable

````java
ArrayList<Student> studentList1 = new ArrayList<>();
studentList1.add(new Student("s3", 103));
studentList1.add(new Student("s1", 101));
studentList1.add(new Student("s4", 104));

System.out.println("\n -------------  Before Sorting studentList ------------------");
studentList1.forEach(System.out::println);

// implements Comparable to Students
Collections.sort((List<Student>) studentList1); // --> implements Comparable with compareTo method

System.out.println("\n -------------  after Sorting studentList ------------------");
studentList1.forEach(System.out::println);
````		
		
## 1- Add implements Interface Comparable - and override method compareTo(Student student)

````java
public class Student implements Comparable<Student> {

	private String name;
	private Integer rollNo;

	public Student(String name, Integer rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	

	// equals() and hashCode()


	// getters/setters

	@Override
	public int compareTo(Student student) {
		if (this.getRollNo() > student.getRollNo()) {
			return 1;
		} else {
			return -1;
		}
	}
}	
````

## 2- Create a class StudentComparatorAsc which implements Comparator

- Remove Comparable interface and compareTo() in Student Class
- create a class StudentComparatorAsc implements Comparator<Student>
- implements method overrides compare(Student student1, Student student2)

````java
public class StudentComparatorAsc implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getRollNo() > student2.getRollNo()) {
			return 1;
		} else 
		{
			return -1;
		}
	}
}
````

Testing StudentList

````java
ArrayList<Student> studentList1 = new ArrayList<>();
studentList1.add(new Student("s3", 103));
studentList1.add(new Student("s1", 101));
studentList1.add(new Student("s4", 104));

System.out.println("\n -------------  Before Sorting studentList ------------------");
studentList1.forEach(System.out::println);

// add StudentComparatorAsc
Collections.sort(studentList1, new StudentComparatorAsc());

System.out.println("\n -------------  after Sorting studentList ------------------");
studentList1.forEach(System.out::println);
````

## ajout de la classe StudentComparatorAsc ou StudentComparatorDesc lors de la cr�ation d'une list


		TreeMap<Student, String> studentMap = new TreeMap<>(); // comparaison non possible
		
3 solutions :

	- 1: ajout interface Comparable et méthode comparTo()
	- 2 :
		- créer classe StudentComparatorAsc implémentant Comparator<Student> avec compare(student1, student2)
		2-1: comparaison en ajoutant la ligne:
		
			``Collections.sort(studentList1, new StudentComparatorAsc());``
		ou
		2-2: ajouter une intance de new StudentComparatorAsc() lors de la création de la liste
		
			``TreeMap<Student, String> studentMap = new TreeMap<>(new StudentComparatorDesc());	``				
		
devient

````java
TreeMap<Student, String> studentMap = new TreeMap<>();

studentMap.put(new Student("s2", 102), "Student 2");
studentMap.put(new Student("s1", 101), "Student 1");
studentMap.put(new Student("s3", 103), "Student 3");
studentMap.put(new Student("s4", 104), "Student 4");

Collections.sort(studentList1, new StudentComparatorAsc());
````

ou

````java
TreeMap<Student, String> studentMap = new TreeMap<>(new StudentComparatorDesc());

studentMap.put(new Student("s2", 102), "Student 2");
studentMap.put(new Student("s1", 101), "Student 1");
studentMap.put(new Student("s3", 103), "Student 3");
studentMap.put(new Student("s4", 104), "Student 4");


System.out.println("\n -----------  TreeMap 3 ( key ordered ascending )  ----------------"); 
for (Map.Entry<Student, String> entry : studentMap.entrySet()) {
	System.out.println("Key = "+ entry.getKey() + ", value = " + entry.getValue()); 
} 					
````
