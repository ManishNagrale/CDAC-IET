package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.QuickSortAlgorithm;

public class TestQuickSort {
      public static void main(String args[]) {
    	  int arr[] = {17,90,75,31,23,19,68,46};
    	  QuickSortAlgorithm.quickSort(arr,0,arr.length-1);
    	  System.out.println(Arrays.toString(arr));
      }
	
	
	
	
	
}
