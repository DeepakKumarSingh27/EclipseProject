package org.jsp.Product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
 //   	Product p = new Product();
//    	p.setPid(2);
//    	p.setPname("mengo");
//    	p.setPprice(1001);
    	Configuration cfg= new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Product pro = session.get(Product.class, 1);
		System.out.println(pro);
//		System.out.println("product id is "+pro.getPid());
//		System.out.println("product id Name "+pro.getPname());
//		System.out.println("product id price "+pro.getPprice());

		//session.save(pro);
		transaction.commit();
    }
}
