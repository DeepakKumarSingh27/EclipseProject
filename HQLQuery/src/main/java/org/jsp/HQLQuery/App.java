package org.jsp.HQLQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class App 
{
	public static void main( String[] args )
	{

		Configuration cfg= new Configuration().configure().addAnnotatedClass(Orders.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		//Query query = session.createQuery("from Orders");
		//Query query = session.createQuery("from Orders where destination like '%btm%' ");
		//Query query = session.createQuery("from Orders    ORDER BY destination DESC");
		//Query query = session.createQuery("from Orders GROUP BY oid");
		SQLQuery query = session.createNativeQuery("select * from Orders ",Orders.class);

		List<Orders> olist =query.list();
		for(Orders o : olist) {
			System.out.println(o);         }
		transaction.commit();

	}
}
/*
Orders o1 = new Orders();
o1.setOid(101);
o1.setOname("pular");
o1.setDestination("jayanagar");
Orders o2= new Orders();
o2.setOid(102);
o2.setOname("masaladosa");
o2.setDestination("btmlayout");
session.save(o1);
		session.save(o2);
 */