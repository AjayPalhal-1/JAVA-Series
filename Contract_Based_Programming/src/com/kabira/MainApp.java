package com.kabira;

public class MainApp {
	
	public static void main(String[] args) {
		
		Connectivity[] ref = { new Mysql(), new Oracle(),new Mysql(), new Oracle(),new Mysql(), new Oracle()};
//		ref[0].connect();
//		ref[1].connect();
		
		
		for(int itr =0;itr<ref.length;itr++)
		{
			
			ref[itr].connect();
		}
	}

}
