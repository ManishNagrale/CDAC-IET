package com.demo.test;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.exceptions.NegativeSalaryException;
public class TestException1 {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    /*	 for(int i=0;i<3;i++) {
    		 try {
    			 System.out.println("Enter salary");
    			 double sal = sc.nextDouble();
    			 if(sal<0) {
    				 throw new NegativeSalaryException("Salary cannot be -ve");
    				 }
    			  System.out.println("The salary is "+sal);
    			  break;
    		 }
    		 catch(NegativeSalaryException e) {
    			 System.out.println(e.getMessage());
    		 }	 
    	 }*/
    	 
    	
    	 Employee emp1 = new Employee();
    	 try { 
    		 System.out.println("enter salary");
    		  double sal1 = sc.nextDouble();
          	  emp1.setSal(sal1);
    	  
    	  
    	 }catch(NegativeSalaryException e) {
    	     System.out.println(e.getMessage());	 
    	 }
    	 
    	 
    	 
    	 
     }
}
