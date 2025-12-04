package com.in28Minutes.oops.level2.inheritance;
 
public class Student extends Person{
	
	
	public Student(String name,String College) {
		super(name);
		 this.college=college;
	}

	private String college;
	private String year;
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
public String toString() {
	return String.format("name: -[%s] email: -[%s]",getName(),getEmail());
	
}

 
}
