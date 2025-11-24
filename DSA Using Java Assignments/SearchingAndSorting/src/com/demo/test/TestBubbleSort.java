package com.demo.test;

import java.util.stream.IntStream;

import com.demo.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr= {37,56,71,11,40,9,41,15};
		//BubbleSortAlgorithm.bubbleSort(arr);
		//BubbleSortAlgorithm.bubbleSortImprovised(arr);
		BubbleSortAlgorithm.bubbleSortImprovisedDescending(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));

	}

}
