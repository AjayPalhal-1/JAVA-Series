package com.kabira.file;

public class FactoryClass {

	public static Factory makeVehicle( String obj)
	{
		if(obj.equalsIgnoreCase("car"))
		{
			return new Car();
		}
		else if(obj.equalsIgnoreCase("Bike"))
		{
			return new Bike();
			
		}
		else 
		{
			System.out.println("Chukichi vehicle");
			return null;
		}
		
	}

}
