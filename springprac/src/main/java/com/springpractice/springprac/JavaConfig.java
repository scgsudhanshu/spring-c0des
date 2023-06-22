package com.springpractice.springprac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//replacing the context-component-scan from xml
@Configuration
//@ComponentScan(basePackages="com.springpractice.springprac") --use only for component Annotation 
public class JavaConfig {

	@Bean
	public Salary getSalary()
	{
		return new Salary();
		
	}
	
	@Bean
	public EmployeeWOXml getEmployee()
	{
		EmployeeWOXml emp = new EmployeeWOXml("Aditya","36",getSalary());
		return emp;
	}
}
