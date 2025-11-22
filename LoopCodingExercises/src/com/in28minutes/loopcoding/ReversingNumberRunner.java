package com.in28minutes.loopcoding;

import java.util.Scanner;

public class ReversingNumberRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReversingNumber reverseno = new ReversingNumber();
	    
		while(true) {
	    System.out.println("Enter the number:");
		int number = scanner.nextInt();
		
		 
		System.out.println("Reversed Number is :"+reverseno.reverseNumber(number));
		
	}

	}
}
