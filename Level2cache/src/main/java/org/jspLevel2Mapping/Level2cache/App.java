package org.jspLevel2Mapping.Level2cache;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
	public static void main( String[] args )
	{
		//		Product p1 = new Product();
		//		p1.setPid(10001);
		//		p1.setPname("pwder");
		//		p1.setPprice(100);
		//
		//		Product p2 = new Product();
		//		p2.setPid(10002);
		//		p2.setPname("milk");
		//		p2.setPprice(1002);
		//
		//		Product p3 = new Product();
		//		p3.setPid(10003);
		//		p3.setPname("bread");
		//		    	p3.setPprice(10011);
		//
		//
		//		   	Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class);
		//		    	SessionFactory sf = cfg.buildSessionFactory();
		//		    	Session session = sf.openSession();
		//		    	Transaction tr = session.beginTransaction();
		//		   	List<Product> prodlist = new ArrayList<>();
		//		    	prodlist.add(p1);
		//		    	prodlist.add(p2);
		//		    	prodlist.add(p3);
		//		         for(Product p :prodlist) {
		//		        	 session.save(p);
		//		         }
		//		    	tr.commit();


		Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory sf = cfg.buildSessionFactory();


		System.out.println(" **************Client1*********** ");
		Session session1 = sf.openSession();
		Transaction tr1 = session1.beginTransaction();
		
		Product u1 = session1.get(Product.class,10001);
		System.out.println(u1);
		tr1.commit();
		session1.close();


		System.out.println(" ****************Client2************** ");
		Session session2 = sf.openSession();
		Transaction tr2 = session2.beginTransaction();
		Product u2 = session2.get(Product.class,10002);
		System.out.println(u2);
		tr2.commit();
		session2.close();


		System.out.println("***************Client3*********");
		Session session3 = sf.openSession();
		Transaction tr3 = session3.beginTransaction();
		Product u3 = session3.get(Product.class,10003);
		System.out.println(u3);
		tr3.commit();
		session3.close();





	}
}
