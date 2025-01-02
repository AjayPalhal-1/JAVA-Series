package com.kabira.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {

//		Set<int> = new Set();

		Set<String> str = new HashSet();
		str.add("Collection");
		str.add("List");
		str.add("Set");
		str.add("Set");
		str.add("set");
		



		Iterator<String> itr = str.iterator();
		System.out.println("Orignal Set: " + str);

		while (itr.hasNext()) {
			String value = itr.next();

			if (value.equals("Set"))
			{
				itr.remove();
				System.out.println("Removed Element : " + value);

			}

		}

		System.out.println("Updated Set: " + str);

	}

}
