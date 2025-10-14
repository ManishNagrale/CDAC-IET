package com.demo.beans;

import java.util.Date;

public class Person {

	static int scount,vcount,ccount;
	static {
		scount =0;
		vcount=0;
		ccount=0;
	}
	private String pid;
	private String pname;
	private Date bdate;
	
	public Person() {
		System.out.println("In Person's default constructor");
		pid = generateId("s");
		pname = null;
		bdate=null;
		
	}
	public Person(String emptype,String pname,Date bdate) {
		System.out.println("In Person's parameterised constructor");
		pid = generateId(emptype);
		this.pname=pname;
		this.bdate=bdate;
	}
	private String  generateId(String emptype) {
		if(emptype.equals("s")) {
			scount++;
			return emptype+scount;
		}
		else if(emptype.equals("v")) {
			vcount++;
			return emptype+vcount;	
		}
		else if(emptype.equals("c")) {
			 ccount++;
			 return emptype+ccount;
		}
		return null;
	}
	public String getPid() {
		return pid;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", bdate=" + bdate + "]";
	}
	
	
	
}
