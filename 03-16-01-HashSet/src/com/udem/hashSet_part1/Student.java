package com.udem.hashSet_part1;

public class Student {

	private String name;
	private Integer rollNo;

	public Student(String name, Integer rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rollNo == null) ? 0 : rollNo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo == null) {
			if (other.rollNo != null)
				return false;
		} else if (!rollNo.equals(other.rollNo))
			return false;
		return true;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

}
