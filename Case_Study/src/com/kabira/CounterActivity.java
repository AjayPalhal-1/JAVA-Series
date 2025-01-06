package com.kabira;

import java.time.LocalDate;
import java.util.Scanner;

public class CounterActivity {

	private static Scanner sc = new Scanner(System.in);

	public static int menu() {

		int choice;
		System.out.println("Please Enter Your Choise To Open Account");
		System.out.println("1 : Saving Account");
		System.out.println("2 : Current Account");
		System.out.println("3 : Salary Account");
		System.out.println("4 : Loan Account");
		choice = sc.nextInt();

		return choice;

	}

	public static int menuDisplayAccountDetails() {

		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println();
		System.out.println();
		System.out.println("Please Enter Your Choise To Display Account");
		System.out.println("1 : Saving Account");
		System.out.println("2 : Current Account");
		System.out.println("3 : Salary Account");
		System.out.println("4 : Loan Account");
		choice = sc.nextInt();

		return choice;

	}

	public static Account openAccount(int ch) {

		System.out.println("Enter Your Name     :");
		String accHolderName = sc.nextLine();

//		System.out.println("Enter Your Date Of Birth  :");
//		this.dob = LocalDate.parse(sc.nextLine());
		System.out.println("Enter Your Adress   : Taluka >>");
		String taluka = sc.nextLine();
		System.out.println("Enter Your Adress   : Zilha   >>");
		String zilha = sc.nextLine();
		System.out.println("Enter Your Adress   : Pincode >>");
		int pincode = sc.nextInt();
		Address postal = new Address(taluka, zilha, pincode);
		System.out.println("Enter Balance       :");
		int balance = sc.nextInt();
		System.out.println("Enter Your Age      :");
		int age = sc.nextInt();
		System.out.println("Enter Mobile Number :");
		long moNo = sc.nextLong();
//		System.out.println("Enter Todays Date :");
		LocalDate accOpening = LocalDate.now();
//		System.out.println("Enter Your Amount You ");
//		int amount = sc.nextInt();

		if (ch == 1) {
			return new SavingAccount(balance, accHolderName, moNo, postal, accOpening, accOpening, age);

		} else if (ch == 2) {
			return new CurrentAccount(balance, accHolderName, moNo, postal, accOpening, accOpening, age);

		} else {
			return null;
		}

	}

	public static void openAcc(Account[] ref) {
		// Switch Case For Opening Account
		int ch = CounterActivity.menu();

		switch (ch) {

		case 1:
			System.out.println("Opening a Saving Account...");
			ref[0] = CounterActivity.openAccount(ch);

			break;
		case 2:
			System.out.println("Opening a Current Account...");
			ref[1] = CounterActivity.openAccount(ch);
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

	}

	public static void displayAllAcc(Account[] ref) {
		// TODO Auto-generated method stub
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

	}

}
