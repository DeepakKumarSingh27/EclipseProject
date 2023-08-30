package org.jsp.JPANSIR;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpid(103);
		e.setEname("Mragank");
		e.setEmpsal(104);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();

	}
}
