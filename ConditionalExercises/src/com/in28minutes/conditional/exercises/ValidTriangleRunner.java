package com.in28minutes.conditional.exercises;

import java.util.Scanner;

public class ValidTriangleRunner {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
 
	
		System.out.println("Enter the angle1 value:");
		int angle1= scanner.nextInt();
		System.out.println("Enter the angle1 value:");
		int angle2= scanner.nextInt();
		System.out.println("Enter the angle1 value:");
		int angle3= scanner.nextInt();
	
		System.out.println(isValidTriangle(angle1,angle2,angle3));
	}
	
	 
	    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
	         
	    	int validTriangle=angle1+angle2+angle3;
	    	System.out.println("total sum:"+validTriangle);
	    	
	    	if(validTriangle==180 && angle1>0 && angle2>0 && angle3>0)
			{/* System.out.println("All angles are >0,sum is 180,It is a valid triangle"); */
	        return true;
	    	}
			/*
			 * //System.out.println("sum is >180");
			 * System.out.println("Either sum is !=180 or one of the angle is non positive"
			 * );
			 */
			return false;
	    }
	

}
