package com.spring.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class MainClass 
{	public static void main(String args[])
	{
		System.out.println("In Main Class >>>");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/config.xml");
        Employees employee1 = (Employees) context.getBean("employee1");
        System.out.println("Name : >>>>"+employee1.getName());
        System.out.println("Phone : >>>>"+employee1.getPhones());
        System.out.println("Project : >>>>"+employee1.getProject());
        A temp=(A) context.getBean("aclass");
        System.out.println("A >>"+temp);
        
	}

}
