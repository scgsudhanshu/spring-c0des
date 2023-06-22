package com.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject 
{	
	String Sname ;

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	@Override
	public String toString() {
		return "Subject [Sname=" + Sname + "]";
	}

	@PostConstruct
	public void start()
	{
		System.out.println("Starting Method");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Ending Method");
	}
	
}
