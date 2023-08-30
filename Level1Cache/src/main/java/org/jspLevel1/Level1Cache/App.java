package org.jspLevel1.Level1Cache;

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
    	User u1 = new User();
    	u1.setUid(1001);
    	u1.setUname("Deepak");
    	u1.setUpwd("@122");
    	
    	User u2 = new User();
    	u2.setUid(1002);
    	u2.setUname("Kumar");
    	u2.setUpwd("@122444");
    	
    	
    	User u3 = new User();
    	u3.setUid(1003);
    	u3.setUname("Singh");
    	u3.setUpwd("@12233");
    	
    	
    	User u4 = new User();
    	u4.setUid(1004);
    	u4.setUname("Deepakkumarsingh");
    	u4.setUpwd("@1225566");
    	
    	List<User> userlist = new ArrayList<>();
    	 userlist.add(u1);
    	 userlist.add(u2);
    	 userlist.add(u3);
    	 userlist.add(u4);
        
         Configuration cfg= new Configuration().configure().addAnnotatedClass(User.class);
 		SessionFactory sf = cfg.buildSessionFactory();
 		Session session = sf.openSession();
 		Transaction transaction = session.beginTransaction();
 		 for(User user : userlist) {
        	 session.save(user);
         }
 		transaction.commit();
    	
    }
}
