package com.demo.SpringBootMVCProductCrud.service;

import java.util.List;

import com.demo.SpringBootMVCProductCrud.beans.Product2;

public interface ProductService {

	List<Product2> findAllProducts();

	void addnewProduct(Product2 product);

	Product2 getById(int pid);

	void updateProduct(Product2 prod);

	void deleteProduct(int pid);

}
