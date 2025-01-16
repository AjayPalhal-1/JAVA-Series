package com.kabira.test_2;

public class Pattern {

	public static void main(String[] args) {

		String set = "a1b10";
		StringBuilder numStr = new StringBuilder();
		char ch = ' ';
		int num = 0;

		for (int i = 0; i < set.length(); i++) {
			char currentChar = set.charAt(i);

			if (Character.isLetter(currentChar)) {
				// If we encounter a new character, print the previous pair
				if (numStr.length() > 0) {
					num = Integer.parseInt(numStr.toString());
					//System.out.println("Char: " + ch + ", Number: " + num);
					for (int j = 0; j < num; j++) {

						System.out.println(ch);
					}

					numStr.setLength(0); // Reset numStr for the next number
				}
				ch = currentChar; // Update the character
			} else if (Character.isDigit(currentChar)) {
				// Collect digits
				numStr.append(currentChar);
			}
		}

		// Print the last pair if there's any remaining number
		if (numStr.length() > 0) {
			num = Integer.parseInt(numStr.toString());
			//System.out.println("Char: " + ch + ", Number: " + num);
		}
		for (int i = 0; i < num; i++) {

			System.out.print(ch);

		}
	}
}
