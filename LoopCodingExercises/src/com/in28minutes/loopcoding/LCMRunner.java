package com.in28minutes.loopcoding;

 

public class LCMRunner {

	public static void main(String[] args) {

		LCM binum = new LCM(5, 10);
		System.out.println(binum.calculateLCM()); // Output: 6
		 
		binum = new LCM(0, 5);
		System.out.println(binum.calculateLCM()); // Output: 0
		 
		binum = new LCM(-2, 5);
		System.out.println(binum.calculateLCM()); // Output: 1
		
		 

	

	}

}
