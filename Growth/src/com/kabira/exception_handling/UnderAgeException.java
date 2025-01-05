package com.kabira.exception_handling;

public class UnderAgeException extends Exception {

	    
	    public UnderAgeException(String msg) {
	        super(msg);
	    }

	
	public void reqiuredAge(int age ) {
        System.out.println("You need to wait " + (18 - age) + " more years to be eligible.");
    }
}
