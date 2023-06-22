package com.spring.autowire;

public class Emp 
{	
	private Address address ;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

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
