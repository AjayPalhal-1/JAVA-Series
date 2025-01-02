package com.kabira;

import java.time.LocalDate;
import java.util.Scanner;

public class CounterActivity {

	public static Account openAccount() {
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("\nSaving Account :  Press 1 ");
		System.out.println("Enter Your Name :");
		String accHolderName = sc.nextLine();

//		System.out.println("Enter Your Date Of Birth  :");
//		this.dob = LocalDate.parse(sc.nextLine());
		System.out.println("Enter Your Adress  : Taluka :");
		String taluka = sc.nextLine();
		System.out.println("Enter Your Adress  : zilha :");
		String zilha = sc.nextLine();
		System.out.println("Enter Your Adress  : Pincode :");
		int pincode = sc.nextInt();
		Address postal = new Address(taluka, zilha, pincode);
		System.out.println("Enter Balance      :");
		int balance = sc.nextInt();
		System.out.println("Enter Your Age      :");
		int age = sc.nextInt();
		System.out.println("Enter Your Mobile Number   :");
		long moNo = sc.nextLong();
//		System.out.println("Enter Todays Date :");
		LocalDate accOpening = LocalDate.now();

//		SavingAccount acc = 
		return new SavingAccount(balance, accHolderName, moNo, postal, accOpening, accOpening, age, 100);
//		Account openAcc;
//		return new Account();
//		acc.displayAccountDetails();
//		return acc;

	}

}
