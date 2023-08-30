package org.jsp.hibernate_demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.setEmpid(1);
		e.setEmpname("Deepak");
		e.setEmpsalary(1001);
		Configuration cfg= new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(e);
		transaction.commit();
		
	}

}
