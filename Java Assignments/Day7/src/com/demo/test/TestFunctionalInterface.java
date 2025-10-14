package com.demo.test;
import com.demo.model.*;
import com.demo.interfaces.*;
public class TestFunctionalInterface {
   public static void main(String args[]) {
	   MyNewCompare ob = new MyNewCompare();
	   ob.compare(10, 20);
	   //Anonomyous class 
	   MyComparable ob1 = new MyComparable() {
		 
		  public int compare(int a,int b) {
			  System.out.println("in compare method of Anonymous class"+a+","+b);
			  return 0;
		  }   
	   };
	   ob1.compare(100,200);
	   //calling compare method using lambda function
	   MyComparable ob2 = (x,y)->{
		    System.out.println("in compare method using lambda function"+x+","+y);
		    return 0;
	   };
	   ob2.compare(20, 30);
	   
	   /*MyGenericClass<Integer> ob3 =(x1,y1)->{  //here is also lambda function use
		        return x1+y1;
	   };
	   System.out.println(ob3.compare(40,30));*/
	   
	   MyGenericClass<String> ob4=(x1,y1)->{
		      return x1+y1;
	   };
	    System.out.println(ob4.compare("a","b"));
	   
	    MyGeneric2<Integer> ob5 = (a,b)->{
	    	System.out.println("here Mygeneric interfce's m1 method is getting called");
	    	return a+b;
	    };
	    System.out.println(ob5.m1(25,25));
	    
	    
	   
	   
	   
   }
}
