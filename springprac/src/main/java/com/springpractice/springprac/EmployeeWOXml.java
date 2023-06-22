package com.springpractice.springprac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class EmployeeWOXml {

	//@Value("Raghav")
	private String EName;
	//@Value("500")
	private String Eno;
	
	private Salary salary;
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public String getEno() {
		return Eno;
	}
	public void setEno(String eno) {
		Eno = eno;
	}
	public EmployeeWOXml() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeWOXml(String eName, String eno, Salary salary) {
		super();
		EName = eName;
		Eno = eno;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeWOXml [EName=" + EName + ", Eno=" + Eno + "]";
	}
	
}
