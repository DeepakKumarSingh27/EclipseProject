package com.springcore.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
     ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotations/aotoconfig.xml");
     
     Emp emp1 = context.getBean(Emp.class,"emp1");
     System.out.println(emp1);
     
     
	}

}
