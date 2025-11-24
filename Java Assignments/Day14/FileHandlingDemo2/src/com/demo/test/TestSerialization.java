package com.demo.test;
import java.io.*;
import java.util.*;
import com.demo.beans.*;
import java.io.EOFException;
public class TestSerialization {
     public static void main(String args[]) {
    	 List<Employee> lst = new ArrayList<>();
    	 lst.add(new Employee(11,"Bhushan","design",57000.0));
    	 lst.add(new Employee(12,"Manish","AI",67000.0));
    	 lst.add(new Employee(13,"Jayant","Manager",53000.0));
    	 
    	 try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/empdata.txt"));)
    	 {
    		 for(Employee emp : lst){
    			oos.writeObject(emp); 
    		 }
		} catch (IOException e) {
			e.printStackTrace();
		}
    	 
    	 try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/empdata.txt"));){
    		 while(true) {
    			 Employee emp = (Employee)ois.readObject();
    			 System.out.println(emp);
    		 }
    	  }catch (EOFException e1) {
  			System.out.println("Reached to the end of the file !!!");
  	 	 } 
    	 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
    		 
    	 
           
     
     
     }
}
