package com.in28minutes.conditional.exercises;

public class WeatherAdviser {

	public static void main(String[] args) {
		WeatherAdviser adviser = new WeatherAdviser();
		System.out.println(adviser.provideWeatherAdvisory(-5));
		 
		 
		System.out.println(adviser.provideWeatherAdvisory(5));
		 
		 
		System.out.println(adviser.provideWeatherAdvisory(15));
		 
		 
		System.out.println(adviser.provideWeatherAdvisory(25));
 
	}	
	public String provideWeatherAdvisory(int temperature) {
         
		if(temperature <0) {
			return  "It's freezing! Wear a heavy coat.";
		}
		if(temperature <=10) {
			return  "It's cold! Bundle up.";
		}
		if(temperature <=20) {
			return  "It's cool! A light jacket will do.";
		}
		
        
		return  "It's warm! Enjoy the day.";
    }

	}


