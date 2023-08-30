package org.jsp.mapping.OneToManyMapping;
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
    	Person p = new Person();
    	p.setPid(101);
    	p.setPname("john");
    	p.setPcontact(12345678l);
    	Vehicle v = new Vehicle();
    	v.setVid(1234);
    	v.setCname("RE");
    	Vehicle v1 = new Vehicle();
    	v1.setVid(5678);
    	v1.setCname("BMW");
    	v.setPerson(p);
         v1.setPerson(p);
    	List< Vehicle> vlist = new ArrayList<Vehicle>();
    	vlist.add(v);
    	vlist.add(v1);
    	p.setVehiclelist(vlist);
//    	List<Vehicle> vegicleList = Person.getVehiclelist();
//    	for(Vehicle veh : vegicleList) {
//    		System.out.println(veh.getVid()+" "+veh.getCname()+" "+veh.getPerson());
//    	}
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Vehicle.class).addAnnotatedClass(Person.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session =sf.openSession();
    	Person person =  session.get(Person.class, 101);

    	Transaction tr= session.beginTransaction();
    	session.save(v);
    	session.save(v1);
    	session.save(p);
         tr.commit();
    }
}
