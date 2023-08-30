package org.jspLevel1OneToOneMapping.Level1OneToOneMapping2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch {
public static void main(String[] args) {
	Configuration cfg=new Configuration().configure().addAnnotatedClass(Restaurant.class).addAnnotatedClass(Food.class);
	SessionFactory sf=cfg.buildSessionFactory();
	System.out.println("******************CLIENT 1*******************");
	Session s1=sf.openSession();
	Transaction tr1=s1.beginTransaction();
	Restaurant rs=s1.get(Restaurant.class, 101);
	Food f1=s1.get(Food.class, 1001);
	Food f3=s1.get(Food.class, 1003);
	System.out.println(rs);
	System.out.println(f1);
	System.out.println(f3);
	tr1.commit();
	s1.close();
	
	System.out.println("******************CLIENT 2********************");
	Session s2=sf.openSession();
	Transaction tr2=s2.beginTransaction();
	Food f2=s2.get(Food.class, 1001);
	System.out.println(f2);
	tr2.commit();
	s2.close();
}
}