 package com.kabira;

public  class Loan extends Account {
	
	int amount;
	int intrest ;
	
		

	public Loan(int balance, int accNo, String accHolderName, long moNo, Address postal, Date dateOfBirth,
			Date accOpening, int age, int amount, int intrest) {
		super(balance, accNo, accHolderName, moNo, postal, dateOfBirth, accOpening, age);
		this.amount = amount;
		this.intrest = intrest;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

	public int getIntrest() {
		return intrest;
	}

	public void setIntrest(int intrest) {
		this.intrest = intrest;
	}

	@Override
	public void deposit(int amnt) {
		
		System.out.println("Enter Amount ");
		
		
		
	
		
	}

	@Override
	public void intrestCalculate() {
		System.out.println("Enter Amount ");
		
	}
	
	
	

}
