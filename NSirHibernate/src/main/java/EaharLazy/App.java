package EaharLazy;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
     
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alian.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Alian a1= session.get(Alian.class, 1);
		System.out.println(a1.getAname());
		
		
//		Collection<Laptop> laps = a1.getLaps();
//		for(Laptop l : laps) {
//			System.out.println(l);
//		}
		
		session.getTransaction().commit();
		
	}

}
