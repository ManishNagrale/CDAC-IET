package com.demo.dao;
import com.demo.beans.Employee;
import java.util.List;
public interface EmployeeDao {
      
	 boolean save(Employee e);
	 List<Employee> findAll();
	 Employee findById(int eid);
	 boolean removeById(int eid);
	 List<Employee> findByName(String nm);
	boolean modifySalaryById(int empid, double sal);
	boolean removeBySalary(double sal);
	List<Employee> searchBySal(double sal);
	List<Employee> sortBySal();
	List<Employee> sortByName();
}
