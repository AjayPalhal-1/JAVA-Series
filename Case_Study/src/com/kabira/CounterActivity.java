package com.kabira;

import java.util.Scanner;

public class CounterActivity {
	
	
	
	public  void openAccount()
	{       
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Age ");
		int age= scanner.nextInt();
//		System.out.println("You age "+age);
		
		if(age < 18)
		{
			System.out.println("Your Not Eligible To Open Account ");
			return;
		}
		
		
		
		
		
				

		
	}

	

}
