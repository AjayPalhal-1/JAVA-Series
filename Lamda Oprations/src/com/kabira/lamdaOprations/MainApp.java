package com.kabira.lamdaOprations;

public class MainApp {

	public static void main(String[] args) {

		// Approach 1

		AirthematicOps add = new Addition();
		System.out.println("Normal One : " + add.calculate(12, 12));

		// Approach 2 Using anonymous inner class
		AirthematicOps substract = new AirthematicOps()
		{
			public int calculate(int a, int b) {
				return a - b;

			}  
		};

		System.out.println("Anonymous Inner Class : " + substract.calculate(100, 10));

		// Approach 3 : Using Lambda

		AirthematicOps multiply = (a, b) -> a * b; // expression
		System.out.println("Using Lamda : " + multiply.calculate(2, 10));

//		AirthematicOps multiply = (a, b) -> {
//			
//
//		};

	}

}
