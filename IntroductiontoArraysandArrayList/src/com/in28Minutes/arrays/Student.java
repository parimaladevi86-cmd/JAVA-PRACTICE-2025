package com.in28Minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
      
	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		 this.name=name;
		 this.marks=marks;
	}

	public int getNumberOfSubject() { 
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		 int sum=0;
		 for(int mark:marks) {
			 sum =sum+mark;
		 }
		return sum;
	}

	public int getMaximumMark() {
		int maximum=Integer.MIN_VALUE;
	for(int mark:marks) {
		
		if(mark>maximum) {
			maximum=mark;
		}
	}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum=Integer.MAX_VALUE;
		for(int mark:marks) {
			
			if(mark<minimum) {
				minimum=mark;
			}
		}
		return minimum;
	}

	
	  public BigDecimal getAverageMarks() { 
		  int totalsum =  getTotalSumOfMarks();
		  int numberofsubjects= getNumberOfSubject();
		  BigDecimal average = (new BigDecimal(totalsum)).divide (new BigDecimal(numberofsubjects),3,RoundingMode.UP);
 	  return average;
 	  }
	 
	
	
}
