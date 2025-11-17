package com.in28minutes.ifstatements.examples;

import java.util.Scanner;

public class IsWeekDayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day you want from 0 to 6:");
		int day =scanner.nextInt();
System.out.println("weekday or not :"+isWeekday(day));
	}

	
	public static boolean isWeekday(int day) {
		System.out.println("hello");
		switch(day) {
		case 0: 
		case 6: return false;
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: return true;
		
		
		}
	 return false;


		
	}
}
