package com.in28minutes.conditional.exercises;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		 
        Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the year:");
		int year= scanner.nextInt();
		System.out.println(isLeapYear(year));
	}

	public static boolean isLeapYear(int year) {
		if(year<1)
		{
	       return false;
	    }
		 
		//2041
		
		if(year%4!=0) {
			System.out.println("Not Divisle by 4");
			return false;	
		}
// (2048)
		if(year%4==0 && year%100!=0) {
			System.out.println("Divisible by 4 and NOT divisible by 100 ");
			return true;	
		}
		//2100,2300,2200
		if(year%4==0 && year%100==0 && year%400!=0) {
			System.out.println("Divisible by 4, divisible by 100, NOT divisible by 400");
			return false;	
		}
		//2000,2400
		if(year%4==0 && year%100==0 && year%400==0) {
			System.out.println("Divisible by 4, divisible by 100, divisible by 400");
			return true;	
		}
		return false;
		
}
}