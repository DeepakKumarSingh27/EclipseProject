package org.jsp.hibernatedemo;

import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
     Configuration cfg = new Configuration().configure();
     System.out.println(cfg.buildSessionFactory());
	}

}
