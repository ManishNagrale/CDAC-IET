package com.demo.test;

import java.util.Date;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class TestPerson {
    public static void main(String[] args) {
    	
    	SalariedEmp s1=new SalariedEmp("Gayatri",new Date(2000,04,23),"HR","Designer",88888);
    	SalariedEmp s2=new SalariedEmp("Disha",new Date(2000,04,23),"UX","Designer",99999);
    	System.out.println("net sal= "+s1.calculateSal());
    	ContractEmp c1=new ContractEmp("Yash",new Date(2000,04,23),"HR","Designer",80,3000);
    	ContractEmp c2=new ContractEmp("Girish",new Date(2000,04,24),"UX","Designer",80,4000);
    	System.out.println("net charges= "+c1.calculateSal());
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(c1);
    	System.out.println(c2);
  
		
	}
}
