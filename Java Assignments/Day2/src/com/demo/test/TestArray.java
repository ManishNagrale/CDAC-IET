package com.demo.test;

import java.util.Scanner;
public class TestArray {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[10];
	 
	FunctionsClass.acceptData(arr);
	FunctionsClass.displayData(arr);
	int choice;
	do {
	System.out.println("1. Search a number\n2. find max\n3. find min");
	System.out.println("4. add all numbers\n5. find all occurances\n6. find nth maximum");
	System.out.println("7. find nth minimum\n8.exit\n choice :");
	choice=sc.nextInt();
	switch(choice){
	case 1:
		System.out.println("enetr data to search");
		int num=sc.nextInt();
		int pos=FunctionsClass.searchByValue(arr, num);
		if(pos!=-1) {
			System.out.println(num+" found at position: "+pos);
		}else {
			System.out.println("not found");
		}
		break;
	case 2:
		 int max=FunctionsClass.findMax(arr);
		 System.out.println("Maximum number : "+max);
		 
		break;
	case 3:
		 int min=FunctionsClass.findMin(arr);
		 System.out.println("Minimum number : "+min);
		 
		break;
	case 4:
		 int sum=FunctionsClass.adddata(arr);
		 System.out.println("Maximum number : "+sum);
		 break;
	case 5:
		System.out.println("enter data to search");
		num=sc.nextInt();
		int[] arrpos=FunctionsClass.findAllOccurences(arr,num);
		if(arrpos!=null) {
			System.out.println("all positions are : ");
			FunctionsClass.displayData(arrpos);
		}else {
			System.out.println("not found");
		}
		break;
	case 6:
		System.out.println("enter n");
		int n=sc.nextInt();
		int maxnum=FunctionsClass.findNthMax(arr,n);
		System.out.println(n+" Maximum value :  "+maxnum);
		break;
	case 7:
		System.out.println("enter n");
		n=sc.nextInt();
		int minnum=FunctionsClass.findNthMin(arr,n);
		System.out.println(n+" Maximum value :  "+minnum);
		break;
	case 8:
		System.out.println("thank you for visiting....");
		
	default:
		System.out.println("wrong choice");
		
	}
	}while(choice!=8);
	}
}
	
