package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean ,DisposableBean 
{	
	String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Teacher [Name=" + Name + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Teacher has destroyed ");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Teacher init : ");
	}

}
