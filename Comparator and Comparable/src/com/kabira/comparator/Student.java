package com.kabira.comparator;

import java.util.Comparator;

public class Student implements Comparator<Student>{

	int rollNo;
	String name;
	int mark;

	public Student(int rollNo, String name, int mark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mark=" + mark + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return  o1.getMark()+o2.getMark();
	}
	
	
}
