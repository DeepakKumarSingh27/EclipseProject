package MappinginHibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main( String[] args ) throws InterruptedException
	{

//		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
//		EntityManager em = emf.createEntityManager();
//		Alien a = em.find(Alien.class, 1);
//		System.out.println(a);
//      
		Alien a= new Alien();
		a.setAid(11);
		a.setAname("dk");
		a.setTech("saol");
		
		Session s = new Configuration().configure().addAnnotatedClass(Alien.class).buildSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		s.save(a);
		t.commit();
		s.close();


	}
}
