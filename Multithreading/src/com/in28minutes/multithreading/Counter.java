package com.in28minutes.multithreading;

public class Counter {

	static int count =0;
	
	static synchronized void increment() {
		    
		count++;
		 
	}
}
