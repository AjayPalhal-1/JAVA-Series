package com.kabira;

public class MainApp {
	
	public static void main(String[] args) {
		
	  Address  add = new Address ("Kannad","S.Nagar",431103);
	  Date date = new Date  (2024,12,25);
	  Date odate = new Date  (2024,11,25);

		
		
		Account [] ref = {new SavingAccount(100, 600001, "Anksuh", 23234324, add , date ,
				odate, 21, 50)};
		
		ref[0].deposit(0);
		ref[0].displayAccountDetails();
//		(int balance, int accNo, String accHolderName, long moNo, Address postal, Date dateOfBirth,
//				Date accOpening, int age, int baseBalnce)
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
