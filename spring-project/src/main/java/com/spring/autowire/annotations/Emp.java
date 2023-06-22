package com.spring.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp 
{	@Autowired
	@Qualifier("address2")
	private Address address ;

	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Calling Setter Injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	//@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Constructor called : ");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}
