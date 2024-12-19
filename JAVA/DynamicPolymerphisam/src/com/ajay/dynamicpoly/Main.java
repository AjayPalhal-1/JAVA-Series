package com.ajay.dynamicpoly;

public class Main {
	
	public static void main(String[] args) {
		
	
	Employee[] emps = { new Developer(), new Manager(), new Developer(), new Manager(), new Developer(),
			new Manager() };
	
	
	EmpMgmt.calAllSal(emps);
}
	
}
