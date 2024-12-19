package com.kabira;

public class Manager  extends Employee{
	
	int projectSize ;

	public Manager(int id, String name, int projectSize) {
		super(id, name);
		this.projectSize = projectSize;
	}

	public int getProjectSize() {
		return projectSize;
	}

	public void setProjectSize(int projectSize) {
		this.projectSize = projectSize;
	}
	
	public void print() {
		System.out.println("Manager ");
	}
	
	
	

}
