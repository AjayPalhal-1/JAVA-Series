package com.kabira.cosmic_class;

public class Employee {
	
	int id;
	String Name;
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
	
	public String toString ()
	{
		return "Something";
	}
	
	public boolean equals(Employee e)
	{
		if(this.getId()==e.getId())
		{
			return true;
		}
		
		else return false;
		
	}

}
