package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config.xml");
        context.registerShutdownHook();
        Student student1 =(Student) context.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
        Student student3 = (Student) context.getBean("student3");
        System.out.println(student3);
        Teacher teacher1 = (Teacher) context.getBean("teacher1");
        System.out.println(teacher1);
        Subject subject1 = (Subject) context.getBean("subject1");
        System.out.println(subject1);
        
    }
}
