package com.studentmanagement.repository;

import java.util.ArrayList;

import com.studentmanagement.model.Student;

public class StudentRepository {
	private ArrayList<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
	}

	public ArrayList<Student> getAllStudents() {
		return students;

	}

	public void removeStudent(Student student) {
		students.remove(student);
	}

}
