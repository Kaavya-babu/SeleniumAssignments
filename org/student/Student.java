package org.student;

import org.department.Department;
//Asignment 2
public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Kaavya");
	}
	public void studentDept() {
		System.out.println("Student department is EEE");
	}
	public void studentId() {
		System.out.println("Student id is 18");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std= new Student();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptmentName();
		std.studentDept();
		std.studentId();
		std.studentName();

	}

}
