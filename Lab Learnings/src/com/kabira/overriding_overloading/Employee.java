package com.kabira.overriding_overloading;

public class Employee {
	
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
	
	

	public void display()
	{
		System.out.println("In Emp");
		System.out.println("Id: "+ this.getId());
		System.out.println("Name:"+this.getName());
	}
}
