
package com.demo.interfaces;

//Functional Interface
public interface MyComparable {
      int compare(int a, int b);
      
      public static void m3() {
    	  System.out.println("In m3 static method");
      }
      default int m1() {
    	  return 10;
      }
}
