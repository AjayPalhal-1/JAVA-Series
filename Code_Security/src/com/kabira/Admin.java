package com.kabira;

public class Admin extends Employee{
	
	int allowance ;

	public Admin(int id, String name, int salary, int allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
public void pay() {
		
		System.out.println("Emp Salary + Admin allowance : "+(this.getSalary()+ this.getAllowance()));
		// TODO Auto-generated method stub
		
	}
	
	

}
