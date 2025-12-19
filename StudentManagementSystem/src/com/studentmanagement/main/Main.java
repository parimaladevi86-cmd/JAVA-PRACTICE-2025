package com.studentmanagement.main;

import java.util.Scanner;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		while (true) {
			System.out.println("1.Add Student");
			System.out.println("2.View All Students");
			System.out.println("3.Remove Student");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Studentid:");
				int id = sc.nextInt();
				System.out.println("Enter name:");
				String name = sc.next();
				System.out.println("Enter age:");
				int age = sc.nextInt();
				System.out.println("Enter grade:");
				int grade = sc.nextInt();
				System.out.println("Enter marks:");
				int marks = sc.nextInt();
				Student student = new Student(id, name, age, grade, marks);
				service.addStudent(student);
				System.out.println("Student added successfully");
				break;

			case 2:
				System.out.println("ID | NAME | AGE | GRADE | MARKS");
				System.out.println("------------------------------------------");

				for (Student s : service.getAllStudents()) {

					System.out.println("Total students: " + service.getAllStudents().size());
					System.out.println(s);
				 
				}
                 break;
			case 3:
				System.out.println("Enter studentId to be removed:");
				int removeId= sc.nextInt();
				
				boolean removed = service.removeStudentById(removeId);
				if (removed == true) {
					System.out.println("Student removed successfully");
				} else {
					System.out.println("Student not removed");
				}
				System.out.println("------------------------------------------");
				System.out.println("Total students: " + service.getAllStudents().size());
				for (Student s : service.getAllStudents()) {
					System.out.println(s);
					
				}
				break;
			case 4:
				System.out.println("Thankyou Exiting Application");
				sc.close();
				return;
			}
		}

		/*
		 * Student student1 = new Student(101, "Shalini", 11,6,495); Student student2 =
		 * new Student(102, "Anu", 11,6,350); Student student3 = new Student(103,
		 * "Bala", 11,6,476); Student student4 = new Student(104, "Krishna", 11,6,333);
		 */
		/*
		 * service.addStudent(student1); service.addStudent(student2);
		 * service.addStudent(student3); service.addStudent(student4);
		 */

		/*
		 * System.out.println("ID | NAME | AGE | GRADE | MARKS");
		 * System.out.println("------------------------------------------"); for
		 * (Student s : service.getAllStudents()) { System.out.println(s); }
		 */

		/*
		 * System.out.println("------------------------------------------"); boolean
		 * removed =service.removeStudentById(102); if(removed=true) {
		 * System.out.println("Student removed successfully"); } else {
		 * System.out.println("Student not removed"); }
		 * System.out.println("------------------------------------------"); for
		 * (Student s : service.getAllStudents()) { System.out.println(s); }
		 */

	}

}
