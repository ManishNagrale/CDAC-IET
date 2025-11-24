package com.demo.test;
import com.demo.arrays.*;
public class TestArray {
	public static void main(String[] args) {
		MyArray ob=new MyArray();
		System.out.println("capacity : "+ob.getCapacity());
	
		System.out.println(ob.add(0,5));
	
		System.out.println(ob.add(1,7));
		System.out.println(ob.add(2,41));
		System.out.println(ob.add(3,42));
		System.out.println(ob.add(4,43));
		System.out.println(ob.add(5,44));
		System.out.println(ob.add(6,45));
		System.out.println(ob.add(7,46));
		System.out.println(ob.add(8,47));
		System.out.println(ob.add(9,48));

		System.out.println(ob);
	     ob.rotateArray(false, 3);
		System.out.println(ob);
		
		
	}		
	
}