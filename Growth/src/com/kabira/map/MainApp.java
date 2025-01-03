package com.kabira.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainApp {

	public static void main(String[] args) {

		Map<Integer, Integer> mymap = new HashMap();
		mymap.put(1, 100);
		mymap.put(2, 200);
		mymap.put(3, 300);
		mymap.put(4, 200);
		mymap.put(5, 200);
		mymap.put(6, 200);
		mymap.put(7, 200);

//		System.out.println("KeySet : " + mymap.keySet());

		System.out.println("EntrySet  O/P : \n" + mymap.entrySet());

//		mymap.clear();
//		System.out.println("EntrySet : " + mymap.entrySet());
//		System.out.println(mymap);

//		int value = mymap.get(1);
//		System.out.println("Value 1 : " + value);
//		int size = mymap.size();
//		System.out.println(size);

		Map<String, String> mylinkhashmap = new LinkedHashMap();
		mylinkhashmap.put("Name", "Ajay");
		mylinkhashmap.put("ID", "102");
		mylinkhashmap.put("Salary", "Betan");
		System.out.println("LinkHashMap O/P : \n" + mylinkhashmap.entrySet());

		Map<Integer, String> mytreemap = new TreeMap();

		mytreemap.put(1, "Ajay");
		mytreemap.put(2, "Palhal");
		mytreemap.put(3, "Don");

		System.out.println("TreeMap O/P : \n" + mytreemap.entrySet());

	}

}
