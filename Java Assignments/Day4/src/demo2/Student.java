package demo2;

import java.util.Date;

public class Student {
    private int sid;
    private String sname;
    private float m1;
    private float m2;
    private Date bdate;
    
    public Student() {
    	sid =0;
    	sname=null;
    	m1=0;
    	m2=0;
    	bdate=null;
    }
    
    public Student(int id,String name,float m1,float m2,Date d) {
  	  sid=id;
  	  sname=name;
  	  this.m1=m1;
  	  this.m2=m2;
  	  bdate=d;
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
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	public String toString() {
		return "[Student id:"+sid+","+"Student name:"+sname+","+"M1:"+m1+","+"M2:"+m2+","+"Date of Birth:"+bdate+"]";
	}

	
}
