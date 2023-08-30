package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class myAspect {

	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void pringBefore() {
		System.out.println("Payment Started...");

	}
	
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void pringAfter() {
		System.out.println("Payment done...");

	}

}
