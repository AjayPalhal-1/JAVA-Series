package com.string.demo;

public class StringBuffer_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("hello");
//		System.out.println(s2);8
		StringBuffer s3 = s2.append(s1);
		
		
		
		
//		System.out.println(s1.hashCode()+ " "+s2.hashCode()+ " "+" ");
//		System.out.println(s3.hashCode());
//		System.out.println(s1+" "+s2+"  "+s3);
//		
//		s3.append("_kya bolti public");
//		System.out.println(s2+"  "+s3);
//		nums
//		String s4 = s1.toString();
//		
//		System.out.println(s4.hashCode()+" "+s1.hashCode());
//		
//		System.out.println(s1.toString());
		
		Integer num = 12;
		
		String nums = "12345";
		
		Integer newNum = Integer.parseInt(nums);
		
		
		System.out.println(nums+" "+newNum);
		
		
	}

}
//+s3.hashCode()+ " "