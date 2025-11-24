package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.InsertionSortAlgorithm;

public class TestInsertionSort {
    public static void main(String args[]) {
    	
    	int arr[] = {36,67,98,90,26,72,17,33};
    	InsertionSortAlgorithm.insertionSortDescending(arr);
    	System.out.println(Arrays.toString(arr));
    	
    }
	
	
	
}
