package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.HeapSortAlgorithm;

public class TestHeapSort{

	public static void main(String[] args) {
		int[] arr= {11,27,41,23,99,15,62};
		HeapSortAlgorithm.heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------------");

	}

}

