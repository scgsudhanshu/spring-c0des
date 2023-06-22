package com.spring.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test 
{
	public static void main(String args[]) throws Exception
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/spel/config.xml");
	
	Demo d1= context.getBean("demo",Demo.class);
	System.out.println("Demo : "+d1);
	
	SpelExpressionParser temp = new SpelExpressionParser();
	Expression expression =  temp.parseExpression("22+34+51");
	System.out.println("Expression : "+expression.getValue());
	
	
	}
	
	
}
