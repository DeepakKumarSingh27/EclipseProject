package org.jsp.mapping.ManyToManyMapping2;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Product p1 = new Product();
		p1.setPid(1);
		p1.setPname("maja");

		Product p2 = new Product();
		p2.setPid(2);
		p2.setPname("pepsi");

		Product p3 = new Product();
		p3.setPid(3);
		p3.setPname("cocacola");

		Customer c1 = new Customer();
		c1.setCid(10);
		c1.setCname("Deepak");

		Customer c2 = new Customer();
		c2.setCid(20);
		c2.setCname("Dks");


		Customer c3 = new Customer();
		c3.setCid(30);
		c3.setCname("kumar");



		p1.setCustomers(new ArrayList<Customer>(Arrays.asList(c1, c2, c3)));
		p2.setCustomers(new ArrayList<Customer>(Arrays.asList(c1, c2, c3)));
		p3.setCustomers(new ArrayList<Customer>(Arrays.asList(c1, c2, c3)));
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Customer.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();

		Transaction tr= session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p2);
		tr.commit();











	}
}
