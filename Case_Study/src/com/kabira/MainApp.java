package com.kabira;

import java.time.LocalDate;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Address add = new Address("Kannad", "S.Nagar", 431103);

		LocalDate openingdate = LocalDate.of(2024, 12, 25);
		LocalDate bday = LocalDate.of(2001, 04, 14);

		Account[] ref = new Account[10];
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1 : Open Accounts ");
			System.out.println("2 : Accounts Activity");
			System.out.println("Enter Your choice");
			choice = sc.nextInt();
			
			
			switch (choice) {
//			case 1 -> CounterActivity.openAcc(ref);
//			case 2 -> CounterActivity.displayAllAcc(ref);
			case 1:
				CounterActivity.openAcc(ref);
				break;
			case 2:
//				CounterActivity.displayAllAcc(ref);
				// Switch Case For Displaying Account

				switch (CounterActivity.menuDisplayAccountDetails()) {

				case 1:

					System.out.println("Saving Account Details ....");
					ref[0].displayAccountDetails();
					break;
					
				case 2:
					System.out.println("Current Account Details ....");
					
					break;
				case 3:
					System.out.println("Salary Account Details ....");
					break;
				case 4:
					System.out.println("Loan Account Details ....");
					break;
				default:
					System.out.println("Invalid choice. Please select a valid option.");
					break;
				}
				break;
			}
		} while (choice != 0);

//		 Saving AccounT
//		System.out.println("After Deposite :");
//		ref[0].deposit(200);		
//		ref[0].displayAccountDetails();
//		
//		ref[0].withdraw();

		// Current Account

		System.out.println("After Deposite :");
//		ref[1].deposit(200);		
		ref[1].displayAccountDetails();

		ref[1].withdraw();

	}

}
