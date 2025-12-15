package com.demo.SpringBootRestWebService.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootRestWebService.beans.Product2;
import com.demo.SpringBootRestWebService.dao.ProductDao;
import com.demo.SpringBootRestWebService.dto.ProductDto;
import com.demo.SpringBootRestWebService.mapper.ProductDtoMapper;



@Service
public class ProductServiceImpl implements ProductService{
    @Autowired   
	ProductDao pdao;

	public List<ProductDto> getAllProducts() {
		List<Product2> plist= pdao.findAll();
		List<ProductDto> plist1=plist.stream()
				.map(prod->ProductDtoMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		return plist1;
	}

	
	public boolean addproduct(ProductDto p) {
		//convert ProductDto to Product
		Product2 prod=ProductDtoMapper.mapToProduct(p);
		Product2 p1=pdao.save(prod);
		return p1!=null;
		
	}


	public ProductDto getById(int pid) {
		Optional<Product2> p= pdao.findById(pid);
		if(p.isPresent()) {
			ProductDto prod=ProductDtoMapper.mapToProductDto(p.get());
			return prod;
		}
		
		return null;
	}

	
	public boolean updateproduct(ProductDto p) {
		// TODO Auto-generated method stub
		//convert ProductDto to Product
		Product2 prod=ProductDtoMapper.mapToProduct(p);
		Optional<Product2> op=pdao.findById(prod.getPid());
		if(op.isPresent()) {
			Product2 p2=op.get();
			p2.setPname(p.getPname());
			p2.setQty(p.getQty());
			p2.setPrice(p.getPrice());
			pdao.save(p2);
			return true;
		}
		return false;
		
	}


	public boolean deleteById(int pid) {
		Optional<Product2> op=pdao.findById(pid);
		if(op.isPresent()) {
		   pdao.delete(op.get());
		   return true;
		}
		return false;
	}


	@Override
	public List<ProductDto> getByprice(double lprice, double hprice) {
		List<Product2> plist=pdao.findByPrice(lprice,hprice);
		if(plist.size()>0) {
		List<ProductDto> plist1=plist.stream()
				.map(prod->ProductDtoMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		
			 return plist1;
		}
		return null;
	}


	
}
