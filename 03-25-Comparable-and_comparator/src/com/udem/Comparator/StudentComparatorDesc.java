package com.udem.Comparator;

import java.util.Comparator;

public class StudentComparatorDesc implements Comparator<Student>{
	
	

	public StudentComparatorDesc() {
		super();
	}

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getRollNo() < student2.getRollNo()) {
			return 1;
		} 
		else 
		{
			return -1;
		}
	}
}
