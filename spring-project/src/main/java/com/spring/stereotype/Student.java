package com.spring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;
@Component("stud")
public class Student 
{
	@Value("Sudhanshu")
	private String studentName ;
	@Value("10")
	private int rollno;
	@Value("#{MyList}")
	List<String> phone;
	
	public String getStudentName() {
		return studentName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollno=" + rollno + ", phone=" + phone + "]";
	}
	
	
	
}
