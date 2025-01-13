package com.kabira.overriding_overloading;

public class Hr extends Employee{

	public Hr(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	

	public void display()
	{
		System.out.println("In Emp");
		System.out.println("Id: "+ this.getId());
		System.out.println("Name:"+this.getName());
	}
	public void display(int a)
	{
		System.out.println("In Emp");
		System.out.println("Id: "+ this.getId());
		System.out.println("Name:"+this.getName());
		System.out.println("Value Of A :"+a);
	}
	public void display(String  str)
	{
		System.out.println("In Emp");
		System.out.println("Id: "+ this.getId());
		System.out.println("Name:"+this.getName());
		System.out.println("Value Of A :"+str);
	}

}
