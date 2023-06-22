package com.springpractice.springprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppWOXml {

	public static void main(String args[])
	{
		System.out.println("without using XML");
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
//		EmployeeWOXml employeeWOXml = (EmployeeWOXml) context.getBean("employeeWOXml");
		EmployeeWOXml employeeWOXml = (EmployeeWOXml) context.getBean("getEmployee");

		System.out.println(employeeWOXml);
	}
}
