package com.studentmanagement.model;

public class Student {

	private int studentId;
	private String name;
	private int age;
	private int grade;
	private int marks;

	public Student(int studentId, String name, int age, int grade, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return studentId + "|" + name + "|" + age + "|" + grade + "|" + marks;

	}

}
