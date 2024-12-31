package com.kabira.input;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Enter A Integer Value : ");
		int num = sc.nextInt();
		System.out.println("Enter A String ");
		String str = sc.next();
		System.out.println("Enter Double Value ");
		double d = sc.nextDouble();
		
		System.out.println("Enter size of array ");
		int size = sc.nextInt();
		int[] arr= new int [size ];
		
		System.out.println(" Enter Array Elements : ");

		
		for(int itr = 0; itr< size ;itr ++)
		{
			arr[itr]= sc.nextInt();
		}
		
//		System.out.println("Enter A one Line text ");
//		sc.nextLine();
//		
//		String sentence = sc.nextLine();
//		
		System.out.println("\n\n\n");
		System.out.println("Integer  :  "+ num);
		System.out.println("Double   :  "+d);
		System.out.println("String   :  "+str);
//		System.out.println("Sentences:  "+sentence);
		
		System.out.println("Array Elements Are ");
		
		for(int itr = 0; itr< size ;itr ++)
		{
			 System.out.println(arr[itr]);// arr[itr];
		}
		
		
	}

}
