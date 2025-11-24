package com.demo.stacks;

public class MyQueueList {
        Node front;
        Node rear;
        class Node{
        	int data;
        	Node next;
           public Node(int data) {
        	   this.data = data;
           }
        }
        public MyQueueList() {
        	 front = null;
        	 rear = null;
        }
        public boolean isEmpty() {
        	return front == null && rear == null;
        }
        public void enqueue(int num) {
        	Node newNode = new Node(num);
        	if(isEmpty()) {
        		front = newNode;
        	}
        	else {
        		rear.next = newNode;
        	}
        	rear = newNode;
        	System.out.println("num added :"+num);
        }
        
        public int dequeue() {
        	if(!isEmpty()) {
        		Node temp = front;
        		front = front.next;
        		if(front==null) {
        			rear=null;
        		}
        		temp.next = null;
        		return temp.data;
        	}else {
    			System.out.println("Queue is empty");
    			return -1;
    		}	
        		
        	}
        
        
        
        
        
}
