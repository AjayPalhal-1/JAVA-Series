package com.kabira.comprable;

public class Student implements Comparable<Student> {
	
	
	int rollNo ;
	String name ;
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
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		return  o.getMark() -this.getMark() ;
		return  this.getMark() - o.getRollNo();
	}
	
	
	



}
