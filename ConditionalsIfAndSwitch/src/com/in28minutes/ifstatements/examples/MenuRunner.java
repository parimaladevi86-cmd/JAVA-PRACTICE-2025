package com.in28minutes.ifstatements.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated meth 
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		int number1=scanner.nextInt();
		System.out.println("The first number number is:"+number1);
		System.out.println("Enter the 2nd Number:");
		int number2=scanner.nextInt();
		System.out.println("The second number number is:"+number2);
		System.out.println("  choices availabe are");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice:");
		int operation= scanner.nextInt();
		System.out.println("Your choices are:");
		System.out.println("Number1:"+number1);
		System.out.println("Number2:"+number2);
		System.out.println("Operation:"+operation);
		
		//performOperationsUsingNestedIfElse(number1, number2, operation);
		performOperationsUsingSwitch(  number1,   number2,   operation);
	}
	
	public static void performOperationsUsingSwitch(int number1, int number2, int operation) {
		
		
		switch(operation)
		{
			case 1:
				System.out.println("addition:"+(number1+number2));
				break;
				
			case 2:
				System.out.println("addition:"+(number1-+number2));
				break;
			case 3:
				System.out.println("addition:"+(number1*number2));
				break;
				
			case 4:
				System.out.println("addition:"+(number1/number2));
				break;
				
			case 5:
				System.out.println("addition:"+(number1+number2));
				break;
				
				
			
		}
	}
}

	/*
	 * public static void performOperationsUsingNestedIfElse(int number1, int
	 * number2, int operation) { if (operation==1) {
	 * System.out.println("addition:"+(number1+number2)); } else if (operation ==2)
	 * { System.out.println("Subtraction:"+(number1-number2)); } else if (operation
	 * ==3) { System.out.println("Multiplication:"+(number1*number2)); } else if
	 * (operation ==4) { System.out.println("Divison:"+(number1/number2)); } else {
	 * System.out.println("Invalid operation"); } }
	 */


