package com.springcore.ci;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		ApplicationContext contraint = new ClassPathXmlApplicationContext("ci.xml");
		Person p = (Person) contraint.getBean("person");
		System.out.println(p);
		Adition add = (Adition) contraint.getBean("add");
         add.doSum();
     
	}
}
