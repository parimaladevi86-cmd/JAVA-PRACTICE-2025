package com.in28minutes.loopcoding;

import java.util.Scanner;

public class NumberUtilsRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    NumberUtils util = new NumberUtils();
	    
		while(true) {
	    System.out.println("Enter the number to be checked:");
		int num = scanner.nextInt();
		
		/*
		 * if(num<0) { System.out.println("Program ends here"); break; }
		 */
		
		
		//util.getLastDigit(num);
		System.out.println(util.getLastDigit(num));
		
	}

}
}