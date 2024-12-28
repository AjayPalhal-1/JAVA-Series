package com.kabira.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
//		System.out.println("E . Handling");
		boolean ok = false;
		
		
		while (ok == false)
		{
			try
			{		
				
			System.out.println("Enter Number : ");
			Scanner sc = new Scanner (System.in);
			int value = sc.nextInt();
			System.out.println(value);
			ok = true;
			}
			
			catch (InputMismatchException ime)
			{
			
				System.out.println("Something Goes Wrong");
			}
			
		}
		
		
		
	}

}
