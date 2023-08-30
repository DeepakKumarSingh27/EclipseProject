package com.org.jsp.hibernate.mapping.ManyToManyEmp;

import java.util.ArrayList;
import java.util.Arrays;
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
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Projects.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tr=s.beginTransaction();
        
    	Employee e1=new Employee();
    	e1.seteId(101);
    	e1.seteName("ABC");
    	e1.seteDept("FrontEnd Department");
    	e1.setTeam("Team-1");
    	
    	Employee e2=new Employee();
    	e2.seteId(102);
    	e2.seteName("PRQ");
    	e2.seteDept("Back End And Database Department");
    	e2.setTeam("Team-3");
    	
    	Employee e3=new Employee();
    	e3.seteId(103);
    	e3.seteName("XYZ");
    	e3.seteDept("Testing Department");
    	e3.setTeam("Team-2");
    	
    	
    	 List<Employee> employees=new ArrayList<Employee>();
         employees.add(e1);
         employees.add(e2);
         employees.add(e3);
         for(Employee e:employees)
         {
         	s.save(e);
         }
    	
    	Projects p1=new Projects();
    	p1.setpId(1001);
    	p1.setpName("Library Managment System");
    	p1.setTeam("Team-1");
    	p1.setEmployees(employees);
   
    	
    	Projects p2=new Projects();
    	p2.setpId(1002);
    	p2.setpName("Hotel Managment System");
    	p2.setTeam("Team-2");
    	p2.setEmployees(employees);
    	
    	Projects p3=new Projects();
    	p3.setpId(1003);
    	p3.setpName("Daily Need Kart");
    	p3.setTeam("Team-3");
    	p3.setEmployees(employees);
     
        e1.setProjects(new ArrayList<Projects>(Arrays.asList(p1,p2,p3)));
        e2.setProjects(new ArrayList<Projects>(Arrays.asList(p1,p2,p3)));
        e3.setProjects(new ArrayList<Projects>(Arrays.asList(p1,p2,p3)));
        
        List<Projects> projects=new ArrayList<Projects>();
        projects.add(p1);
        projects.add(p2);
        projects.add(p3);
        for(Projects p: projects)
        {
        	s.save(p);
        }    	
        tr.commit();
        s.close();
    }
}
