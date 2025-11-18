package com.in28minutes.conditional.exercises;

import java.util.Scanner;

public class WeattherAdvisor {

	public static void main(String[] args) {
	/*
	 * Scanner scanner =new Scanner(System.in);
	 * System.out.println("Enter the temperature:"); int temperature=
	 * scanner.nextInt(); System.out.println(provideWeatherAdvisory(temperature)); 
	 */
		WeattherAdvisor adviser = new WeattherAdvisor();
		System.out.println(adviser.provideWeatherAdvisory(-5));
		// Output: "It's freezing! Wear a heavy coat."
		 
		System.out.println(adviser.provideWeatherAdvisory(5));
		// Output: "It's cold! Bundle up."
		 
		System.out.println(adviser.provideWeatherAdvisory(15));
		// Output: "It's cool! A light jacket will do."
		 
		System.out.println(adviser.provideWeatherAdvisory(25));
		// Output: "It's warm! Enjoy the day."
	}	
	public String provideWeatherAdvisory(int temperature) {
         
		if(temperature ==-5) {
			return  "It's freezing! Wear a heavy coat.";
		}
		if(temperature ==5) {
			return  "It's cold! Bundle up.";
		}
		if(temperature ==15) {
			return  "It's cool! A light jacket will do.";
		}
		if(temperature ==25) {
			return  "It's warm! Enjoy the day.";
		}
		
        
		return "false";
    }
}
