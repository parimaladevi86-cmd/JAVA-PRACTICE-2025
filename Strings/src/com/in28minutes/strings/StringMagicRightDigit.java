package com.in28minutes.strings;

import java.util.Scanner;

public class StringMagicRightDigit {

	public static void main(String[] args) {
		StringMagicRightDigit right = new StringMagicRightDigit();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to find the right most digit");
		String str = scanner.nextLine();
		System.out.println(right.getRightmostDigit(str));

	}

	public int getRightmostDigit(String str) {
		/*
		 * Character.isDigit(c): This method takes a character c as its argument and
		 * returns true if c is a digit (0-9), and false otherwise
		 */

		//for (int i = 0; i < (str.length()); i++) 
			for (int i = (str.length()-1); i >=0; i--){

			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				/*
				 * if (Character.getNumericValue(ch) == 1 || Character.getNumericValue(ch) == 2
				 * || Character.getNumericValue(ch) == 3 || Character.getNumericValue(ch) == 4
				 * || Character.getNumericValue(ch) == 5 || Character.getNumericValue(ch) == 6
				 * || Character.getNumericValue(ch) == 7 || Character.getNumericValue(ch) == 8
				 * || Character.getNumericValue(ch) == 9)
				 */
				{
					 
					return Character.getNumericValue(ch);

				}

			}

		}
		return -1;
	}
}