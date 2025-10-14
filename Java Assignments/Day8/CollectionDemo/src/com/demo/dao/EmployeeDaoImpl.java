package com.demo.dao;
import com.demo.beans.*;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import com.demo.beans.Employee;
import java.util.stream.Collectors;
import com.demo.comparators.MyNameComparator;

public class EmployeeDaoImpl implements EmployeeDao {
     static List<Employee> elist;
     static {
    	 elist = new ArrayList();
    	 elist.add(new Employee(11,"Bhushan",90000,LocalDate.of(2024, 5, 21)));
    	 elist.add(new Employee(12,"Jayant",80000,LocalDate.of(2023, 7, 14)));
    	 elist.add(new Employee(13,"Rushikesh",80000,LocalDate.of(2021, 7, 17)));
     }
	@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}
	@Override
	public List<Employee> findAll() {
	   
		return elist;
	}
	@Override
	public Employee findById(int eid) {
	     int pos = elist.indexOf(new Employee(eid));
	     if(pos!=-1) {
	    	 return elist.get(pos);
	     }
		return null;
	}
	@Override
	public boolean removeById(int eid) {
		return elist.remove(new Employee(eid));
	}
	@Override
	public List<Employee> findByName(String nm) {
		
	 /*	List<Employee> temp= elist.stream()
                .filter(emp->emp.getEname().equals(nm))
                .collect(Collectors.toList());  */
		
	     List<Employee> temp = new ArrayList();
	      for(Employee e:elist) {
	    	  if(e.getEname().equals(nm)) {
	    		  temp.add(e);
	    	  }
	      }
	      if(temp.size()>0) {
	    	   return temp;
	      } return null;
	    }
	@Override
	public boolean modifySalaryById(int eid, double sal) {
         Employee e = findById(eid);
         if(e!=null) {
        	 e.setSal(sal);
        	 return true;
         }return false;
		
		
	
	}
	@Override
	public boolean removeBySalary(double sal) {
	
		return elist.removeIf(emp->emp.getSal()>sal);
	}
	@Override
	public List<Employee> searchBySal(double sal) {
		 List<Employee> lst = elist.stream()
		 .filter(emp->emp.getSal()==sal)
		 .collect(Collectors.toList());
		 if(lst.size()>0) {
			 return lst;
		 }return null;
	}
	@Override
	public List<Employee> sortBySal() {
		List<Employee> lst = new ArrayList();
		for(Employee e:elist) {
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}
	@Override
	public List<Employee> sortByName() {
		List<Employee> lst = new ArrayList();
		for(Employee e:elist) {
			lst.add(e);
		}
		Comparator<Employee> c =(o1,o2)->{
		System.out.println("In functional comparator");
		 return o1.getEname().compareTo(o2.getEname());
		};
		 lst.sort(c);
		 return lst;
		
	}
	public List<Employee> sortById() {
		List<Employee> lst=new ArrayList<>();
		for(Employee e:elist) {
			lst.add(e);
		}
		//lst.sort(new MyNameComparator());
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("In functional comparator");
			return o1.getEname().compareTo(o2.getEname());
		};
		lst.sort(c);
		return lst;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
     
