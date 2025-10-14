package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	 private EmployeeDao edao;
	 
	 public EmployeeServiceImpl() {
		  edao=  new EmployeeDaoImpl();
	 }

	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int empid = sc.nextInt();
		System.out.println("enter name");
		String ename = sc.next();
		System.out.println("enter salary");
		double sal = sc.nextDouble();
		System.out.println("entr joining date (dd/mm/yyyy)");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e = new Employee(empid,ename,sal,ldt);
		return edao.save(e);	
	}

	@Override
	public List<Employee> displayAll() {
		
		return edao.findAll();
	}

	@Override
	public Employee searchById(int eid) {
		
		return edao.findById(eid);
	}

	@Override
	public boolean deleteById(int eid) {
		
		return edao.removeById(eid);
	}

	@Override
	public List<Employee> findByName(String nm) {
	    
		return edao.findByName(nm);
	}

	@Override
	public boolean updateSalaryById(int empid, double sal) {
		
		return edao.modifySalaryById(empid,sal);
	}

	@Override
	public boolean deleteBySalary(double sal) {
		
		return edao.removeBySalary(sal);
	}

	@Override
	public List<Employee> findBySalary(double sal) {
		
		return edao.searchBySal(sal);
	}

	@Override
	public List<Employee> sortBySal() {
	 
		return edao.sortBySal();
	}

	@Override
	public List<Employee> sortByName() {
		
		return edao.sortByName();
	}

}
