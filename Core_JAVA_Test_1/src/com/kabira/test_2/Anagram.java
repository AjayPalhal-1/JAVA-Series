package com.kabira.test_2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ABC";
		String str2 = "ACB";

		if (isAnagram(str1, str2)) {
			System.out.println(str1 + "  and  " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");

		}

	}
	
	public static boolean isAnagram(String str1 , String str2)
	{
		if(str1.length()!= str2.length())
		{
			return false ;
		}
		char[] array1= str1.toCharArray();
		char[] array2= str2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		return Arrays.equals(array1, array2);

	}

}
