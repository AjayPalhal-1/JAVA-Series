package com.kabira.static_method;

public  class MainApp {
	static void fun1() {
		System.out.println("in mainApp");
	}

public static void main(String[] args) {
	
	Hr[] ref = { new Hr (1,"AP",232442,500) , new Hr (2,"BM",232442,500)};
	
	ref[0].totalCount();
	Hr.totalCount();
	
//	Employee.totalCount();
//	
//
//	
//	 fun1();
	
	
	
}
}
