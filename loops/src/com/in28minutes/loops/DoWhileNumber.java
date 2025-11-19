package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileNumber {

	public void cubeNumber() {
	 
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		do { 
			if(num!=0)
			{
			System.out.println("cube is"+ num*num*num);
			}
			System.out.println("Enter a number to be print its CUBE :");
			  num=scanner.nextInt();
			 
	
	 
	}while(num>=0);
		System.out.println("Thank you Have fun");
	}
} 
