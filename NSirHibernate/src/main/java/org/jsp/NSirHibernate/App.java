package org.jsp.NSirHibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		AlianName an = new AlianName();
		an.setFname("Deepak");
		an.setMname("kumar");
		an.setLname("Singh");
		
		Alian telusko = new Alian();
		telusko.setAid(101);
		telusko.setColor("Green");
		telusko.setAname(an);

		Configuration cfg= new Configuration().configure().addAnnotatedClass(Alian.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(telusko);
		telusko = (Alian)session.get(Alian.class,101);
		
		transaction.commit();
		System.out.println(telusko);
	}
}
