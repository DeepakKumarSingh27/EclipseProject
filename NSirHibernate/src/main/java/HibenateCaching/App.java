package HibenateCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		//session1.get(Alian.class, 101);
		Alian a = null;

		Configuration cfg1= new Configuration().configure().addAnnotatedClass(Alian.class);
		SessionFactory sf1 = cfg1.buildSessionFactory();
		Session session1 = sf1.openSession();
		Transaction transaction1 = session1.beginTransaction();
		Query q1= session1.createQuery("from Alian where aid=101");
		q1.setCacheable(true);
;		
		a = (Alian) q1.uniqueResult();
		System.out.println(a);
		transaction1.commit();
		session1.close();

		Session session2 = sf1.openSession();
		Transaction transaction2 = session2.beginTransaction();
		Query q2= session2.createQuery("from Alian where aid=101");
		q2.setCacheable(true);

		
		a = (Alian) q2.uniqueResult();
		//a = session2.get(Alian.class, 101);
		System.out.println(a);
		transaction2.commit();
		session2.close();
	}
}
