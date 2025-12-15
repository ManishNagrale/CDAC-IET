package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable2;
import com.demo.beans.PerishableProduct2;
import com.demo.beans.Product5;

public class TestMappedBySuperClass {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	
	Product5 p=new PerishableProduct2(11,"lays",34,45,LocalDate.of(2025,11,11),LocalDate.of(2025,12,11));
	Product5 p1=new NonPerishable2(12,"chair",37,4567,LocalDate.of(2025,11,11),11);
	
	session.save(p);
	session.save(p1);
	tr.commit();
	session.close();
	sf.close();
}
}
