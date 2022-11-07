package com.web.services;

import com.web.dao.ProductRepo;
import com.web.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {
    @Autowired
    private ProductRepo productRepo;

    //adding product
    public Product addProduct(Product product){
        productRepo.save(product);
        return product;
    }

    //get all the product
    public List<Product> getAllProduct(){
        return this.productRepo.findAll();
    }

    //delete single student
    public void deleteSingleProduct(Integer productId) {
        productRepo.deleteById(productId);
    }


    public void updateProduct(Product product, Integer productId) {
        product.setProductId(productId);
        productRepo.save(product);
    }
}
