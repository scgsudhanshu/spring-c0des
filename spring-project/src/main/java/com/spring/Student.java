package com.spring;

public class Student
{	String studentName;
	int studentRollno;
	String studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}
	public int getStudentRollno() {
		return studentRollno;
	}
	public void setStudentRollno(int studentRollno) {
		System.out.println("Setting Student Roll no");
		this.studentRollno = studentRollno;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address");
		this.studentAddress = studentAddress;
	}
	public Student(String studentName, int studentRollno, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentRollno = studentRollno;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollno=" + studentRollno + ", studentAddress="
				+ studentAddress + "]";
	}
	
	public void init()
	{
		System.out.println("Inside Init Method"); 	
	}
	
	public void destroy()
	{
		System.out.println("Inside Destroy");
	}
	
	
}

