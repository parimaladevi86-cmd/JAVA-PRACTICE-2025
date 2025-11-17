package com.in28minutes.ifstatements.examples;

import java.util.Scanner;

public class DetermineMonthRunner {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month number from 1 to 12");
		int month =scanner.nextInt();
		// TODO Auto-generated method stub
		//System.out.println(determineMonth(month));
		System.out.println("The month you entered is:"+determineMonth(month));
		
	}
public static String determineMonth(int month) {
	 
	switch(month) {
	
	case 1 : return "January";
	case 2 : return "February";
	case 3 : return "March";
	case 4 : return "April";
	case 5 : return "May";
	case 6 : return "June";
	case 7 : return "July";
	case 8 : return "August";
	case 9 : return "September";
	case 10 : return "October";
	case 11 : return "November";
	case 12 : return "December";
	}
	return "invalid month";
}




	}

