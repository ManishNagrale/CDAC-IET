package com.demo.beans;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgorithm 
{
	//accept data
	public static void acceptData(int arr[]) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter "+i+" element: ");
			arr[i] = sc.nextInt();
		}
	}
	
	//display array
	public static void displayArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	//bubble sort 
	 public static void BubbleSort(int arr[]) 
	 {
		 for(int i=0; i<arr.length; i++)
		 {
			 int swap = 0;
			 for(int j=1; j<arr.length-i; j++)
			 {
				 if(arr[j-1] > arr[j])
				 {
					 int temp = arr[j-1];
					 arr[j-1] = arr[j];
					 arr[j] = temp;
					 swap++;
				 }
			 }
			 System.out.println("Iteration "+i);
			 System.out.println(Arrays.toString(arr));
			 System.out.println("Swapped "+swap+" times");
			 System.out.println("----------------------------------");
		 }
	 }
	 
	 
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Size of the Array: ");
		 int size = sc.nextInt();
		 
		 int arr[] = new int[size];
		 
		 System.out.println("Enter The Array: ");
		 BubbleSortAlgorithm.acceptData(arr);
		 
		 System.out.println("Your Array is: ");
		 BubbleSortAlgorithm.displayArray(arr);
		 
		 
		 BubbleSortAlgorithm.BubbleSort(arr);
		 System.out.println("After sorting using bubble sort algorithm sorted array is: ");
		 System.out.println(Arrays.toString(arr));
	 }	 
}