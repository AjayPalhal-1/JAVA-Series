package com.kabira;

import java.time.LocalDate;
import java.util.Scanner;

public class CurrentAccount extends Account {

	int overDraftMoney = 100;

	Scanner sc = new Scanner(System.in);

	// return new (balance, accHolderName, moNo, postal, accOpening, accOpening,
	// age);
	public CurrentAccount(int balance, String accHolderName, long moNo, Address postal, LocalDate dob,
			LocalDate accOpening, int age) {
		super(balance, accHolderName, moNo, postal, dob, accOpening, age);

	}

	public int getOverDraftMoney() {
		return overDraftMoney;
	}

	public void setOverDraftMoney(int overDraftMoney) {
		this.overDraftMoney = overDraftMoney;
	}

	@Override
	public void deposit(int amnt) {

		this.setBalance(this.getBalance() + amnt);
		System.out.println("Total Amonut :" + this.getBalance());

	}

	@Override
	public void intrestCalculate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw() {
		System.out.println("Enter Amount You Want to Withdraw ");
		int amount = sc.nextInt();

		if (amount > this.getBalance()) {
			int rmoney = amount - this.getBalance();
			System.out.println("requierd money :" + rmoney);
			System.out.println("line 55 " + this.getOverDraftMoney());
			this.setOverDraftMoney((this.getOverDraftMoney() - rmoney));
			this.setBalance(-rmoney);
			System.out.println("Current bal " + this.getBalance());
			System.out.println("Overdraft Limit : " + this.getOverDraftMoney());
		} else {

			this.setBalance(this.getBalance() - amount);
			System.out.println("Transction Done !!!");
			System.out.println("Remained Balance : " + this.getBalance());
			System.out.println("Overdraft Limit : " + this.getOverDraftMoney());

		}

	}

}
