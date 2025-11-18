package com.in28minutes.conditional.exercises;

import java.util.Scanner;
import java.util.Scanner;

public class TriangleValidator {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the side1 value:");
		int a= scanner.nextInt();
		System.out.println("Enter the side2 value:");
		int b= scanner.nextInt();
		System.out.println("Enter the side3 value:");
		int c= scanner.nextInt();
 		System.out.println(isRightAngled(a,b,c));
 		

	}
	 public static boolean isRightAngled(int a, int b, int c) {
		 
		 if(a<=0||b<=0||c<=0)		 {
		return false;
		 }
		// a^2+b^2=c^2;
		 if(c*c==a*a+b*b) {
			 System.out.println("1st");
		 return true;
	    }
		 if(b*b==a*a+c*c) {
			 System.out.println("2nd");
			 return true;
		    }
		 if(a*a==c*c+b*b) {
			 System.out.println("3rd");
			 return true;
		    }
		 return false;
}
}