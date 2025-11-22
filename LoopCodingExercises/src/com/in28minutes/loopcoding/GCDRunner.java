package com.in28minutes.loopcoding;

import java.util.Scanner;

public class GCDRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GCD gcd = new GCD();
	    
		while(true) {
	    System.out.println("Enter the number1:");
		int number1 = scanner.nextInt();
		 System.out.println("Enter the number2:");
		 int number2  = scanner.nextInt();
			
		
		 
		System.out.println("GCD is :"+gcd.calculateGCD(number1,number2));
		
	}

	}
}
 