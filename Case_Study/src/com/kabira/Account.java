package com.kabira;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Account {
	int balance;
	long accNo;
	String accHolderName;
	long moNo;
	Address postal;
	LocalDate dob;
	LocalDate accOpening;
	int age;

	public Account(int balance, String accHolderName, long moNo, Address postal, LocalDate dob, LocalDate accOpening,
			int age) {
		super();
		this.balance = balance;
		this.accNo = AccaountNoGenertor();
		this.accHolderName = accHolderName;
		this.moNo = moNo;
		this.postal = postal;
		this.dob = dob;
		this.accOpening = accOpening;
		this.age = age;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public long getMoNo() {
		return moNo;
	}

	public void setMoNo(long moNo) {
		this.moNo = moNo;
	}

	public Address getPostal() {
		return postal;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}

	public LocalDate getdob() {
		return dob;
	}

	public void setLocalDateOfBirth(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getAccOpening() {
		return accOpening;
	}

	public void setAccOpening(LocalDate accOpening) {
		this.accOpening = accOpening;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public abstract void deposit(int amnt);

	public abstract void intrestCalculate();

	public static long AccaountNoGenertor() {
		long num = 6000401;
		return ++num;
	}

	public void displayAccountDetails() {
		System.out.println("Account Holder Name     : " + this.getAccHolderName());
		System.out.println("Account Number          : " + this.getAccNo());
		System.out.println("Account Holder Age      : " + this.getAge());
		System.out.println("Account Balance         : " + this.getBalance());
		System.out.println("Account Holder Date Of Birth : " + this.getdob());
		System.out.println("Account Opening LocalDate    : " + this.getAccOpening());
		postal.addressDisplay();

	}

//	public void openAccount()
//	{
//		Scanner sc = new Scanner(System.in);
//		int ch ;
//		System.out.println("\nSaving Account :  Press 1 ");
//		System.out.println("Enter Your Name :");
//		this.accHolderName  = sc.nextLine();
////		System.out.println("Enter Your Date Of Birth  :");
////		this.dob = LocalDate.parse(sc.nextLine());
//		System.out.println("Enter Your Adress  : Taluka :");
//		String taluka = sc.nextLine();
//		System.out.println("Enter Your Adress  : zilha :");
//		String zilha = sc.nextLine();
//		System.out.println("Enter Your Adress  : Pincode :");
//		int  pincode = sc.nextInt();
//		this.postal = new Address( taluka , zilha , pincode );
//		System.out.println("Enter Balance      :");
//		this.balance= sc.nextInt();
//		System.out.println("Enter Your Age      :");
//		this.age= sc.nextInt();
//		System.out.println("Enter Your Mobile Number   :");
//		this.moNo= sc.nextLong();
////		System.out.println("Enter Todays Date :");
//		this.accOpening = LocalDate.now();	
//		
//	
//		
//	}

}
