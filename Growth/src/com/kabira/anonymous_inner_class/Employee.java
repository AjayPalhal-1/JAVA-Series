package com.kabira.anonymous_inner_class;

public abstract class Employee implements Payable {
	
//	static int variable = 100;
	

	
	public Employee() {
		super();
	}

	public abstract void employeeDetails();
	
	public static void display()
	{
		System.out.println("Static method Called !!!!!!");
	}
	

}
