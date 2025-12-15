package com.demo.test;

import com.demo.beans.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMyUser {
   public static void main(String args[]) {
	    SessionFactory sf = new Configuration().configure().buildSessionFactory();
	  /*  Session session = sf.openSession();
	    Transaction tr = session.beginTransaction();
	    Address a1 = new Address(102,"S.B. Road","pune","411016");
	    MyUser m1 = new MyUser(1,"saurabh","9999999",a1);
	    MyUser m2 = new MyUser(2,"omkar","777756",a1);
	    
	    session.save(m1);
        session.save(m2);	
        tr.commit();
        session.close();*/
        
        Session session2 = sf.openSession();
        Transaction tr2 = session2.beginTransaction();
        System.out.println("before get");
        MyUser u1 = session2.load(MyUser.class,2);
        System.out.println("after get");
        System.out.println(u1);
        tr2.commit();
        session2.close();
        sf.close();
        
        
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
