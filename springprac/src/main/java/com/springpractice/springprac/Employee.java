package com.springpractice.springprac;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee {
	private String EName;
	private String ENo;
	private String EDept;
	private Address address;
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		System.out.println("Setting1");
		EName = eName;
		
	}
	public String getENo() {
		return ENo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setENo(String eNo) {
		ENo = eNo;
	}
	public String getEDept() {
		return EDept;
	}
	public void setEDept(String eDept) {
		EDept = eDept;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [EName=" + EName + ", ENo=" + ENo + ", EDept=" + EDept + ", address=" + address + "]";
	}
	public Employee(String eName, String eNo, String eDept, Address address) {
		super();
		System.out.println("Parameter constructor called");
		
		
		EName = eName;
		ENo = eNo;
		EDept = eDept;
		this.address = address;
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Init using annotation");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Destroy using annotation");
	}
	public Employee() {
		super();
		System.out.println("Constructor called");
		// TODO Auto-generated constructor stub
	}
	
	
	
}
