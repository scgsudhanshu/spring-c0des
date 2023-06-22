package com.springpractice.springprac;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStereotype {

	public static void main(String args[])
	{
		System.out.println("Using Stereotypes Annotations");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springpractice/springprac/configStereo.xml");
		EmployeeStereotype emp = (EmployeeStereotype) context.getBean("emp");
		EmployeeStereotype emp2 = (EmployeeStereotype) context.getBean("emp");
		System.out.println(emp);
		System.out.println(emp.getMobile());
		System.out.println(emp.getMobile().getClass());
		System.out.println(emp.getMobile().getClass().getName());
		
		//System.out.println(emp.hashCode());
		//System.out.println(emp2.hashCode());
	}
}
