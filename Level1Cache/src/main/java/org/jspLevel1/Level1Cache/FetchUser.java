package org.jspLevel1.Level1Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchUser {
	public static void main(String[] args) {


		Configuration cfg= new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session1 = sf.openSession();
		Transaction tr1 = session1.beginTransaction();
		User u1 = session1.get(User.class,1001);
		System.out.println(u1);
		tr1.commit();
		
		
		
		
		Session session2 = sf.openSession();
		Transaction tr2 = session1.beginTransaction();
		User u2 = session1.get(User.class,1002);
		System.out.println(u2);
		tr2.commit();
		
		
		
		
		Session session3 = sf.openSession();
		Transaction tr3 = session1.beginTransaction();
		User u3 = session1.get(User.class,1001);
		System.out.println(u3);
		tr1.commit();
        
	}
}
