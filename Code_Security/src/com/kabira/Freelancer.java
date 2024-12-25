package com.kabira;

public class Freelancer implements Payble{
	
	int id ;
	String name ;
	int salary ;
	
	

	public Freelancer(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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





	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
		System.out.println("Freelancers Salary Called : ");
		System.out.println(this.getSalary());
		
	}





	@Override
	public void meet() {
		System.out.println("Freelancers Made Own Meeting ");
		
	}
	

}
