package com.in28Minutes.oops.level2.inheritance;

public class Employee extends Person {
	
	private String title;
	private String employer;
	private String employeeGrade;
	private String salary;
	 
 public Employee(String name, String title) {
	 super(name);
	 this.title=title;
	 System.out.println("Employee Constructor");
 }
	

public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String toString() {
		return super.toString()+"#" + " " + title +" "+employer +" "+employeeGrade ;
	}
}
