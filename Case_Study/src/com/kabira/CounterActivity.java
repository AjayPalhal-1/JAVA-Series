package com.kabira;

import java.time.LocalDate;
import java.util.Scanner;

public class CounterActivity {

	public static int menu() {
		Scanner sc = new Scanner(System.in);

		int choice;
		System.out.println("Please Enter Your Choise To Open Account");
		System.out.println("1 : Saving Account");
		System.out.println("2 : Current Account");
		System.out.println("3 : Salary Account");
		System.out.println("4 : Loan Account");
		choice = sc.nextInt();

		return choice ;		

	}
	
	public static int menuDisplayAccountDetails() {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println();System.out.println();
		System.out.println("Please Enter Your Choise To Display Account");
		System.out.println("1 : Saving Account");
		System.out.println("2 : Current Account");
		System.out.println("3 : Salary Account");
		System.out.println("4 : Loan Account");
		choice = sc.nextInt();

		return choice ;		

	}

	public static Account openAccount() {

		Scanner sc = new Scanner(System.in);
	
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

		return new SavingAccount(balance, accHolderName, moNo, postal, accOpening, accOpening, age);

	}

}
