package com.demo.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeService {
    static Employee emparr[];
    static int count;
    static {
    	emparr = new Employee[100];
    	emparr[0] = new SalariedEmp("Manish",new Date(),"UI","Manager",88000);
    	emparr[1] = new SalariedEmp("Bhushan",new Date(),"UX","Designer",90000);
    	emparr[2]= new ContractEmp("Rushikesh",new Date(2000,04,23),"HR","Designer",80,3000);
 	   emparr[3]= new ContractEmp("Jayant",new Date(2000,04,23),"UX","Designer",84,4000);
 	   count=4;
    }
    public static boolean addNewEmployee(int ch) {
	    Scanner sc=new Scanner(System.in);
	    if(count<emparr.length) {
		    System.out.println("Enter name");
		    String nm=sc.next();
		    System.out.println("enter birth date(dd/MM/yyyy)");
		    String bdate=sc.next();
		    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		    Date dt=null;
		    try {
			 dt=sdf.parse(bdate);
			} catch (ParseException e) {
			
				e.printStackTrace();
			}
		    System.out.println("enter department");
		    String dept=sc.next();
		    System.out.println("enter designation");
		    String desg=sc.next();
		    if(ch==1) {
		    	System.out.println("enetr salary");
		    	double sal=sc.nextDouble();
		    	emparr[count]=new SalariedEmp(nm,dt,dept,desg,sal);
		    	count++;
		    }else if(ch==2) {
		    	System.out.println("enetr hrs");
		    	float hrs=sc.nextFloat();
		    	System.out.println("enetr charges");
		    	double charges=sc.nextDouble();
		    	emparr[count]=new ContractEmp(nm,dt,dept,desg,hrs,charges);
		    	count++;
		    	
		    }else {
		    
		    }
		    return true;
	    }
	    return false;
    }
	    public static void displayAll() {
			for(Employee emp:emparr) {
				if(emp!=null) {
				  System.out.println(emp);
				}
			}
			
		}
		public static void displayOnlySalariedEmp() {
			for(Employee emp:emparr) {
				if(emp!=null && emp instanceof SalariedEmp)
					System.out.println(emp);
			}

			
		}
		public static void displayOnlyContractEmp() {
			for(Employee emp:emparr) {
				
				if(emp!=null && emp instanceof ContractEmp)
					System.out.println(emp);
			}
			
		}
		public static Employee searchById(String id) {
			for(Employee e:emparr) {
				if(e!=null) {
					if(e.getPid().equals(id)) {
						return e;
					}
				}
			}
			return null;
		}
		public static boolean modifyById(String id, double charges) {
			Employee e=searchById(id);
			if(e!=null) {
				if(e instanceof SalariedEmp) {
				
					 ((SalariedEmp)e).setSal(charges);
				}else if(e instanceof ContractEmp) {
					((ContractEmp)e).setCharges(charges);
				}else {
					
				}
				return true;
			}
			return false;
		}
}
