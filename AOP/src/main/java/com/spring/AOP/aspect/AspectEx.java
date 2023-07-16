package com.spring.AOP.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectEx {

	@Before("execution(* com.spring.AOP.services.PaymentServiceImpl.makePayemnt(..))")
	public void PrintBefore()
	{
		System.out.println("Print Before Method ........");
		System.out.println("Payment Started ........");
	}
	
	@After("execution(* com.spring.AOP.services.PaymentServiceImpl.makePayemnt(..))")
	public void PrintAfter()
	{
		System.out.println("Print After Method ........");
		System.out.println("Payment done ........");
	}
}
