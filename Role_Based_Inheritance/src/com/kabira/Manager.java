package com.kabira;

public class Manager  extends Employee {
	
	int projectSize;

	public Manager(int id, String name, int salary, int projectSize) {
		super(id, name, salary);
		this.projectSize = projectSize;
	}

	public int getProjectSize() {
		return projectSize;
	}

	public void setProjectSize(int projectSize) {
		this.projectSize = projectSize;
	}
	
	
	
	public void pay()
	{
		System.out.println("Manager Pay Methode");
	}
	
	
	
	
	

}

