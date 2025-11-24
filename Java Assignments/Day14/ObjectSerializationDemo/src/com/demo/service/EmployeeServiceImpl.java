package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	   
	    private EmployeeDao edao;
	    
	    public EmployeeServiceImpl() {
	    	 super();
	    	 edao = new EmployeeDaoImpl();
	    }

		@Override
		public void readFile(String fname) {
			edao.readData(fname);
		}

		@Override
		public boolean addNewEmployee() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean deleteById(int empid) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean modifyById(int empid, double sal) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public List<Employee> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Employee getById(int empid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void writeToFile(String string) {
			// TODO Auto-generated method stub
			
		}

}
