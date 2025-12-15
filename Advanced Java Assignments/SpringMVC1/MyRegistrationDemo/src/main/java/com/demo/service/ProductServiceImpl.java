package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	 @Autowired   
	 ProductDao pdao;
	
	@Override
	public List<Product> getAllProducts() {
	  return pdao.findAllProducts();
		
	}
	@Override
	public boolean addProduct(Product p) {
		return pdao.save(p);
	}
	@Override
	public Product getById(int pid) {
		return pdao.findById(pid);
	}
	@Override
	public boolean updateProduct(Product p) {
		return pdao.modifyProduct(p);
	}
	@Override
	public boolean deleteById(int pid) {
	   return pdao.removeById(pid);
	}

}
