package com.kabira.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kabira.comprable.Student;

public class MainApp1 {
	public static void main(String[] args) {

		List<Student> mylist = new ArrayList<Student>();

		mylist.add(new Student(94, "PRAVIN", 4));
		mylist.add(new Student(99, "AJAY", 35));
		mylist.add(new Student(38, "AMOL", 25));
		mylist.add(new Student(94, "BM", 84));
		mylist.add(new Student(94, "BM", 38));

		for (Student student : mylist) {
			System.out.println(student);
		}

		System.out.println("After Sort :::");
		Collections.sort(mylist);

		for (Student student : mylist) {
			System.out.println(student);
		}

	}

}
