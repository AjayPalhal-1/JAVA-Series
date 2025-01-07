package com.phoenix.demos.java8.lambda;

public class LambdaCode {

	public static void main(String[] args) {
		
		//Approach1: Implementation class
		ArithmeticOps add=new Addition();
		System.out.println(add.calculate(12, 12));
		
		//Approach2: Anonymous Inner class
		ArithmeticOps subtract=new ArithmeticOps()
				{
					public int calculate(int a, int b)
					{
						return a-b;
					}
				};
		System.out.println(subtract.calculate(12, 12));
		
		//Approach3: Lambda Expression
		ArithmeticOps multiply=(a,b)->
		{
			System.out.println("Within Lambda");
			return a*b;
		};
		System.out.println(multiply.calculate(12, 12));
	}
}
