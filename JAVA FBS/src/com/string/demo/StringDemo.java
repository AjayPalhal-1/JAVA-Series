package com.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello"+s1;
		
		System.out.println(s1.hashCode()+ " "+s2.hashCode()+ " "+" "+s3.hashCode()+ " ");

		System.out.println(s3);
	}

}
