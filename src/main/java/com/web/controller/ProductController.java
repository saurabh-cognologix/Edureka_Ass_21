package com.web.controller;

import com.web.model.Product;
import com.web.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @PostMapping("/product/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product product1 = null;
        try {
            product1 = this.productServices.addProduct(product);
            return ResponseEntity.of(Optional.of(product1));
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    //get all the employee details
    @GetMapping("/product/get")
    public ResponseEntity<List<Product>> getAllProduct(){
        List<Product> productList =this.productServices.getAllProduct();
        if(productList.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else {
            return ResponseEntity.of(Optional.of(productList));
        }
    }
}
