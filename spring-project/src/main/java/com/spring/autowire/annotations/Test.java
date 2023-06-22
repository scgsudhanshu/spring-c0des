package com.spring.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{	
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/annotations/config.xml");
		
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println("Emp1 : "+emp1);
			
	}
	
}
