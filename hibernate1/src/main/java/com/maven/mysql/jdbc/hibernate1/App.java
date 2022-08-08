package com.maven.mysql.jdbc.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Student std1 = new Student();
		//std1.setId(2);
		std1.setName("Tom");
		std1.setCity("Warangal");
		
		Student std2 = new Student();
		std2.setId(2);
		std2.setName("Anny");
		std2.setCity("Hyderabad");
		s.save(std1);
		s.save(std2);
		System.out.println("Student details are added");
		tx.commit();
		s.close();
	}
}
