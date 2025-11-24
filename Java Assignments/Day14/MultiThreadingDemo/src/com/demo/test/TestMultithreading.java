package com.demo.test;


import com.demo.beans.MyClass;
import com.demo.threads.MyFactorialThread;
import com.demo.threads.MyPrimeThread;
import com.demo.threads.MyPrintTableThread;

public class TestMultithreading {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		
		MyFactorialThread fth=new MyFactorialThread(5,ob);
		fth.start();
		MyPrintTableThread th1=new MyPrintTableThread(3, ob);
		th1.start();
		MyPrintTableThread th2=new MyPrintTableThread(7, ob);
		th2.start();
		MyPrimeThread th3= new MyPrimeThread(9,ob);
		Thread th= new Thread(th3);
		th.start();
		
		try {
			fth.join();
			th1.join();
			th2.join();
			th.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("main function continues....");
		
		

	}

}