package com.Admin.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AirlineAdmin_Employee")
public class Employee {

	@Id
	private String EmployeeId;
	private String EmployeeName;
	private String EmployeeDept;
	
	private String EmployeeAddr;
	private String EmployeeContact;
	private Date DOB;
	private String qualifications;
	private String documents;
	private String UserName;
	private String Emppassword;
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeDept() {
		return EmployeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		EmployeeDept = employeeDept;
	}
	public String getEmployeeAddr() {
		return EmployeeAddr;
	}
	public void setEmployeeAddr(String employeeAddr) {
		EmployeeAddr = employeeAddr;
	}
	public String getEmployeeContact() {
		return EmployeeContact;
	}
	public void setEmployeeContact(String employeeContact) {
		EmployeeContact = employeeContact;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmppassword() {
		return Emppassword;
	}
	public void setEmppassword(String emppassword) {
		Emppassword = emppassword;
	}
	
	
}
