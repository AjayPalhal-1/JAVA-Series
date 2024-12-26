package com.kabira;

//import java.util.Date;

public abstract class Account {
	int balance ;
	long accNo;
	String accHolderName;
	long  moNo;	
	Address postal;
	Date  dateOfBirth;
	Date accOpening;	
	int age;
	
	
	

	public Account(int balance, long accNo, String accHolderName, long moNo, Address postal, Date dateOfBirth,
			Date accOpening, int age) {
		super();
		this.balance = balance;
		this.accNo = AccaountNoGenertor();
		this.accHolderName = accHolderName;
		this.moNo = moNo;
		this.postal = postal;
		this.dateOfBirth = dateOfBirth;
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


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Date getAccOpening() {
		return accOpening;
	}


	public void setAccOpening(Date accOpening) {
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


	public void setBalance(int balance)
	{
		this.balance = balance;
	}


	public abstract void deposit(int amnt);
	public abstract void intrestCalculate();
	
	
	public static long AccaountNoGenertor()
	{
		long num= 6000401;
		return  ++num;
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Acc. Holder Name :"+this.getAccHolderName());
		System.out.println("Account No :"+this.getAccNo());
		
	}
	
	
	

}
