package com.kabira;

public class Devloper extends Employee {
	
	int Bouns ;

	

	public Devloper(int id, String name, int salary, int bouns) {
		super(id, name, salary);
		Bouns = bouns;
	}
	
	
	
	public void pay()
	{
		System.out.println("Developer Pay Methode");
	}
	
 
}
