package com.kabira;

public class Hr extends Employee{
	int commision;

	public Hr(int id, String name, int salary, int commision) {
		super(id, name, salary);
		this.commision = commision;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}
	
public void pay() {
		
		System.out.println("Emp HR  Salary : "+(this.getSalary()+ this.getCommision()));
		
		// TODO Auto-generated method stub
		
	}

}
