package org.jsp.mapping.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	AadharCard card = new AadharCard();
    	card.setAadharid(123456l);
    	card.setContact(1111112223443l);
    	Person p = new Person();
    	p.setPid(1);
    	p.setPname("Abc");
    	p.setContact(111222222l);
    	p.setAid(card);
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(AadharCard.class).addAnnotatedClass(Person.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session =sf.openSession();
    	Transaction tr= session.beginTransaction();
    	session.save(card);
    	session.save(p);
         tr.commit();
    }
}
