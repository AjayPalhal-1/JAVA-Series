package com.kabira;

public abstract  class Employee {
	
	int id ;
	String Name ;
	int salary ;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		Name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public void pay()
	{
		System.out.println("Emp Pay Methode");
	}

}
