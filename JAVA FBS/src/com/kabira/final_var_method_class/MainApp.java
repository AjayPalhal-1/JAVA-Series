package com.kabira.final_var_method_class;

import java.util.Iterator;

public class MainApp {
	
	public static void main(String[] args) {
		
		Player[] ref = {  new Player(101,"Virat Kohli ", 18),
				          new Player(101 ,"  MSD ",07)  };
		
		for (int i = 0; i < ref.length; i++) {
			ref[i].display();
			System.out.println("********************");
		}
		
		
	}

}
