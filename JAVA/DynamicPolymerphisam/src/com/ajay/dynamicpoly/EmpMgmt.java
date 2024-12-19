package com.ajay.dynamicpoly;

public class EmpMgmt {
	public static void calAllSal(Employee[] arr) {

		for (int iter = 0; iter < arr.length; iter++) {
			arr[iter].calculateSalary();
		}
	}
}
