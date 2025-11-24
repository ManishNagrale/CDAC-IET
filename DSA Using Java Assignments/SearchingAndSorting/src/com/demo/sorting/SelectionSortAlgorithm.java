package com.demo.sorting;

import java.util.Arrays;

public class SelectionSortAlgorithm {
         public static int findNthMin(int arr[],int start) {
        	 int minpos = start;
        	 int min = arr[minpos];
        	 for(int i = start;i<arr.length;i++) {
        		 if(min>arr[i]) {
        			  minpos = i;
        			  min = arr[i];
        		 }
        	 }
        	 return minpos;	 
         }
         public static void selectionSortAscending(int arr[]) {
        	  for(int i=0;i<arr.length-1;i++) {
        		  int minpos = findNthMin(arr,i);
        		  int temp = arr[minpos];
        		  arr[minpos]=arr[i];
        		  arr[i]= temp;
        		  System.out.println(Arrays.toString(arr));
        		  
        	  }
         }
         
         public static int findNthMax(int arr[],int start) {
        	  int maxpos = start;
        	  int max = arr[maxpos];
        	  for(int i=start;i<arr.length;i++) {
        		  if(max<arr[i]) {
        			  maxpos = i;
        			  max = arr[i];
        		  }
        	  }
        	  return maxpos;
         }
         
         public static void selectionSortDescending(int arr[]) {
        	   for(int j=0;j<arr.length-1;j++) {
        		    int maxpos = findNthMax(arr,j);
        		    	int temp = arr[maxpos];
        		    	arr[maxpos]=arr[j];
        		    	arr[j]=temp;
        		    System.out.println(Arrays.toString(arr));
        	   }
         }
         
         
         
         
}
