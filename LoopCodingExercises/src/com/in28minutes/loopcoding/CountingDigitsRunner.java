package com.in28minutes.loopcoding;

import java.util.Scanner;

 

public class CountingDigitsRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CountingDigits util = new CountingDigits();
	    
		while(true) {
	    System.out.println("Enter the number to be checked:");
		int num = scanner.nextInt();
		
		 
		System.out.println(util.getNumberOfDigits(num));
		
	}

}

}
