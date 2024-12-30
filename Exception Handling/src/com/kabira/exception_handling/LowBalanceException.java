package com.kabira.exception_handling;

public class LowBalanceException extends Exception {

	public LowBalanceException() {
		super();
	}
	
	public LowBalanceException(String amnt) {
		super(amnt);
	}
	
	
	
	public void requiredBal( int amt  , int bal  )
	{	    
		  System.out.println("For Withdraw This Amnt Required Balance is :"+ (amt - bal)); 
	
	}
	
	public void sendMail()
	{
		System.out.println("Mail Sended To Respective Users ......");
	}

}
