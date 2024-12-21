package com.kabira;

public class SalaryAccount extends Account {
	
	int tracker;

	public SalaryAccount(int accNo, String accHolderName, long moNo, Address postal, Date dateOfBirth, Date accOpening,
			int age, int tracker) {
		super(accNo, accHolderName, moNo, postal, dateOfBirth, accOpening, age);
		this.tracker = tracker;
	}

	public int getTracker() {
		return tracker;
	}

	public void setTracker(int tracker) {
		this.tracker = tracker;
	}

	
	
	

}
