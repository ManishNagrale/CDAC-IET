package com.demo.test;
import java.util.Scanner;
public class TestException {
      public static int divide(int x,int y) {
    	  return x/y;
      }
      public static void main(String args[]) {
    	   Scanner sc = new Scanner(System.in);
         try {
    		System.out.println("Enter first number");
    		int num1 = sc.nextInt();
    		System.out.println("Enter second number");
    		int num2 = sc.nextInt();
    		int ans = divide(num1,num2);
    		System.out.println("Division: "+ans);
    		
         }
         catch(ArithmeticException e) {
        	  System.out.println(e.getMessage());
         }
    	 finally {
    		 System.out.println("In finally block");
    	 }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
      }
      
      
      
      
      
}
