package com.in28minutes.loopcoding;

import java.util.Scanner;

public class SumOfDigitsRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SumOfDigits sumofdigit = new SumOfDigits();
	    
		while(true) {
	    System.out.println("Enter the number:");
		int number = scanner.nextInt();
		
		 
		System.out.println("Sum of Digits of given number is :"+sumofdigit.getSumOfDigits(number));
		
	}

	}
}
