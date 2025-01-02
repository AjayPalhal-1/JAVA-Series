package com.kabira;

import java.time.LocalDate;

public class SavingAccount extends Account {

	int baseBalnce;

	public SavingAccount(int balance, String accHolderName, long moNo, Address postal, LocalDate dob,
			LocalDate accOpening, int age, int baseBalnce) {
		super(balance, accHolderName, moNo, postal, dob, accOpening, age);
		this.baseBalnce = baseBalnce;
	}

	public int getBaseBalnce() {
		return baseBalnce;
	}

	public void setBaseBalnce(int baseBalnce) {
		this.baseBalnce = baseBalnce;
	}

	public void deposit(int amnt) {

		this.setBalance(getBaseBalnce() + amnt);
		System.out.println("Total Amonut :" + this.getBalance());

	}

	public void intrestCalculate() {
		System.out.println("hi");
	}

}
