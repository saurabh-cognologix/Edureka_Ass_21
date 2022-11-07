package com.web.dao;

import com.web.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface ProductRepo extends JpaRepository<Product,Integer> {
}
