package com.kabira;

import java.time.LocalDate;

public class MainApp {
	
	public static void main(String[] args) {
		
	  Address  add = new Address ("Kannad","S.Nagar",431103);
//	  LocalDate dobLocalDate = new LocalDate(2024,12,25);
//	  LocalDate openingLocalDate = new LocalDate(2024,11,25);

		LocalDate openingdate = LocalDate.of(2024, 12, 25);
		LocalDate bday = LocalDate.of(2001,04,14);
		
		Account [] ref = {new SavingAccount(100, 600001, "Anksuh", 23234324, add , bday,
				openingdate , 21, 50)};
		
		ref[0].openAccount();
		ref[0].displayAccountDetails();
//		(int balance, int accNo, String accHolderName, long moNo, Address postal, LocalDate LocalDateOfBirth,
//				LocalDate accOpening, int age, int baseBalnce)
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
