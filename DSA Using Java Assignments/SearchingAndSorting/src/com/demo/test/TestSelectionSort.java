package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.SelectionSortAlgorithm;

public class TestSelectionSort {
        public static void main(String args[]) {
        	int arr[] = {45,33,101,24,13,49,76,52,91};
        	//SelectionSortAlgorithm.selectionSortAscending(arr);
        	//System.out.println("-------------------------------------");
        	SelectionSortAlgorithm.selectionSortDescending(arr);
        }
}
