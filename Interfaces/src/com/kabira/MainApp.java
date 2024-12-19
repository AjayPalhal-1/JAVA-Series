package com.kabira;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		
		Employee [] emps = { new Developer ( 1 , "ap","JAVA", 0), new Manager(0, null, 0)};
		
		for (int itr =0; itr<emps.length;itr++)
		{
			emps[itr].print();
		}
		
		
		
		Printable[] printall= { new  Developer (1, "pk" ,"CPP",100), new Manager(10,"xyz", 10)};
		for (int itr =0; itr<printall.length;itr++)
		{
			printall[itr].print();
		}
		
		
			
		
		
		
	}
	
	

}
