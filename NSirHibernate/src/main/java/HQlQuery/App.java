package HQlQuery;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select name,marks from Student where marks > 60");
		//query.addEntity(Student.class);
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List students = query.list();
		for(Object o:students) {
			Map m= (Map)o;
			System.out.println(m.get("name")+ ":" +m.get("marks"));
		}
		
		transaction.commit();
	}
}
/*
Random r = new Random();
for(int i =1;i<=50;i++) {
Student s= new Student();
s.setRollno(i);
s.setName("Name "+i);
s.setMarks(r.nextInt(100));
session.save(s);
int b = 60;
		System.out.println(marks);

		Query q=session.createQuery("select sum(marks) from Student s Where s.marks > :b");
	    q.setParameter("b", b);
		Long marks  = (Long)q.uniqueResult();
}
*/