package com.kabira.static_method;

public  abstract class Employee {
	
	int id ;
	String name ;
	int salary ;
	
	static  int count ;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		count++;
		
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public  void display()
	{
		System.out.println("Emp Id : " + id);
		System.out.println("Emp Name :"+ name);
		System.out.println("Emp Salary :"+ salary );
		
	}
	
	public static void totalCount()
	{
		System.out.println("Total Emp Created : "+count );
		
	}
	
	
 
}
