package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class OrderDaoImpl implements OrderDao {

	  static Map<Customer,List<Item>> hm ;
	  static{
		   hm = new HashMap();
		   Customer c = new Customer(11,"Bhushan","33333");
		   List<Item> lst = new ArrayList();
		   lst.add(new Item(1001,"chair",3,700.00));
		   lst.add(new Item(1002,"Table",2,1200.00));
		   hm.put(c, lst);
		   Customer c1 = new Customer(11,"Bhushan","33333");
		   List<Item> lst1 = new ArrayList();
		   lst.add(new Item(1001,"chair",3,700.00));
		   lst.add(new Item(1002,"Table",2,1200.00));
		   hm.put(c2, lst1);
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean save(Customer c, List<Item> lst) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<Customer, List<Item>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
      
}
