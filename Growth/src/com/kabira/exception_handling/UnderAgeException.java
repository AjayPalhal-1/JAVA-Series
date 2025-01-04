package com.kabira.exception_handling;

public class UnderAgeException extends Exception {
//	 private int age;

//	    public UnderAgeException(String msg, int age) {
//	        super(msg);
////	        this.age = age;
//	    }
	    
	    public UnderAgeException(String msg) {
	        super(msg);
	    }

//	    public int getAge() {
//	        return age;
//	    }

//	public UnderAgeException() {
//		super();
//	}
//
//	public UnderAgeException(String msg) {
//		super(msg);
//	}
	
	public void reqiuredAge(int age ) {
        System.out.println("You need to wait " + (18 - age) + " more years to be eligible.");
    }
}
