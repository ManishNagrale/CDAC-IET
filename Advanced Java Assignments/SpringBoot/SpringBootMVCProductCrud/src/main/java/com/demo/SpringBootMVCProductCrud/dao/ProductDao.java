package com.demo.SpringBootMVCProductCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootMVCProductCrud.beans.Product2;

@Repository
public interface ProductDao extends JpaRepository<Product2,Integer>{

}
