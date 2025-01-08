package com.kabira.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {

		List<Student> mylist = new ArrayList<Student>();

		mylist.add(new Student(99, "AJAY", 35));
		mylist.add(new Student(98, "ANKUSH", 25));
		mylist.add(new Student(94, "PRAVIN", 3));
		mylist.add(new Student(99, "AJAY", 36));
		mylist.add(new Student(8, "AMOL", 5));
		mylist.add(new Student(94, "BM", 0));

//		System.out.println("List :\n"+mylist);

		for (Student student : mylist) {
			System.out.println(student);
		}

		System.out.println("After Sorting ");

		Collections.sort(mylist);
		for (Student student : mylist) {
			System.out.println(student);
		}

	}

}
