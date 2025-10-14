package com.demo.beans;

import java.util.Date;

public class SalariedEmp extends Employee{
     private double sal;
     private double bonus;
     
     public SalariedEmp() {
    	   super();
    	   sal=0;
    	   bonus =0;
     }
     public SalariedEmp(String pname,Date bdate,String dept,String desg,double salary) {
    	     super("s",pname,bdate,dept,desg);
    	     sal= salary;
    	     bonus = salary*0.10;
     }
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double calculateBonus(double percent) {
		 bonus = sal*percent;
		 return bonus;
	}
	@Override
	public String toString() {
		return "SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	public double calculateSal() {
		return bonus+sal+0.10*sal+0.15*sal-0.08*sal;
	}
}
