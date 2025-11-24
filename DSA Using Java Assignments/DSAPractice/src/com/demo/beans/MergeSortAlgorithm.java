package com.demo.beans;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortAlgorithm 
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
		
		
		private static void merge(int arr[], int start, int mid, int end)
		{
			//length of left array
			int n1 = mid - start + 1;
			
			//length of right array
			int n2 = end - mid;
			
			int [] leftarray = new int[n1];
			int [] rightarray = new int[n2];
			
			
			//copy arrays
			for(int i=0; i<leftarray.length; i++)
			{
				leftarray[i] = arr[start+i];
			}
			
			for(int i=0; i<rightarray.length; i++)
			{
				rightarray[i] = arr[mid+1+i];
			}
			
			int i=0; 
			int j=0;
			int k=start;
			
			while(i<leftarray.length && j<rightarray.length)
			{
				if(leftarray[i] < rightarray[j])
				{
					arr[k] = leftarray[i];
					i++;
					k++;
				}
				else
				{
					arr[k] = rightarray[j];
					j++;
					k++;
				}
			}
			
			while(i<n1)
			{
				arr[k] = leftarray[i];
				i++;
				k++;
			}
			
			while(j<n2)
			{
				arr[k] = rightarray[j];
				j++;
				k++;
			}
			
		}
		
		public static void mergeSort(int[] arr, int start, int end) 
		{
			if(start < end)
			{
				int mid = (start + end) / 2;
				
				//left tree to sort
				mergeSort(arr, start, mid);
				
				//right tree to sort
				mergeSort(arr, mid+1, end);
				
				//merge to arrays
				merge(arr, start, mid, end);
			}
			
		}
		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Size of the Array: ");
			int size = sc.nextInt();
			 
			int arr[] = new int[size];
			 
			System.out.println("Enter The Array: ");
			MergeSortAlgorithm.acceptData(arr);
			 
			System.out.print("Your Array is: ");
			MergeSortAlgorithm.displayArray(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println("-----------------------------");
			 
			 
			MergeSortAlgorithm.mergeSort(arr, 0, arr.length-1);
			System.out.println("-----------------------------");
			System.out.println("After sorting using merge sort algorithm sorted array is: ");
			System.out.println(Arrays.toString(arr));
		}
		
}