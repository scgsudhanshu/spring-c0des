package com.spring.AOP.services;

public class PaymentServiceImpl implements PaymentService {

	public void makePayemnt(int amount) {
		
		System.out.println(amount +" Amount Debited ........");
		
		System.out.println(amount + " Amount Credited ........");
		
	}

	
}
