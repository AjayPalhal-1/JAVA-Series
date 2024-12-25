package com.kabira.final_var_method_class;



public class MainApp {
	
	public static void main(String[] args) {
		
		Player[] ref = {  new CricketPlayer(101,"Virat Kohli ", 18,99),
				          new CricketPlayer(101 ,"  MSD ",07,99)  };
		
		for (int i = 0; i < ref.length; i++) {
			ref[i].display();
			System.out.println();
		}
		
		
	}

}
