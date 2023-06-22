package com.spring.ci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ci/config.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(" P : "+p);
	}

}
