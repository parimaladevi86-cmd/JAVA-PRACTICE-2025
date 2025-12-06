package com.in28Minutes.trainingoops.Inheritance.Task2.EmoloyeePerson;

public class PersonRunner {

	public static void main(String[] args) {
		 Person person = new Person("spiderman",25);
		 Employee employee = new Employee("Sharvin",11, "1234", 100000);
		 Manager manager = new Manager("Devi",25, "1234", 100000,"IT",10);
		 
		 System.out.println("Person Details");
		 System.out.println("=================");
		 person.display();
		 System.out.println( );
		 
		 System.out.println("Employee Details");
		 System.out.println("=================");
		 employee.display();
		 System.out.println( );
		 
		 System.out.println("Manager Details");
		 System.out.println("=================");
		 manager.display();
		 System.out.println( );
	}

}
