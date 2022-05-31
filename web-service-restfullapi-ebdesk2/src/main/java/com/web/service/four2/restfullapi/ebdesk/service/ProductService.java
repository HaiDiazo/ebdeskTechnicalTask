package com.web.service.four2.restfullapi.ebdesk.service;

import com.web.service.four2.restfullapi.ebdesk.entity.Product;
import com.web.service.four2.restfullapi.ebdesk.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repost;


    public Product saveProduct(Product product) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        product.setCreatedAt(java.sql.Date.valueOf(sdf.format(date)));
        product.setUpdateAt(java.sql.Date.valueOf(sdf.format(date)));

        if (repost.existsById(product.getId()))
        {
            System.out.println("Sudah ada!");
            return repost.findById(product.getId()).orElse(null);
        }else{
            return repost.save(product);
        }
    }

    public List<Product> getListProduct()
    {
        return repost.findAll();
    }

    public Product getProductsById(String id)
    {
        return repost.findById(id).orElse(null);
    }

    public Product updateProduct(String id_product, Product product) {
        Product existProduct = repost.findById(id_product).orElse(null);
        existProduct.setName(product.getName());
        existProduct.setPrice(product.getPrice());
        existProduct.setQuantity(product.getQuantity());

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        existProduct.setUpdateAt(java.sql.Date.valueOf(sdf.format(date)));

        return repost.save(existProduct);
    }

    public String deleteProduct(String id_product)
    {
        String nameProduct;

        Product existProduct = repost.findById(id_product).orElse(null);
        nameProduct = existProduct.getName();

        repost.deleteById(id_product);

        return "Delete product name: "+
                nameProduct + " with id: " + id_product;
    }

}
