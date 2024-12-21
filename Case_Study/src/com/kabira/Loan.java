 package com.kabira;

public class Loan extends Account {
	
	int amount;

	public Loan(int accNo, String accHolderName, long moNo, Address postal, Date dateOfBirth, Date accOpening, int age,
			int amount) {
		super(accNo, accHolderName, moNo, postal, dateOfBirth, accOpening, age);
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
