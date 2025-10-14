package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MyIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpid()-o2.getEmpid();
	}

}
