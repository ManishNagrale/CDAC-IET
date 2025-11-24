package com.demo.beans;

public class MyStackArray 
{
	private int arr[];
	private int top;
	
	
	public MyStackArray() 
	{
		arr = new int[5];
		top = -1;
	}


	public MyStackArray(int size) 
	{
		this.arr = new int[size];
		top = -1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top == arr.length - 1;
	}
	
	public void push(int val)
	{
		if(!isFull())
		{
			top++;
			arr[top] = val;
			System.out.println("Element Pushed into stack: "+val);
		}
		else
		{
			System.out.println("Stack is Full");
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int val = arr[top];
			top--;
			return val;
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	
	public static void main(String[] args)
	{
		MyStackArray st = new MyStackArray();
		st.push(78);
		st.push(34);
		st.push(15);
		st.push(66);
		st.push(11);
		st.push(17); //stack is Full
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop()); // stack is Empty	
		
	}
}
