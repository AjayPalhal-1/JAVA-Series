package com.kabira;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		Payble[]ref  = { new Employee(1,"Ap",88) , new Hr(1,"Ap",88,20), new Manager (2,"Amol",599,10),
				         new Freelancer (4 ,"PK",90) };
		
		for (int i = 0; i < ref.length; i++) {
			ref[i].pay();	 
			ref[i].meet();

			
		}
		
		
		 Employee[]ref1  = {new Employee(1,"Ap",88) , new Hr(1,"Ap",88,20), new Manager (2,"Amol",599,10) };
		 for (int i = 0; i < ref1.length; i++) {
				ref1[i].meet();	
		
	}

}
}
