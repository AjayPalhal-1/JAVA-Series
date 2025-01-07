package com.kabira.string_api;

public class MainApp {

	public static void main(String[] args) {

		Lambda ref = (a, b) -> a * b;
		System.out.println("Multiplication :" + ref.calculate(10, 12));

		ref = (a, b) -> a + b;
		System.out.println("Additons       :" + ref.calculate(100, 100));

		ref = (a, b) -> a - b;
		System.out.println("Substraction   :" + ref.calculate(100, 50));
		
		ref = (a,b) -> a/b ;
		System.out.println("Division       :" + ref.calculate(1000, 50));

		

	}

}
