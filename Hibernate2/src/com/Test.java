package com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg=cfg.configure("hibernate.cfg.xml");
	
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session session = sf.openSession();
	
	
	Employee emp = new Employee();
	emp.setId(3);
	emp.setFname("Priti");
	emp.setLname("Avaghade");
	emp.setDesignation("Developer");
	
	session.save(emp);
	//session.persist(emp);
	session.beginTransaction().commit();
}
}
