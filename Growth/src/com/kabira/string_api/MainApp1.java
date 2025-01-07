package com.kabira.string_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> mylist = new ArrayList();
		
		mylist.add(10);
		mylist.add(30);
		mylist.add(50);		
		mylist.add(60);
		mylist.add(78);
		mylist.add(90);
		mylist.add(20);
		mylist.add(1000);
		
		List<Integer> opratedlist = (List<Integer>) mylist.stream()
				.filter(num -> num >50 && num %2==0)
				.map(num -> num * 2)
				.collect(Collectors.toList());
		System.out.println(opratedlist);
				

		

	}

}
