package com.web.service.four2.restfullapi.ebdesk.repository;


import com.web.service.four2.restfullapi.ebdesk.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
