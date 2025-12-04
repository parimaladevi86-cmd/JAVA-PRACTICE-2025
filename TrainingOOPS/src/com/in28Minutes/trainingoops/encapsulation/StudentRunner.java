package com.in28Minutes.trainingoops.encapsulation;

public class StudentRunner {

	public static void main(String[] args) {
		 Student student=new Student("Sharvin",99);
		 System.out.println(student);
		 boolean ok1 =student.setMarks(-50);
		 System.out.println("Setting -50:"+ok1+" |"+student);
		 boolean ok2=student.setMarks(0);
		 System.out.println("Setting 0:"+ok2+" |"+student);
		 try {
		 boolean ok3=student.setStudentName(" ");
		 System.out.println("Setting empty name:"+ ok3 +" |"+student);
		 }
		 catch(IllegalArgumentException ex){
			 System.out.println("Failed to create student1: " + ex.getMessage()); 
		 }
		  
		 
		  
			 
	}

}
