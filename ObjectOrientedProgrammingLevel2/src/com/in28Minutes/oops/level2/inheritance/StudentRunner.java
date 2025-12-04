package com.in28Minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		/*
		 * Student student = new Student(); student.setName("Parimala");
		 * student.setEmail("example@gmail.com"); System.out.println(student);
		 */
		 
		/*
		 * Person person = new Person(); person.setName("Sharvin");
		 * person.setEmail("sharvin@gmail.com"); person.setPhoneNumber("7065437898");
		 * System.out.println(person);
		 */
		 Person person = new Person("tom");
		 Employee employee = new Employee("devi","sr.manager");
			/*
			 * employee.setName("parimala"); employee.setEmployeeGrade("A");
			 * employee.setPhoneNumber("123456779");
			 * employee.setTitle("Senior Technical Lead"); employee.setEmployer("hhhh");
			 * employee.setEmployeeGrade("A"); employee.setSalary("1000000");
			 */
		 System.out.println(person);
		 System.out.println(employee);
		 
		 

	}

}
