package com.in28minutes.conditional.exercises;

import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number:");
		int number= scanner.nextInt();
		 System.out.println(isPerfectNumber(number));
	}
	
	public static boolean isPerfectNumber(int number) {
		if(number<=0)
		{
			return false;
		}
		int sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
return sum==number;
}
}