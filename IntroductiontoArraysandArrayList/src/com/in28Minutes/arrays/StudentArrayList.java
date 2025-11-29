package com.in28Minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {
      
	private String name;
	private ArrayList<Integer>marks=new ArrayList<Integer>() ;

	public StudentArrayList(String name, int...marks) {
		 this.name=name;
		 for(int mark:marks) {
		 this.marks.add(mark);
		 }
	}

	public int getNumberOfSubject() { 
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		 int sum=0;
		 for(int mark:marks) {
			 sum =sum+mark;
		 }
		return sum;
	}

	public int getMaximumMark() {
		 
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		 
		return Collections.min(marks);
	}

	
	  public BigDecimal getAverageMarks() { 
		  int totalsum =  getTotalSumOfMarks();
		  int numberofsubjects= getNumberOfSubject();
		  BigDecimal average = (new BigDecimal(totalsum)).divide (new BigDecimal(numberofsubjects),3,RoundingMode.UP);
 	  return average;
 	  }
	 
		
		  public String toString() { return name+marks; }

		  public void addNewMark(int mark) {
			 marks.add(mark);
			
		  }

		  public void removeMarkAtIndex(int index) {
			marks.remove(index);
			
		  }
		 
	
}
