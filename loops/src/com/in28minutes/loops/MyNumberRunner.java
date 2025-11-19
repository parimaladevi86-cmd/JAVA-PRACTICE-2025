package com.in28minutes.loops;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		//MyNumber mynumber=new MyNumber(7);
		
		MyNumber mynumber = new MyNumber();
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter a number to be checked utas prime or not:");
		  int n1=scanner.nextInt();
		 
		 
		System.out.println(mynumber.isPrime(n1));
		System.out.println(mynumber.sumuptoN(n1));
		System.out.println(mynumber.sumOfDivisors(n1));
		System.out.println(mynumber.printANumberTriangle(n1));
	}
	
	
}