package com.kabira.exception_handling;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		int age = 0;

		try {
			System.out.println("Enter Your Age ");
			Scanner sc = new Scanner(System.in);
			age = sc.nextInt();
			ageVerifyer(age);
		} catch (UnderAgeException a) {
			a.printStackTrace();
			if (age < 18) {
				a.reqiuredAge(age);
			}

		}

	}

	public static void ageVerifyer(int age) throws UnderAgeException {
		if (age < 18) {
			throw new UnderAgeException(" Your Age Is Under 18");
//			 reqiuredAge( age );
		} else if (age > 500) {
			throw new UnderAgeException("Are You Serious or are You Ashwthama !!");

		} else if (age > 100) {
			throw new UnderAgeException(" Your Age Is Grater Than 100");

		}

		else {
			System.out.println("Your Eligible to Vote ");
		}

	}

}
