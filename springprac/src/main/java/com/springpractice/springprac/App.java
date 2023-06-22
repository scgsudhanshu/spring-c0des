package com.springpractice.springprac;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Using Annotations for Life Cycle Methods");
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springpractice/springprac/config.xml");
        //Employee emp1 = (Employee) context.getBean("Emp1");
        //Employee emp2 = (Employee) context.getBean("Emp2");
        Employee emp3 = (Employee) context.getBean("Emp3");
        context.registerShutdownHook();
        
        //System.out.println("Employee"+emp2);
        //System.out.println("Employee"+emp1);
        System.out.println("Employee"+emp3);
        
    }
}
