package org.jsp.mapping.ManyToManyMapping;
import java.util.ArrayList;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Book b=new Book();
        b.setbId(1234);
        b.setbName("WhereAbouts");
        b.setbAuthor("Jhumpa Lahiri");
        
        Book b1=new Book();
        b1.setbId(2344);
        b1.setbName("A Passage to India");
        b1.setbAuthor("E.M.Foster");
        
        Book b2=new Book();
        b2.setbId(7436);
        b2.setbName("A Revenue Stamp");
        b2.setbAuthor("Amrita Pritam");
    	
        Student s=new Student();
        s.setsId(1);
        s.setsName("Raj");
        s.setsContact(999888777l);
        
        Student s1=new Student();
        s1.setsId(2);
        s1.setsName("Raja");
        s1.setsContact(777888999l);
        
        Student s2=new Student();
        s2.setsId(3);
        s2.setsName("Rajesh");
        s2.setsContact(666777888l);
        

        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        
        b.setStudents(new ArrayList<Student>(Arrays.asList(s,s1,s2)));
        b1.setStudents(new ArrayList<Student>(Arrays.asList(s,s1,s2)));
        b2.setStudents(new ArrayList<Student>(Arrays.asList(s,s1,s2)));
        session.save(s);
        session.save(s1);
        session.save(s2);
        session.save(b);
        session.save(b1);
        session.save(b2);
        Transaction t=session.beginTransaction();
        t.commit();
    }
}
