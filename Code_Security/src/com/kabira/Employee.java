package com.kabira;

public class Employee  implements Payble{
	
	int id ;
	String name ;
	int Salary ;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
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
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public void pay() {
		
		System.out.println("Emp Salary : "+this.getSalary());
		// TODO Auto-generated method stub
		
	}
	
	public void meet()
	{
		System.out.println("Internal Meeting Called ");
	}

	
	

}
