package com.kabira.test_2;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "One Two Three";
		reverse(str);
		
		

	}
	
	public  static void reverse(String str)
	{
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)==' ')
//			{
//				str
//			}
//		}
		
		String str1[] = str.split(" ");
		for ( int i = str1.length -1 ;i>=0;i--)
		{
			System.out.print("  " +str1[i]);
		}
//		for (String string : str1) {
//			System.out.print("  " +string);
//			
//		}
//		System.out.println(str1[2] +" "+ str1[1] + " "+str1[0] );
//		String str2[] = str.split(" ");
//		String str3[] = str.split(" ");

	}

}
