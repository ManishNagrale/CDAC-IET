package com.demo.test;
import com.demo.stacks.*;
public class TestMyStackArray {

	public static void main(String[] args) {
	      MyStackArray ob1 = new MyStackArray(5);
          ob1.push(12);
          ob1.push(17);
          ob1.push(45);
          ob1.push(78);
          ob1.push(56);
          ob1.push(37);
          System.out.println(ob1.pop());
          System.out.println(ob1.pop());
          System.out.println(ob1.pop());
          System.out.println(ob1.pop());
          System.out.println(ob1.pop());
          System.out.println(ob1.pop());
	}

}
