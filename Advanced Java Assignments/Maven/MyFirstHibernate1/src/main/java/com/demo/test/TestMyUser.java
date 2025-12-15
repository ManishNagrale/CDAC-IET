package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyNewUser;
import com.demo.beans.MyProduct;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		MyNewUser u1=new MyNewUser(15,"dhruv", "kkk@gmail.com");
		MyNewUser u2=new MyNewUser(16,"jayant", "aaa@gmail.com");
	//	MyProduct p1=new MyProduct("table",23,54000);
	//	MyProduct p2=new MyProduct("chair",30,4000);
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		session.save(u1);
		session.save(u2);
		//session.save(p1);
		//session.save(p2);
		tr.commit();
		session.close();
		sf.close();
		
	}

}
