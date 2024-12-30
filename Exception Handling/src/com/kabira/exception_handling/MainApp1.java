package com.kabira.exception_handling;

import com.kabira.exception.Account;

public class MainApp1 {

	public static void main(String[] args) {
		
		Account ref = new Account (20000, 1232324, "ABC");
		
		int amnt = 300;
		
		
		try {
			ref.withdraw(amnt);
			System.out.println("Ram Ram !!!");
			
		} 
		catch (LowBalanceException e)
		{
			e.printStackTrace();
			e.requiredBal(amnt, ref.getBalance() );
			e.sendMail();
		}
		
		finally {
			System.out.println("Finally Final  Called >>>>>");
		}
		ref.checkBalnce();
		

	}

}
