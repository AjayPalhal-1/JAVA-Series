package com.kabira.exception_handling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter Your Name :");
			String Name = sc.nextLine();
			System.out.println("Enter Your Educational (BE/BTech/BCA/MCA)");
			String Degree = sc.nextLine();
			System.out.println("Are You Familiar With English : Yes / No ");
			String English = sc.nextLine();
			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();
			System.out.println("Enter Your Experiance In Year : ");
			int experiance = sc.nextInt();
			System.out.println("Enter Your Passing Year Of Graduation In Years Only :");
			int graduationYear = sc.nextInt();

			List<String> errors = checkCriteria(Name, Degree, English, age, experiance, graduationYear);
			if (errors.isEmpty()) {
				System.out.println("Congratulations! You meet all the criteria and are selected.");
			} else {
				System.out.println("Candidate Not Selected:");
				for (String error : errors) {
					System.out.println(" - " + error);
				}

			}
		} catch (RequirmentUnmatching e) {
			System.out.println(" Candidate Not Selected   : " + e.getMessage());
		}

	}

	public static List<String> checkCriteria(String Name, String Degree, String English, int age, int experiance,
			int graduationYear) throws RequirmentUnmatching {
		List<String> errors = new ArrayList<>();

		if (age <= 18) {
			errors.add("Age Should Be > 18.");
		}
		if (experiance <= 5) {
			errors.add("Experience Should Be > 5 Years.");
		}
		if (!English.equalsIgnoreCase("Yes")) {
			errors.add("Candidate must be proficient in English.");
		}
		if (!(Degree.equalsIgnoreCase("BE") || Degree.equalsIgnoreCase("BTech") || Degree.equalsIgnoreCase("BCA")
				|| Degree.equalsIgnoreCase("MCA"))) {
			errors.add("Educational Qualification must be BE, BTech, BCA, or MCA.");
		}
		if (graduationYear < 2013 || graduationYear > 2023) {
			errors.add("Passing Year must be between 2013 and 2023.");
		}

		return errors;
	}

}
