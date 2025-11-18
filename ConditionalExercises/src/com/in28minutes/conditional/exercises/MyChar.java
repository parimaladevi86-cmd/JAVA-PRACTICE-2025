package com.in28minutes.conditional.exercises;

import java.util.Scanner;

public class MyChar {

	public static void main(String[] args) {

		MyChar mc = new MyChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character to be checked:");
		char ch = scanner.next().charAt(0);

		System.out.println(mc.isVowel(ch));

	}

	public boolean isVowel(char ch) {

		// Use a switch statement to check for each vowel, both lowercase and uppercase
		switch (ch) {

		case 'a','e','i','o','u':
		 
		case 'A','E','I','O','U':	return true;
		 
		

			/*
			 * if(ch=='a'||ch=='u'||ch=='e'||ch=='i'||ch=='o') { return true; }
			 * if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') { return true; }
			 */
			
		}
		return false;

	}
}
