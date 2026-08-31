package com.example.amazon.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amazon.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
	 

}
