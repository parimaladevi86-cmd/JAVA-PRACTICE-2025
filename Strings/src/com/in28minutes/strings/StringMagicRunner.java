package com.in28minutes.strings;

import java.util.Scanner;

public class StringMagicRunner {

	public static void main(String[] args) {
		
		StringMagic magic =new StringMagic();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine();
		 //System.out.println(str);

		

		System.out.println(magic.countUppercaseLetters(str));
		

	}

}
