package com.kabira;

public class SavingAccount extends Account{
	
	int baseBalnce;
	

	

	public SavingAccount(int balance, int accNo, String accHolderName, long moNo, Address postal, Date dateOfBirth,
			Date accOpening, int age, int baseBalnce) {
		super(balance, accNo, accHolderName, moNo, postal, dateOfBirth, accOpening, age);
		this.baseBalnce = baseBalnce;
	}

	public int getBaseBalnce() {
		return baseBalnce;
	}

	public void setBaseBalnce(int baseBalnce) {
		this.baseBalnce = baseBalnce;
	}
	

	public  void deposit(int amnt)
	{
		
		this.setBalance(getBaseBalnce()+ amnt);
		System.out.println("Total Amonut :"+this.getBalance());
		
		
	}
	public  void intrestCalculate()
	{
		System.out.println("hi");
	}
	
	
	

	


	
	
	
	

}
