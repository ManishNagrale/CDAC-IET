package com.demo.beans;

public class TestBook {
     public static void main(String args[]) {
    	 Book b1 = new Book();
    	 Book.Lesson l1= b1.new Lesson();
    	 l1.m1();
    	 
    	 Book b2 = new Book(12,"science book",15,"chapter 1");
    	 System.out.println(b2);
    	 b2.getL1().m1();
     }
}
