package com.demo.model;
import com.demo.interfaces.*;
public class MyClass implements I1,I2 {

	public void m1() {
		System.out.println("in m1 method ");
	}

	@Override
	public void m3() {
	   System.out.println("In m3 method");
		
	}

	@Override
	public void m2(int x) {
		System.out.println("In m2 method "+x);
		
	}
}
