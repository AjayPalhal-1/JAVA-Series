package com.kabira.exception;

import com.kabira.exception_handling.LowBalanceException;

public class Account {

	public int balance;
	int accountNumber;
	String accHolderName;

	public Account(int balance, int accountNumber, String accHolderName) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accHolderName = accHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

//	public void withdraw (int amount)
//	{
//		if(amount > this.getBalance())
//		{
//			try
//			{
//				throw new LowBalanceException( "Low Balnce : ");
//				
//			}
//			catch (LowBalanceException e )
//			{
//				e.requiredBal(amount, balance);
//				
//				
//			}
//			
//			
//		}
//		else 
//		{
//			balance -= amount ;
//		}
//	}
//	
	public void withdraw(int amount) throws LowBalanceException {
		if (amount > this.getBalance()) {
//			String s=null;
//			System.out.println(s.charAt(0));
			throw new LowBalanceException("Low Balnce : ");

		} else {
			balance -= amount;
		}
	}

	public void checkBalnce() {
		System.out.println("Actual Balance : " + this.getBalance());
	}

}
