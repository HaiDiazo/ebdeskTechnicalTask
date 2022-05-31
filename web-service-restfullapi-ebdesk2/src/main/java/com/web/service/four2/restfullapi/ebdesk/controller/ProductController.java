package com.web.service.four2.restfullapi.ebdesk.controller;

import com.web.service.four2.restfullapi.ebdesk.entity.Product;
import com.web.service.four2.restfullapi.ebdesk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;


    @PostMapping("/api/products")
    public Product addProduct(@RequestBody Product product) {

        return service.saveProduct(product);
    }

    @GetMapping("/api/products/{id_product}")
    public Product findByIdProduct(@PathVariable String id_product)
    {
        return service.getProductsById(id_product);
    }

    @PutMapping("/api/products/{id_product}")
    public Product updateProduct(@PathVariable String id_product,@RequestBody Product product)
    {
        return service.updateProduct(id_product, product);
    }

    @GetMapping("/api/products")
    public List<Product> getAllProducts()
    {
        return service.getListProduct();
    }

    @DeleteMapping("/api/product/{id_product}")
    public String deleteProduct(@PathVariable String id_product)
    {
        return service.deleteProduct(id_product);
    }

}
