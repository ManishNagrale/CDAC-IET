package com.demo.beans;

public class Book {
	private int bid;
	private String bname;
	private Lesson l1;
	
	 class Lesson{
         private int lid;
         private String lname;
         
         public Lesson() {
        	 lid=0;
        	 lname=null;	 
         }
         public Lesson(int id,String name) {
        	 lid=id;
        	 lname=name;
        	 
         }
         
         public static  void m1() {
        	 System.out.println("In m1 methof of lesson class");
         }
	}
	  public Book() {
		  bid=0;
		  bname=null;
		  l1=null;
	  }
	public Book(int bid,String bname,int lid,String lname) {
		  this.bid=bid;
		  this.bname=bname;
		  this.l1 = new Lesson(lid,lname);
	}
	public Lesson getL1() {
		return l1;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
	
	  

}
