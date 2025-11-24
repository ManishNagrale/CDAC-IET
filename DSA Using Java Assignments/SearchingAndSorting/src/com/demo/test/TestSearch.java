package com.demo.test;

import com.demo.search.SearchingService;

public class TestSearch {
   
	  public static void main(String args[]){
		  
		 int arr[] = {10,12,17,23,35,43,59,73}; 
		 int pos = SearchingService.sequentialSearch(arr,10);
		 if(pos!=-1) {
			 System.out.println("number found at position "+pos);
		 }else {
			 System.out.println("not found"); 
		     }
		 
		int[] arr1= {11,13,16,23,33,45,56,58,63,65,77};
		 pos=SearchingService.binarySearchNonRecursive(arr1,77);
		if(pos!=-1) {
			System.out.println("binary search number found at position : "+pos);
		}else {
			System.out.println("binary search number not found");
		} 
		
		pos=SearchingService.binarySearchRecursive(arr1,13,0,10);
		if(pos!=-1) {
			System.out.println("binary search number found at position : "+pos);
		}else {
			System.out.println("binary search number not found");
		}
	
	
	
		
  }	
}
