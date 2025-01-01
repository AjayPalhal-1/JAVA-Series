package com.kabira.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet();
		
		names.add("Set");
		names.add("Arraaylist");
		names.add("DSA");
		names.add("CPP");
		names.add("JAVA");
		names.add("Object_Class");
		
//		for(String ref : names)
//		{
//			if(ref.equals("DSA"));
//			{
//				names.remove(ref);
//			}
//		}
//		
//		Exception in thread "main" java.util.ConcurrentModificationException
// At a 2 opration we trying to done 
		
//		for(String ref : names)
//		{
//			System.out.println(ref.));	
		

		Iterator<String> itr = names.iterator(); // use for printing the data in set 

		System.out.println("syso :" + itr);

		while( itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str); // output comes in unorderd way 
			
		}
		
//		for (; itr.hasNext();) {
//			String string = itr.next();
//			System.out.println(string); // output comes in unorderd way 
//		}
		
		
	}

}
