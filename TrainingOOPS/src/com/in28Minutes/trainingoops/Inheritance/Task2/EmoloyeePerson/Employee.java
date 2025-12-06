package com.in28Minutes.trainingoops.Inheritance.Task2.EmoloyeePerson;

public class Employee extends Person {
	private String employeeId;
	private int salary;

	public Employee(String name, int age, String employeeId, int salary) {
		super(name, age);
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
    public void display() {
    	System.out.println("Person Name:"+getName());
    	System.out.println("Person Age:"+getAge());
    	System.out.println("EmployeeId:"+employeeId);
    	System.out.println("Salary:"+salary);
    }
}
