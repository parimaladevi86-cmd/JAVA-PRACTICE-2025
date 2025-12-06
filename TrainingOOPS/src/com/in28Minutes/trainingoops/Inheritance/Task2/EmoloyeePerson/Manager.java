package com.in28Minutes.trainingoops.Inheritance.Task2.EmoloyeePerson;

public class Manager extends Employee {
	private String department;
	private int teamSize;
	
	
	public Manager(String name, int age, String employeeId, int salary, String department, int teamSize) {
		super(name, age, employeeId, salary);
		this.department = department;
		this.teamSize = teamSize;
	}
	 public void display() {
	    	System.out.println("Person Name:"+getName());
	    	System.out.println("Person Age:"+getAge());
	    	System.out.println("EmployeeId:"+getEmployeeId());
	    	System.out.println("Salary:"+getSalary());
	    	System.out.println("department:"+department);
	    	System.out.println("teamSize:"+teamSize);
	    }
}
