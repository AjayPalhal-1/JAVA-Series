package com.kabira.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {
	public static void main(String[] args) {

		Set<Account> acnt = new TreeSet();
		Set<String> str = new TreeSet();
		
		str.add("JVM");
		str.add("JVM");
		str.add("Sorting");


		
		

//		acnt.add(new Account(123,"Ap"));
//		acnt.add(new Account(23, "Ap"));
//		acnt.add(new Account(13, "Ap"));
		
		System.out.println(acnt.add(new Account(23, "Ap")));
		System.out.println(acnt.add(new Account(23, "Ap")));
		System.out.println(acnt.add(new Account(23, "Ap")));
		
		System.out.println(str.add("Hi"));
		System.out.println(str.add("Hii"));
		System.out.println(str.add("Hi"));



	

//		System.out.println("HashCode :"+acnt.hashCode());

//		Object o;

//		System.out.println("Size Of Set " + acnt.size());
//		System.out.println(acnt);
		
//		System.out.println("Size Of Set " + str.size());
//		System.out.println(str);
		
		for(Account ref : acnt)
		{
			System.out.println(ref.accNumber);
		}

	}

}
