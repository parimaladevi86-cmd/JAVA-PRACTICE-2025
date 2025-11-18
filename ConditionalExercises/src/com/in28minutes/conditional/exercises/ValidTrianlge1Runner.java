package com.in28minutes.conditional.exercises;
import java.util.Scanner;
public class ValidTrianlge1Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 
	        // check if any angle is non-positive
	        if(angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
	            return false;
	        }
	 
	        // calculate the sum of the angles
	        int sumOfAngles = angle1 + angle2 + angle3;
	 
	        // if the sum is exactly 180, the angles form a valid triangle
	        return sumOfAngles == 180;
	    }
}
