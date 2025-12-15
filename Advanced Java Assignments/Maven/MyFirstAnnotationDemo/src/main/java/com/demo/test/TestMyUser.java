package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.*;


public class TestMyUser {
   public static void main(String args[]) {
	   SessionFactory sf = new Configuration().configure().buildSessionFactory();
	   Session session = sf.openSession();
	   Transaction tr = session.beginTransaction();
	 //  MyNewUser u1 = new MyNewUser(17,"rushi","rushi267@gmail.com");
	 //  MyNewUser u2 = new MyNewUser(18,"saurabh","sss11@gmail.com");
		MyProduct1 p1=  new MyProduct1("lays22",11,45);
		MyProduct1 p2=new MyProduct1("nachos333",23,123);
		//session.save(u1);
		//session.save(u2);
		session.save(p1);
		session.save(p2);
		tr.commit();
		session.close();
		sf.close();

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
