package com.demo.beans;

public class Student {
     

	private int sid;
     private String sname;
     private double m1;
     private double m2;
     private double m3;
     
	 public Student() {
		super();
	 }
	   
	 public Student(int sid) {
			super();
			this.sid = sid;
		}

	public Student(int sid, String sname, double m1, double m2, double m3) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	 public boolean equals(Object obj) {
		 System.out.println("in equals method "+this.sid+"------"+((Student)obj).sid);
		 return this.sid == ((Student)obj).sid;
	 }

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getM1() {
		return m1;
	}

	public void setM1(double m1) {
		this.m1 = m1;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	  
	 
     
}
