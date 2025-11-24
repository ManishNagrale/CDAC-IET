package com.demo.beans;

public class MyQueueList 
{
	Node front;
	Node rear;
	
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public MyQueueList()
	{
		front = null;
		rear = null;
	}
	
	public boolean isEmpty()
	{
		return front == null && rear == null;
	}
	
	public void enQueue(int val)
	{
		 Node newNode = new Node(val);
		 if(isEmpty())
		 {
			 front = newNode;
		 }
		 else
		 {
			 rear.next = newNode;
		 }
		 rear = newNode;
		 System.out.println("Value is Added My dosta: "+val);
	}
	
	
	public int deQueue()
	{
		if(!isEmpty())
		{
			Node temp = front;
			front =  front.next;
			if(front == null)
			{
				rear =null;
			}
			temp.next = null;
			return temp.data;
		}
		else
		{
			System.out.println("Queue is Khalli my mitrrr");
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		MyQueueList qlist = new MyQueueList();
		qlist.enQueue(12);
		qlist.enQueue(34);
		qlist.enQueue(3);
		qlist.enQueue(16);
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue()); 
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
	}
}
