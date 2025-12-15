package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.beans.*;
import com.demo.beans.Product;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=session.get(PerishableProduct1.class, 11);
		Product p1=session.get(NonPerishable1.class, 12);
		System.out.println(p);
		System.out.println(p1);
		tr.commit();
		session.close();
		sf.close();

	}

}
