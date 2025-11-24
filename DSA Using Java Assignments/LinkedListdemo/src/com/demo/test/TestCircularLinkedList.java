package com.demo.test;

import com.demo.LinkedLists.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList clist=new CircularLinkedList();
		clist.addNode(47);
		clist.addNode(23);
		clist.addNode(67);
		clist.addNode(58);
		clist.displayData();
		clist.addByPosition(1, 33);
		clist.addByValue(70, 33);
		clist.displayData();
		clist.delteByPosition(25);
		clist.displayData();
		
	}
	
}	
	
		