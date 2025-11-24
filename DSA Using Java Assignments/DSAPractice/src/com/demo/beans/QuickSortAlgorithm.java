package com.demo.beans;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortAlgorithm 
{
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
	
	
	private static int partition(int arr[], int start, int end)
	{
		int pivot = start;
		int i = start;
		int j = end;
		
		while(i < j)
		{
			while(i<end && arr[i] <= arr[pivot])
			{
				i++;
			}
			
			while(j >= start && arr[j] > arr[pivot])
			{
				j--;
			}
			
			if(i < j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		if(pivot != j)
		{
			int temp = arr[j];
			arr[j] = arr[pivot];
			arr[pivot] = temp;
		}
		return j;
	}
	
	public static void QuickSort(int[] arr, int start, int end) 
	{
		if(start<end)
		{
			int pivot = partition(arr, start, end);
			QuickSort(arr, start, pivot-1);
			QuickSort(arr, pivot+1, end);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		 
		int arr[] = new int[size];
		 
		System.out.println("Enter The Array: ");
		QuickSortAlgorithm.acceptData(arr);
		 
		System.out.println("Your Array is: ");
		QuickSortAlgorithm.displayArray(arr);
		System.out.println("-----------------------------");
		 
		 
		QuickSortAlgorithm.QuickSort(arr, 0, arr.length-1);
		System.out.println("-----------------------------");
		System.out.println("After sorting using Quick sort algorithm sorted array is: ");
		System.out.println(Arrays.toString(arr));
	}	
}


