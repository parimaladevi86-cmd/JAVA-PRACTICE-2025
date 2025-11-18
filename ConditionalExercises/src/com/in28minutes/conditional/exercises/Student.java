package com.in28minutes.conditional.exercises;

import java.util.Scanner;

public class Student {
	private static int marks;

	public Student(int marks) {
        this.marks=marks;
    }
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the student mark:");
		int marks= scanner.nextInt();
		 
		//System.out.println(Student( marks));
		System.out.println(assignGrade(marks));

	}

	
	
	public static char assignGrade(int marks) {
        // TODO: Implement the method which assigns the grade based on marks.
		
        // If marks are less than 0 or greater than 100, return 'X'
		 
		if(marks<0 ||marks>100)
		{
			System.out.println("inside x");
			return 'X';
		}
        // If marks are greater than or equal to 90, return 'A'
		if(marks>=90 )
		{
			return 'A';
		}
        // If marks are greater than or equal to 80, return 'B'
		if(marks>=80 )
		{
			return 'B';
		}
        // If marks are greater than or equal to 70, return 'C'
		if(marks>=70 )
		{
			return 'C';
		}
        // If marks are greater than or equal to 60, return 'D'
		if(marks>=60 )
		{
			return 'D';
		}
        // If marks are greater than or equal to 50, return 'E'
		if(marks>=50 )
		{
			return 'E';
		}
        // If marks are less than 50, return 'F'
		if(marks<50)
		{
			return 'F';
		}
        return 'Y';
    }

	 
}
