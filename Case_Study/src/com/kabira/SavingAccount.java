package com.kabira;

import java.time.LocalDate;
import java.util.Scanner;

public class SavingAccount extends Account {

	static int baseBalnce=1000;
	
	
	Scanner sc = new Scanner (System.in);
	
	

	public SavingAccount(int balance, String accHolderName, long moNo, Address postal, LocalDate dob,
			LocalDate accOpening, int age) 
	{
		super(balance + baseBalnce, accHolderName, moNo, postal, dob, accOpening, age);
		
	}
	
	
	

	public int getBaseBalnce() {
		return baseBalnce;
	}

	public void setBaseBalnce() {
		this.baseBalnce = 1000;
	}

	
	
	public void deposit(int amnt) {

		this.setBalance(this.getBalance() + amnt);
		System.out.println("Total Amonut :" + this.getBalance());

	}
	
	public void withdraw()
	{
		System.out.println("Enter Amount For Withdraw ");
		int amount = sc.nextInt();
		if(amount >  (this.getBalance()- this.getBaseBalnce()))
		{
			System.out.println("You Cant Withdraw This Much Amount ");
			System.out.println("Base Balance Shoulde Be : " + this.getBaseBalnce());
			System.out.println("You Are Able To Withdraw  : "+ (this.getBalance()- this.getBaseBalnce()));
		}
		
		else
		{
			this.setBalance(this.getBalance()-amount);
			System.out.println("Amount Withdrawed Succesfully.....!!!!!!");
			System.out.println("Your Remained Balance : " + this.getBalance());
			
		}
		
		
	}

	public void intrestCalculate() {
		System.out.println("hi");
	}

}
