package com.kabira.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		List <String> random= new ArrayList();
		
		
//		System.out.println(random.size());
//		random.add(223);
//		random.add("AP");
//		random.add(2);
//		random.add(23);
//		random.add(323);

//		random.remove(1);
		
		random.add("JAVA");
		random.add("DSA");
		random.add("SQL");
		random.add("CPP");
		random.add("JAVA");

//        random.clear();
        System.out.println("First element "+random.getFirst());
        
//        Iterator <String> itr  = random.iterator();
//		Iterator<String> itr = str.iterator();

		



		
		
		for(int itr =0 ; itr< random.size();itr++)
		{
			System.out.println(random.get(itr));
		}
		
		System.out.println("Final Size : "+random.size());
		
		System.out.println("4th Position Element : "+random.get(4));


		
	}

}

// list :   list saves and when we retrive the data from it 
//          it gives in orderd mannaer 
//          list Allows Dulicate Entrys Also . 
//          In List We Can Acesses Element via Index's Values .
//
