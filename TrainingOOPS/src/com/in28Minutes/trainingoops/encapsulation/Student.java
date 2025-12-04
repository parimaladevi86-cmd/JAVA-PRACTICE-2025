package com.in28Minutes.trainingoops.encapsulation;

public class Student {
      private String studentName;
      private int marks;
      
	public Student(String studentName, int marks) {
		if(studentName==null||studentName.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		else {
			this.studentName=studentName;
		}
		
		 if (!setMarks(marks)) {
	            throw new IllegalArgumentException("Marks must be between 0 and 100");
	        }
	     {
				this.marks=marks;
		 }
	 
		 
	}

	
	public int getMarks() {
		return marks;
	}
	public String getStudentName() {
		return studentName;
	}

	public boolean setStudentName(String studentName) {
		if (studentName == null || studentName.trim().isEmpty()) {
            return false;
        }
        this.studentName = studentName;
        return true;
	}

	public boolean setMarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.marks=marks;
			return true;
		}
		else {
			 
			return false;
		}
		
	}

	public String toString() {
		return studentName+" "+marks;
		
	}
}
