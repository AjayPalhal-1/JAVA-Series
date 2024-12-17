package com.ajay.dynamicpoly;

public class Developer extends Employee
{
	
	int overTimePay;
	String skillSet;
	
	public Developer() {
		super();
		
	}

	public Developer(int id, String name, int salary,int otp , String skillSet) 
	{
		super(id, name, salary);
		this.overTimePay= otp;
		this.skillSet=skillSet;
				

	}

	public int getOverTimePay() {
		return overTimePay;
	}

	public void setOverTimePay(int overTimePay) {
		this.overTimePay = overTimePay;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	
	public void calculateSalary()
	{
		
		System.out.println("Dev Salary : "+(this.getSalary()+ this.getOverTimePay()));
	}
	
	
	
	
	
	
	 

}
