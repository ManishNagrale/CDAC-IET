package com.demo.stacks;

public class MyStackList {
        Node top;
        class Node{
        	int data;
        	Node next;
        public Node(int data) {
        	this.data = data;
        	 next = null;
        }
        }
        public MyStackList() {
        	top = null;
        }
        public boolean isEmpty() {
        	return top == null;
        }
        
        public void push(int val) {
        	Node newNode = new Node(val);
        	if(!isEmpty()){
        		newNode.next = top;
        	}
        	top = newNode;
        }
        
        public int pop() {
        	if(!isEmpty()) {
        		Node temp = top;
        		top = top.next;
        		temp.next = null;
        		return temp.data;
        	}
        	else {
        		System.out.println("stack is empty");
        		return -1;
        	}
        }
        
        
        
        
}