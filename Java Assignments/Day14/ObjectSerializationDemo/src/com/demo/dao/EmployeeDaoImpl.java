package com.demo.dao;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.*;




import com.demo.beans.*;
public class EmployeeDaoImpl implements EmployeeDao{
	   static List<Employee> lst;
	   static {
		   lst = new ArrayList<>();
	    }
	   public void readData(String fname) {
			File f = new File(fname);
			if(f.exists()) {
				try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));){
				   while(true) {
					   Employee e=(Employee)ois.readObject();
					   lst.add(e);
				   }
					
					
				} catch(EOFException e) {
					System.out.println("Reached to end of file");
					
				}catch (FileNotFoundException e) {
				
					e.printStackTrace();
				} catch (IOException e) {
				
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
				
					e.printStackTrace();
				}
			}
			System.out.println("size: "+lst.size());
			
		}
	@Override
	public boolean save(Employee e) {
		return lst.add(e);
	}
	@Override
	public boolean removeById(int empid) {
	 return lst.remove(new Employee(empid));
	}
	@Override
	public boolean updateById(int empid, double sal) {
		int pos = lst.indexOf(new Employee(empid));
		if(pos!=-1) {
			lst.get(pos).setSal(sal);
			return true;
		}return false;
	}
	
	@Override
	public List<Employee> findAll() {
		 return lst;
	}
	@Override
	public Employee findById(int empid) {
		int pos = lst.indexOf(new Employee(empid));
		if(pos!=-1) {
			return lst.get(pos);
		}
		return null;
	}
	@Override
	public void writeData(String fname) {
		try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(fname));){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
