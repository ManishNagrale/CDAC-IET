package com.demo.SpringBootRestWebService.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.SpringBootRestWebService.beans.Product2;
import com.demo.SpringBootRestWebService.dto.ProductDto;



public class ProductDtoMapper {

	public static Product2 mapToProduct(ProductDto p) {
		
		return new Product2(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),LocalDate.parse(p.getLdtstr(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
	}
	
	public static ProductDto mapToProductDto(Product2 prod) {
		if(prod.getMfgdate()==null) {
			return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),null,prod.getCid());
		}
		return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),prod.getMfgdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),prod.getCid());
	}

}
