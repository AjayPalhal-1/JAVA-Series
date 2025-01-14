package com.kabira.sync.account;

import java.util.Scanner;

public class Account implements Runnable {

	double balance;
	String accHolderName;

	public Account(double balance, String accHolderName) {
		super();
		this.balance = balance;
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public  synchronized void  withdraw() {
		double amount;
		System.out.println("Enter Amount to Withdraw");
		Scanner sc = new Scanner(System.in);

		amount = sc.nextDouble();
		if (amount > this.getBalance()) {
			System.out.println("Insufficinet Amount");
		} else {
			this.setBalance((this.getBalance() - amount));
			System.out.println("Trasaction Done Succesfully ...");
			System.out.println("Remained Balance :  "+this.getBalance());
		}
	}

	@Override
	public void run() {

//		System.out.println("In Run Method....");
        System.out.println("Thread " + Thread.currentThread().getName() + " is running...");

        
        
		withdraw();

        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Pause to allow another thread to execute.

	}

}
