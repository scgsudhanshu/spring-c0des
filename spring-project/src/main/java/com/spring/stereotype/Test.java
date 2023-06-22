package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String args[])
	{
		ApplicationContext con =
				new ClassPathXmlApplicationContext("com/spring/stereotype/config.xml");
		Student student = con.getBean("stud",Student.class);
		//System.out.println(student);
		//System.out.println(student.getPhone());
		Student student2 = con.getBean("stud",Student.class);
		System.out.println("Object 1:"+student.hashCode());
		System.out.println("Object 1:"+student2.hashCode());
	}
}
