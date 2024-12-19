package com.kabira;
// this sets up a relation : is -like-a

public abstract  class Employee implements Printable 
{
	int id ; 
	String name;
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Hello  Employee");
	}
	
	
	
	
	
	
	

}
