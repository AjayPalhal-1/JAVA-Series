package com.kabira.hashcode_overriding;

import java.util.HashSet;
import java.util.Set;

public class MainApp {
	public static void main(String[] args) {
		
		
//		Account ref1 = new Account(1212,"Ajay");
//		Account ref2 = new Account(1212,"Ajay");
		
		Set<Account> acnt= new HashSet<Account>();
		
		acnt.add(new Account(123,"Ap"));
		acnt.add(new Account(123 ,"Ap"));
		
		
	System.out.println("Size Of SeT "+acnt.size());	;
		
		
		
		
		
	}

}
