package com.kabira.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {

		List<Integer> mylist = new ArrayList<Integer>();
//		List<Integer> mylist = new List<Integer>();  later on 

		List<String> random = new ArrayList<String>();

		mylist.add(10);
		mylist.add(100);
		mylist.add(10);
		random.add("AJAY");
		random.add("AJAY");
		random.add("PALHAL");
		System.out.println("Size Of mylist : " + mylist.size());
		System.out.println("SSize Of random : " + random.size());

		for (String value : random) {
			System.out.println(value);
		}

		for (int value : mylist) {
			System.out.println(value);
		}

	}

}
