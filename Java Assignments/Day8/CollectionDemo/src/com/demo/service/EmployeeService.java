package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	boolean deleteById(int eid);

	List<Employee> findByName(String nm);

	boolean updateSalaryById(int empid, double sal);

	boolean deleteBySalary(double sal);

	List<Employee> findBySalary(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

}

