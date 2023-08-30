package HibernateLifeCycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
public static void main(String[] args) {
	Configuration cfg= new Configuration().configure().addAnnotatedClass(Laptop.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction transaction = session.beginTransaction();
	Laptop l = new Laptop();
	Laptop lap = session.load(Laptop.class, 51);
	System.out.println(lap);
}
}
/*
Laptop l1 = new Laptop();
l1.setId(102);
l1.setBrand("Hp");
l1.setPrice(200);
session.save(l1);

l.setId(54);
	l.setBrand("lenavo");
	l.setPrice(800);
	session.save(l);
	l.setPrice(750);
	session.remove(l);
	transaction.commit();
	session.detach(l);
	l.setPrice(100);
*/