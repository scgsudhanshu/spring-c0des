package com.spring.ci;

public class Person 
{	String name;
	int personId;
	Certi certi;
	public Person(String name , int personId , Certi certi)
	{

		this.name = name;
		this.personId=personId;
		this.certi = certi;
	}
	
	@Override
	public String toString()
	{
		return this.name + ":"+this.personId+": certi :"+this.certi.x;
	}
	
}
