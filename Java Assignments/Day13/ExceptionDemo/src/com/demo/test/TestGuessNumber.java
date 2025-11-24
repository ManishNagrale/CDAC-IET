package com.demo.test;
import java.util.Scanner;

import com.demo.exceptions.IncorrectNumberException;
public class TestGuessNumber {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 int num = 45;
    	 while(true) {
    	  try {
    		  System.out.println("Enter number to guess");
    		 int num1 = sc.nextInt();
    		 if(num1==num) {
    			 System.out.println("yepee,you guess it right");
    			 break;
    		 }
    		 else {
    			  if(num1<num) {
    				  throw new IncorrectNumberException("OOPS,you miss it! ,it is a greater number");
    			  }
    			  else
    			       throw new IncorrectNumberException("OOPS,you miss it! ,it is a smaller number");
    		 }
    	 }catch(IncorrectNumberException e) {
    		 System.out.println(e.getMessage());
         }
       } 
    	 
    }
}
