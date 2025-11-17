package com.in28minutes.ifstatements.examples;

import java.util.Scanner;

public class DetermineDayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the number from 0 to 6 to get the days of week ");
	         int daynumber = scanner.nextInt();
	         System.out.println("you have entered :"+daynumber);
	         //determineNameOfDay(daynumber);
	        System.out.println(determineNameOfDay(daynumber));
	}
              
            public static String determineNameOfDay(int daynumber) {
            	 System.out.println("inside method");
	         switch(daynumber)
	         {
	            //  System.out.println("inside method");
	        	 case 0: return "Sunday";
	        	 case 1: return "Monday";
	        	 case 2: return "Tuesday";
	        	 case 3: return "Wednesday";
	        	 case 4: return "Thursday";
	        	 case 5: return "Friday";
	        	 case 6: return "Saturday";
	        	 
	        		 
	         }
	         System.out.println("hii");
	         return "invalid";
	         
	
}
	}

	 

