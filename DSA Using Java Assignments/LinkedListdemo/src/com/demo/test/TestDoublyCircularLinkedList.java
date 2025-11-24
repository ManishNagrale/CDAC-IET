package com.demo.test;
import com.demo.LinkedLists.*;
public class TestDoublyCircularLinkedList {
	public static void main(String[] args) {
		DoublyCircularLinkedList clist=new DoublyCircularLinkedList();
		clist.addNode(110);
		clist.addNode(239);
		clist.addNode(76);
		clist.addNode(311);
		clist.displayData();
  	    clist.addByPosition(1, 120);
//		clist.addByPosition(3, 100);
//		clist.addByPosition(7, 150);
	clist.addByPosition(20, 300);
	    clist.displayData();
		
		
		
		
	}		
}
