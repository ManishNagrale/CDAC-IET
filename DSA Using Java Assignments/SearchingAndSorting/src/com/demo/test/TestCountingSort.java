package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountingSortAlgorithm;

public class TestCountingSort {

	public static void main(String[] args) {
		int[] arr= {9,2,5,7,1,4,8,8,3,3,6};
		int[] output=CountingSortAlgorithm.countingSortAscending(arr);
		System.out.println("sorted data");
		System.out.println(Arrays.toString(output));

	}

}