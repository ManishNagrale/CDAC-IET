package com.demo.beans;

public class MyStackList 
{
	Node top;
	
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
	
	public MyStackList()
	{
		top = null;
	}
	
	public boolean isEmpty()
	{
		return top == null;
	}
	
	public void push(int val)
	{
		Node newNode = new Node(val);
		
		if(!isEmpty())
		{
			newNode.next = top;
		}
		top = newNode;
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			Node temp = top;
			top= top.next;
			temp.next = null;
			return temp.data;
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	public static void main(String[] args) 
	{
		MyStackList ob1 = new MyStackList();
		ob1.push(10);
		ob1.push(20);
		ob1.push(30);
		ob1.push(40);
		
		System.out.println(ob1.pop());	
		System.out.println(ob1.pop());	
		System.out.println(ob1.pop());	
		System.out.println(ob1.pop());	
		System.out.println(ob1.pop());	
	}
}
