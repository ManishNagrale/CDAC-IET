package com.demo.test;
import java.util.List;
import java.util.ArrayList;
import com.demo.beans.*;
import java.io.*;
public class TestReadCSV {
         public static void main(String args[]) {
               List<Employee> lst = new ArrayList<>();
               try(BufferedReader brs = new BufferedReader(new FileReader("src/empdata2.txt"));){
            	   String line  = brs.readLine();
       			    while(line!=null) {
       				String[] arr=line.split(",");
       			    Employee e1=new Employee(Integer.parseInt(arr[0]),arr[1],arr[2],Double.parseDouble(arr[3]));
       			    lst.add(e1);
				    line=brs.readLine();
       			  }		
                   lst.forEach(System.out::println);
       			
               }catch(IOException e) {
            	 System.out.println(e.getMessage());
               }
               lst.add(new Employee(34,"xxxx","admin",45678));
               
               try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/empdata2.txt"));){
            	  for(Employee emp : lst) {
            		  String str = emp.getEid()+","+emp.getEname()+","+emp.getDesg()+","+emp.getSal()+"\n";
            		  bw.write(str);
            	  }
              } catch (IOException e) {
			 	
				e.printStackTrace();
			  }
               
               
               
               
               
               
               
               
               
               
}
}