package com.demo.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm{
	    

		private static void merge(int[] arr, int start, int mid, int end) {
			  int n1 = mid-start+1;
			  int n2 = end-mid;
			
			  int leftarray[] = new int[n1];
			  int rightarray[] = new int[n2];
			  
			  for(int i=0;i<n1;i++) {
				  leftarray[i] = arr[start+i];
			  }
			  for(int i=0;i<n2;i++) {
				  rightarray[i]=arr[mid+1+i];
			  }
			  int i = 0;
			  int j = 0;
			  int k = start;
			  
			  while(i<n1 && j<n2) {
				  if(leftarray[i]<rightarray[j]) {
					  arr[k]=leftarray[i];
					  i++;
					  k++;
					  
				  }
				  else {
					  arr[k]=rightarray[j];
					  j++;
					  k++;
				  }
			  }
			  //for remaining elements
			  
			  while(i<n1) {
				  arr[k]=leftarray[i];
				  i++;
				  k++;
			  }
			  while(j<n2) {
				  arr[k]=rightarray[j];
				  j++;
				  k++;
			  }
			  System.out.println(start+","+mid+","+end);
			  System.out.println(Arrays.toString(leftarray));
			  System.out.println(Arrays.toString(rightarray));
			  System.out.println("----------------------");
			
		}
		 
	 
	 
	 
	 
	 
	  public static void mergeSortAscending(int arr[],int start,int end) {
		    if(start<end) {
		    	int mid = (start+end)/2;
		    	
		    	mergeSortAscending(arr,start,mid);
		    	
		    	mergeSortAscending(arr,mid+1,end);
		    	
		    	merge(arr,start,mid,end);
		    	
		    }

	  }
	 
	 
 }