package org.jspLevel1OneToOneMapping.Level1OneToOneMapping2;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Restaurant rs=new Restaurant();
    	rs.setrId(101);
    	rs.setrName("Udupi Food Hub");
    	rs.setrLocation("BTM Layout");
    	
    	Food f1=new Food();
    	f1.setfCode(1001);
    	f1.setfName("Masala Dosa");
    	f1.setfPrice(45);
    	f1.setRestaurant(rs);
    	
    	Food f2=new Food();
    	f2.setfCode(1002);
    	f2.setfName("Paneer Masala");
    	f2.setfPrice(220);
    	f2.setRestaurant(rs);
    	
    	Food f3=new Food();
    	f3.setfCode(1003);
    	f3.setfName("Veg Meal");
    	f3.setfPrice(100);
    	f3.setRestaurant(rs);
    	
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Restaurant.class).addAnnotatedClass(Food.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tr=s.beginTransaction();

        List<Food> food=new ArrayList<Food>();
        food.add(f1);
        food.add(f2);
        food.add(f3);
        for(Food f: food)
        {
        	s.save(f);
        }
        s.save(rs);
        tr.commit();
        s.close();
        
    }
}