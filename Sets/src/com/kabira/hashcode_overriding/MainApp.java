package com.kabira.hashcode_overriding;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {
	public static void main(String[] args) {
		
		
//		Account ref1 = new Account(1212,"Ajay");
//		Account ref2 = new Account(1212,"Ajay");
		
		Set<Account> acnt= new HashSet();
		
//		acnt.add(new Account(123,"Ap"));
		acnt.add(new Account(10 ,"Ap"));
		acnt.add(new Account(20 ,"Ap"));
		acnt.add(new Account(30 ,"Ap"));
		acnt.add(new Account(40 ,"Ap"));

		System.out.println("HashCode acnt :"+acnt.hashCode());

for(Account ref:acnt) {
	
	System.out.println("HashCode acnt ref:"+ref.hashCode());		
}
		
//		Object o;

		
		
	System.out.println("Size Of Set : "+acnt.size());	
	System.out.println(acnt);
		
		
		
		
		
	}

}
