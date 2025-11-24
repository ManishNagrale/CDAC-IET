package com.demo.test;
import com.demo.stacks.*;
public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue ob1 = new CircularQueue(5);
        ob1.enQueue(13);
        ob1.enQueue(43);
        ob1.enQueue(21);
        ob1.enQueue(45);
        ob1.enQueue(43);
        ob1.enQueue(67);
        System.out.println(ob1.deQueue());
        System.out.println(ob1.deQueue());
        System.out.println(ob1.deQueue());
        System.out.println(ob1.deQueue());
        System.out.println(ob1.deQueue());
        System.out.println(ob1.deQueue());
        System.out.println(ob1.deQueue());
	}
	

}
