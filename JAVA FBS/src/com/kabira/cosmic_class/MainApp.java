package com.kabira.cosmic_class;

public class MainApp {
	
	public static void main(String[] args) {
		
		Employee ref = new Employee(1 ,"ap"  ,399);
		Employee ref1 = new Employee(11 ,"ap"  ,399);

		
		System.out.println(ref.equals(ref1));;
		
		System.out.println(ref.toString());
		
		
	}
	
	

}
