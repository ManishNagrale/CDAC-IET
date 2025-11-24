package com.demo.test;
import com.demo.LinkedLists.*;
public class TestSinglyLinkedList {
     public static void main(String args[]) {
    	 SinglyLinkedList lst = new SinglyLinkedList();
    	 lst.addNode(12);
    	 lst.addNode(17);
    	 lst.addNode(19);
    	  lst.addByPosition(1,100 );
    	  lst.addByPosition(4,111 );
    	  lst.addByNum(56,111);
    	  
    	  lst.displayData();
    	 
    	 
     }
}
