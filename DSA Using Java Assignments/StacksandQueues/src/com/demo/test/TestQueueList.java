package com.demo.test;

import com.demo.stacks.MyQueueList;

public class TestQueueList {

	public static void main(String[] args) {
		MyQueueList qlist=new MyQueueList();
		qlist.enqueue(12);
		qlist.enqueue(34);
		qlist.enqueue(3);
		qlist.enqueue(16);
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue()); 
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());

	}

}
