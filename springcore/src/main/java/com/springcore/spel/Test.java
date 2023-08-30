package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)  {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/stelconfig.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1);
     
		
	}

}
/*
SpelExpressionParser temp = new SpelExpressionParser();
//Expression expression = (Expression) temp.parseExpression("22+355");
//System.out.println(expression.getValue());
*/


