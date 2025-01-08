package com.kabira.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainApp1 {

	public static void main(String[] args) {

		Map<Integer, String> mymap = new HashMap();
		mymap.put(1, "1 Number");
		mymap.put(5, "5 Number");
		mymap.put(3, "3 Number");
		mymap.put(7, "7 Number");
		mymap.put(90, "9 Number");
		mymap.put(0, "0 Number");
		mymap.put(7, "7 Number");
		mymap.put(9, "90 Number");

		System.out.println("mymap : \n" + mymap);

		Map<Integer, String> mymap1 = new HashMap();
		mymap1.put(1, "1 Number");
		mymap1.put(5, "5 Number");
		mymap1.put(3, "3 Number");
		mymap1.put(7, "7 Number");
		mymap1.put(90, "9 Number");
		mymap1.put(0, "0 Number");
		mymap1.put(7, "7 Number");
		mymap1.put(9, "90 Number");

		System.out.println("mymap 1 : \n" + mymap1);

		Set<Integer> myset = new HashSet();
		myset.add(12);
		myset.add(45);
		myset.add(0);
		myset.add(1);
		myset.add(0);
		myset.add(1);

		System.out.println("myset : " + myset);

		Map<Integer , String> treemap = new TreeMap();
		treemap.put(1, "1 Number");
		treemap.put(5, "5 Number");
		treemap.put(3, "3 Number");
		treemap.put(7, "7 Number");
		treemap.put(90, "9 Number");
		treemap.put(0, "0 Number");
		treemap.put(7, "7 Number");
		treemap.put(9, "90 Number");
		
		
		System.out.println("Tree map : \n"+treemap);
		
		Map<Integer , String> mylinkedmap = new LinkedHashMap();
		mylinkedmap.put(1, "1 Number");
		mylinkedmap.put(5, "5 Number");
		mylinkedmap.put(3, "3 Number");
		mylinkedmap.put(7, "7 Number");
		mylinkedmap.put(90, "9 Number");
		mylinkedmap.put(0, "0 Number");
		mylinkedmap.put(7, "7 Number");
		mylinkedmap.put(9, "90 Number");
		
		
		System.out.println("mylinkedmap : \n"+mylinkedmap);

	}

}
