package com.aop.services;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void makePayment(int amount) {
		System.out.println("Amount Debited...");
		
		System.out.println("Amount Credited...");
	}

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		
	}

}
