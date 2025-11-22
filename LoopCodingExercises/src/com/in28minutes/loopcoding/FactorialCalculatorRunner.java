package com.in28minutes.loopcoding;

import java.util.Scanner;

//import java.util.Scanner;

 

public class FactorialCalculatorRunner {

	 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FactorialCalculator calc=new FactorialCalculator();
		
		while(true) {
	
		System.out.println("Enter the number to find its factorial");
		int  n=scanner.nextInt();
		if(n<0)
		{
			 System.out.println("program ended");
			 break;
		}
		calc.calculateFactorial(n);
		
		
		 
	}

	 

	
}
}
