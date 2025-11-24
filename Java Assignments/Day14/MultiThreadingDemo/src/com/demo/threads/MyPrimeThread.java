package com.demo.threads;

import com.demo.beans.MyClass;

public class MyPrimeThread implements Runnable {
      private int n ;
      private MyClass ob;
	 
	 public MyPrimeThread(int n, MyClass ob) {
		super();
		this.n = n;
		this.ob = ob;
	 }
	public void run() {
		boolean status = ob.checkPrime(n);
		if(status) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
	}
	
	
	
	
}
