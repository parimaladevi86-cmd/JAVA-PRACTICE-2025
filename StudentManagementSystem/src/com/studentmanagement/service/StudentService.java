package com.studentmanagement.service;

import java.util.ArrayList;

import com.studentmanagement.model.Student;
import com.studentmanagement.repository.StudentRepository;

public class StudentService {
	private StudentRepository repo = new StudentRepository(); 
	
	
	public void addStudent(Student student) {
		repo.addStudent(student);
	}
	
	public ArrayList<Student> getAllStudents() {
		return repo.getAllStudents();
		 
	 }
	

	public boolean removeStudentById(int id) {
		ArrayList<Student> students = repo.getAllStudents();
  System.out.println("inside service");
		 for(Student s:students) {
			 if(s.getStudentId()==id) {
				 System.out.println("inside service ids are equal");
				 repo.removeStudent(s); 
				 return true;
			 }
				 
		 }
		 return false;
		
	}
}
