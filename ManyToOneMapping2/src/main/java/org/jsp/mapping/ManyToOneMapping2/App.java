package org.jsp.mapping.ManyToOneMapping2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
    	Product p = new Product();
    	p.setPid(1);
    	p.setPname("maja");
    	
    	Customer c1 = new Customer();
    	c1.setCid(10);
    	c1.setCname("Deepak");
         c1.setP(p); 	
    	Customer c2 = new Customer();
    	c2.setCid(20);
    	c2.setCname("munna");
    	c2.setP(p);
    	
    	Customer c3 = new Customer();
    	c3.setCid(30);
    	c3.setCname("kumar");
    	c3.setP(p);
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Customer.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session =sf.openSession();

    	Transaction tr= session.beginTransaction();
    	session.save(p);
    	session.save(c1);
    	session.save(c2);
    	session.save(c2);
         tr.commit();
    }
}
