package org.jsp.mapping.OneTOneMapping2;
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
    	p.setPprice(10);
    	
    	Customer cst = new Customer();
    	cst.setCid(10);
    	cst.setCname("Deepak");
    	cst.setcContact(88888338383l);
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Customer.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session =sf.openSession();
    	Transaction tr= session.beginTransaction();
    	session.save(p);
    	session.save(cst);
         tr.commit();
    }
}
