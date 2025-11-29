package com.in28Minutes.arrays;

import java.math.BigDecimal;

public class StudentArrayListRunner {

	public static void main(String[] args) {
		int[] marks = { 90, 87, 79, 60, 51 };
		StudentArrayList student = new StudentArrayList("Parimala", marks);
		int subject = student.getNumberOfSubject();
		int sum = student.getTotalSumOfMarks();
		int maximumMarks = student.getMaximumMark();
		int minumumMarks = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();
		
		System.out.println("Number of Subjects:"+subject);
		System.out.println("Total Marks:"+sum);
		System.out.println("maximumMarks:"+maximumMarks);
		System.out.println("minumumMarks:"+minumumMarks);
		System.out.println("average:"+average);
		System.out.println(student);
		student.addNewMark(99);
		System.out.println(student);
        student.removeMarkAtIndex(3);
        System.out.println(student);
	}

}
