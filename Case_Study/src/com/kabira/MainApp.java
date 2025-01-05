package com.kabira;

import java.time.LocalDate;

public class MainApp {

	public static void main(String[] args) {

		Address add = new Address("Kannad", "S.Nagar", 431103);

		LocalDate openingdate = LocalDate.of(2024, 12, 25);
		LocalDate bday = LocalDate.of(2001, 04, 14);

		Account[] ref = new Account[10];
		
		
		
		// Switch Case For Opening Account 

		switch (CounterActivity.menu()) {
		
		case 1:
			System.out.println("Opening a Saving Account...");
			ref[0] = CounterActivity.openAccount();

			break;
		case 2:
			System.out.println("Opening a Current Account...");
			// Add logic to open a Current Account here
			break;
		case 3:
			System.out.println("Opening a Salary Account...");
			// Add logic to open a Salary Account here
			break;
		case 4:
			System.out.println("Opening a Loan Account...");
			// Add logic to open a Loan Account here
			break;
		default:
			System.out.println("Invalid choice. Please select a valid option.");
			break;
		}
		
		

		// Switch Case For Displaying Account 
		
		
		switch (CounterActivity.menuDisplayAccountDetails()) {
		
		case 1:
			
			System.out.println("Saving Account Details ....");
			ref[0].displayAccountDetails();

			break;
		case 2:
			System.out.println("Current Account Details ....");
			// Add logic to open a Current Account here
			break;
		case 3:
			System.out.println("Salary Account Details ....");
			// Add logic to open a Salary Account here
			break;
		case 4:
			System.out.println("Loan Account Details ....");
			// Add logic to open a Loan Account here
			break;
		default:
			System.out.println("Invalid choice. Please select a valid option.");
			break;
		}
		
		
		System.out.println("After Deposite :");
		ref[0].deposit(200);		
		ref[0].displayAccountDetails();
		
		ref[0].withdraw();
		

		


	}

}
