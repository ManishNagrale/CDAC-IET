package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.MergeSortAlgorithm;

public class TestMergeSort {

	public static void main(String[] args) {
		int[] arr= {44,23,67,89,85,40,78,62,39,18};
		MergeSortAlgorithm.mergeSortAscending(arr, 0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
