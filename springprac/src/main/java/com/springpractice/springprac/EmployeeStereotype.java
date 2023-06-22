package com.springpractice.springprac;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class EmployeeStereotype {

	@Value("Sudhanshu")
	private String EmpName;
	@Value("4371")
	private String Empno;
	@Value("#{temp}")
	public List<String> Mobile;
	@Value("#{T(com.springpractice.springprac.Address).HouseNo}")
	private String Mobile2;
	
	public List<String> getMobile() {
		return Mobile;
	}
	public void setMobile(List<String> mobile) {
		Mobile = mobile;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpno() {
		return Empno;
	}
	public void setEmpno(String empno) {
		Empno = empno;
	}
	public EmployeeStereotype(String empName, String empno) {
		super();
		EmpName = empName;
		Empno = empno;
	}
	public EmployeeStereotype() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeStereotype [EmpName=" + EmpName + ", Empno=" + Empno + ", Mobile=" + Mobile + ", Mobile2="
				+ Mobile2 + "]";
	}
	
	
	
	
}
